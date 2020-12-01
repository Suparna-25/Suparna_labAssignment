package com.cg.taineemanagement.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.taineemanagement.domain.Trainee;
import com.cg.taineemanagement.service.MapValidationErrorService;
import com.cg.taineemanagement.service.TraineeService;






@RestController
@RequestMapping("/api/TraineeManagement")
public class TraineeController {

	@Autowired
	private TraineeService traineeService;
	@Autowired
	private MapValidationErrorService mapValidateErrorService;

	@PostMapping("")
	public ResponseEntity<?> createNewProject(@Valid @RequestBody Trainee trainee, BindingResult result) {
		ResponseEntity<?> errorMap = mapValidateErrorService.mapValidationError(result);
		if (errorMap != null)
			return errorMap;
		Trainee newTrainee = traineeService.createTrainee(trainee);
		return new ResponseEntity<Trainee>(newTrainee, HttpStatus.CREATED);
	
	}
	@GetMapping
	@RequestMapping("/{traineeId}")
	public ResponseEntity<?> getTraineeByTraineeId(@PathVariable int traineeId)
	{
		return new ResponseEntity<Trainee>(traineeService.findTraineeById(traineeId),HttpStatus.OK);
	}
	@GetMapping
	@RequestMapping("/name/{traineeName}")
	public ResponseEntity<?> getTraineeByTraineeName(@PathVariable String traineeName)
	{
		return new ResponseEntity<Trainee>(traineeService.findTraineeByName(traineeName),HttpStatus.OK);
	}
	@PutMapping("/{traineeId}")
	public ResponseEntity<?> updateTrainee(@PathVariable int traineeId,@RequestBody Trainee trainee){
		
		return new ResponseEntity<Trainee> (traineeService.updateOnCriteria(traineeId,trainee),HttpStatus.OK);
	}
	@GetMapping("/all")
	public Iterable<Trainee> getAllTrainees(){
		return traineeService.findAllTrainee();
	}
	@DeleteMapping("/{traineeId}")
	public ResponseEntity<?> deleteTrainee(@PathVariable int traineeId){
		traineeService.deleteTraineeById(traineeId);
		return new ResponseEntity<String> ("Trainee with Id : "+ traineeId +" Deleted!",HttpStatus.OK);
	}
}
