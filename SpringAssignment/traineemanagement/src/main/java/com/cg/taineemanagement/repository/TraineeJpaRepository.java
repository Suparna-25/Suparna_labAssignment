package com.cg.taineemanagement.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cg.taineemanagement.domain.Trainee;
@Repository
public interface TraineeJpaRepository extends CrudRepository<Trainee, Integer>{

	Trainee findByTraineeName(String traineeName);

	Trainee findByTraineeId(int traineeId);

		

}
