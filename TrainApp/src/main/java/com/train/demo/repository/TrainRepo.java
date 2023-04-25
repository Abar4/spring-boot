package com.train.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.train.demo.model.TrainModel;

public interface TrainRepo extends JpaRepository<TrainModel,Integer>{

}
