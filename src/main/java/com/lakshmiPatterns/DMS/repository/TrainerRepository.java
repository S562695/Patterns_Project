package com.lakshmiPatterns.DMS.repository;

import org.springframework.data.repository.CrudRepository;

import com.lakshmiPatterns.DMS.Models.Trainer;

public interface TrainerRepository extends CrudRepository<Trainer, Integer> {
	 
}
