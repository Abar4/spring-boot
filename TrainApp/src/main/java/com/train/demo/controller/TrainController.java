package com.train.demo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.train.demo.model.TrainModel;
import com.train.demo.service.TrainService;

@RestController
public class TrainController {
    @Autowired
    TrainService ts;
    @PostMapping(value="/traindata")
    public TrainModel saveDetails(@RequestBody TrainModel obj)
    {
    	return ts.saveDetails(obj);
    }
    @GetMapping(value="/fetchdata/{trainNum}")
    public Optional<TrainModel> getDetails(@PathVariable("trainNum") int trainNum)
    {
    	return ts.getDetails(trainNum);
    }
    @PutMapping(value="/updatedata")
    public TrainModel updateDetails(@RequestBody TrainModel obj)
    {
    	return ts.updateDetails(obj);
    }
    @DeleteMapping(value="/delete/{trainNum}")
    public String deleteDetails(@PathVariable("trainNum") int trainNum)
    {
    	ts.deleteDetails(trainNum);
    	return "Deletion was successfull!";
    }
    
}
