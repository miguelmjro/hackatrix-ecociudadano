package com.co.latin.ecociudadano.controller;

import com.co.latin.ecociudadano.model.ClientRanking;
import com.co.latin.ecociudadano.model.GarbageTransaction;
import com.co.latin.ecociudadano.repositories.ClientRankingRepository;
import com.co.latin.ecociudadano.repositories.GarbageTransactionRepository;
import com.co.latin.ecociudadano.repositories.RankingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;
import java.util.ArrayList;
import java.util.List;

@CrossOrigin
@RestController
public class GarbageTransactionController {
    @Autowired
    GarbageTransactionRepository garbageTransactionRepository;
    @Autowired
    ClientRankingRepository clientRankingRepository;
    @Autowired
    RankingRepository rankingRepository;

    @PostMapping(value = "/postTransaction")
    public List<GarbageTransaction> getUser(@RequestBody GarbageTransaction transaction) {
        List<GarbageTransaction> lstTransactions = new ArrayList<GarbageTransaction>();
        ClientRanking clientRanking;
        List<ClientRanking> rankings = clientRankingRepository.findByRankingByClientId(transaction.getClientId().getId());
        if(rankings == null || rankings.isEmpty()){
            clientRanking = new ClientRanking();
            clientRanking.setClientId(transaction.getClientId());
            clientRanking.setScore(transaction.getPoint());
        }else {
            clientRanking = rankings.get(0);
            clientRanking.setScore(clientRanking.getScore() + transaction.getPoint());
        }



        clientRankingRepository.save(clientRanking);

        garbageTransactionRepository.saveAll(lstTransactions);

        return lstTransactions;
    }
}
