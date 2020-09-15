package com.infy.employeetrainingservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infy.employeetrainingservice.model.Training;
import com.infy.employeetrainingservice.model.TrainingIdentity;



public interface TrainingRepository extends JpaRepository<Training,TrainingIdentity>{


	List<Training> getTrainingByStatus(String status);


}
