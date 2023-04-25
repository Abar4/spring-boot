package com.train.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.train.demo.model.TrainModel;
import com.train.demo.repository.TrainRepo;

@Service
public class TrainService {

	@Autowired
	TrainRepo tr;
	public TrainModel saveDetails(TrainModel tt)
	{
		TrainModel obj=tr.save(tt);
	    return obj;
	}
	public Optional<TrainModel> getDetails(int trainNum)
	{
		return tr.findById(trainNum);
	}
	public TrainModel updateDetails(TrainModel tt)
	{
		TrainModel obj1=tr.saveAndFlush(tt);
		return obj1;
	}
	public void deleteDetails(int trainNum)
	{
		tr.deleteById(trainNum);
	}
}
