package com.cg.taineemanagement.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.taineemanagement.domain.Trainee;
import com.cg.taineemanagement.exception.TraineeIDException;
import com.cg.taineemanagement.repository.TraineeJpaRepository;



import java.util.List;
@Service
public class TraineeService {
	@Autowired
	private TraineeJpaRepository traineeRepo;

	public Iterable<Trainee> findAllTrainee() {
		return traineeRepo.findAll();
	}

	public Trainee findTraineeByName(String traineeName) {
		try {
		Trainee newTrainee= traineeRepo.findByTraineeName(traineeName);
		return newTrainee;
		}
		catch(Exception ex)
		{
			throw new TraineeIDException("Trainee Name "+ traineeName +" doesn't exists");
		}	
		}

	public Trainee findTraineeById(int traineeId) {
		Trainee newTrainee = traineeRepo.findByTraineeId(traineeId);
		if (newTrainee == null) {
			throw new TraineeIDException("Trainee Id " + traineeId + " does not exists");
		}
		return newTrainee;
	
			
	}
    public void deleteTraineeById(int traineeId)
    {
    	Trainee trainee=traineeRepo.findByTraineeId(traineeId);
    	if(trainee==null)
    	{
    		throw new TraineeIDException("Trainee Id " + traineeId +" does not exists");
    	}
    	traineeRepo.deleteById(traineeId);
    }
	public Trainee updateOnCriteria(int traineeId,Trainee trainee)
	{
		Trainee newtrainee=traineeRepo.findByTraineeId(traineeId);
    	if(newtrainee==null)
    	{
    		throw new TraineeIDException("Trainee Id " + traineeId +" does not exists");
    	}
    	BeanUtils.copyProperties(trainee, newtrainee, "traineeId");
    	return traineeRepo.save(trainee);
	}
	public Trainee createTrainee(Trainee trainee)
	{
		try {
		    trainee.setTraineeId(trainee.getTraineeId());
			return traineeRepo.save(trainee);
		}
		catch(TraineeIDException ex)
		{
			throw new TraineeIDException("Trainee Id " + trainee.getTraineeId() + " already available");
		}
		catch(Exception ex)
		{
			throw new TraineeIDException("Trainee Name " + trainee.getTraineeName() + " is not unique");
		}
		
	}
}
