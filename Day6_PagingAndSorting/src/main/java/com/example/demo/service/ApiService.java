package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.model.Child;
import com.example.demo.repository.ChildRepo;


@Service
public class ApiService {

	@Autowired
	ChildRepo rep;
	public Boolean saveAll(Child m)
	{
		if(rep.save(m)!=null)
		{
			return true;
		}
		else return false;
	}
	
	 public List<Child> sorting(String name) 
	 {
		   return rep.findAll(Sort.by(name));
	 } 
	 public List<Child> paginging(int offset,int pageSize) 
	 {
		   Pageable paging=PageRequest.of(offset,pageSize);
		   Page<Child> studData=rep.findAll(paging);
		   List<Child>studList=studData.getContent(); 
		   return studList;
	 }
	 public List<Child> PagingAndSorting(int offset,int pageSize,String field)
	 {
		 Pageable paging =PageRequest.of(offset, pageSize).withSort(Sort.by(field));
		 Page<Child> stud=rep.findAll(paging);
		 return stud.getContent();
	 }
	
}
