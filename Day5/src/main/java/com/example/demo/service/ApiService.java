package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import com.example.demo.model.ModelClass;
import com.example.demo.repository.Repository;
@Service
public class ApiService {

	
	@Autowired
	Repository rep;
	public List<ModelClass> getDetails()
	{
		return rep.findAll();
	}
	
	public Optional<ModelClass> getbyId(@PathVariable int id)
	{
		return rep.findById(id);
	}
	
	public Boolean saveAll(ModelClass m)
	{
		if(rep.save(m)!=null)
		{
			return true;
		}
		else return false;
	}
	public Boolean deletebyid(int id)
	{
		 Optional<ModelClass> optional=rep.findById(id);
		  if(optional.isPresent())
		  {
			  rep.deleteById(id);
			  return true;
		  }
		  else
		  {
			  return false;
		  }
		 
	}
	public ModelClass updateDetails(int id)
	{
	  Optional<ModelClass> optional=rep.findById(id);
	  ModelClass obj=null;
	  if(optional.isPresent())
	  {
		  obj=optional.get();
		  rep.save(obj);
	  }
	  return obj;
	}

}
