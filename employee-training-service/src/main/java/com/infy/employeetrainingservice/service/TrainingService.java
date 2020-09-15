package com.infy.employeetrainingservice.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infy.employeetrainingservice.model.Training;
import com.infy.employeetrainingservice.repository.TrainingRepository;

@Service
public class TrainingService {
	
	@Autowired
	TrainingRepository repository;
	
	public List<Training> getAllTrainings(){
		List<Training> training=new ArrayList<Training>();
		repository.findAll().forEach(training1->training.add(training1));
		return training;
		
	} 

}
