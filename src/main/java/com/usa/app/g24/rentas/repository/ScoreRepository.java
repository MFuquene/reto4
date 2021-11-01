package com.usa.app.g24.rentas.repository;

import com.usa.app.g24.rentas.model.Score;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ScoreRepository extends CrudRepository<Score, Integer> {
}
