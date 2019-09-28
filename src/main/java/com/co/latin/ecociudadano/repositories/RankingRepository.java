package com.co.latin.ecociudadano.repositories;

import com.co.latin.ecociudadano.model.ClientRanking;
import com.co.latin.ecociudadano.model.Ranking;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface RankingRepository extends CrudRepository<Ranking, Integer> {

    @Query("from client_ranking WHERE client_id=:client_id")
    List<ClientRanking> findByRankingByScore(@Param("score") Double score);
}
