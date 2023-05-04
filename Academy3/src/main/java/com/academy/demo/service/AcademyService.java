package com.academy.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.academy.demo.model.AcademyModel;
import com.academy.demo.repository.AcademyRepository;


import jakarta.transaction.Transactional;



@Service
public class AcademyService {
	
   @Autowired
   AcademyRepository rep;
   
	public List<AcademyModel> sortStudents(String name) 
	 {
		   return rep.findAll(Sort.by(Direction.DESC,name));
	 } 
	 public List<AcademyModel> pagingStudents(int offset,int pageSize) 
	 {
		   Pageable paging=PageRequest.of(offset,pageSize);
		   Page<AcademyModel> studData=rep.findAll(paging);
		   List<AcademyModel>studList=studData.getContent(); 
		   return studList;
	 }
	 public List<AcademyModel> PagingAndSorting(int offset,int pageSize,String field)
	 {
		 Pageable paging =PageRequest.of(offset, pageSize).withSort(Sort.by(field));
		 Page<AcademyModel> stud=rep.findAll(paging);
		 return stud.getContent();
	 }

//one-to-one relation
   public List<AcademyModel> fetchAllDetails()
   {
	  return  rep.findAll();
   }  

   public  AcademyModel saveAllDetails(@RequestBody AcademyModel obj)
   {
	 return rep.save(obj);
   }
   
   //derived query
   public AcademyModel fetchByFirstname(String fitrstname)
   {
  	   return rep.findByFirstname(fitrstname);
   }
   
   //DML query
   @Transactional
   public int deleteLastname(String lastname)
   {
   	return rep.deleteByLastname(lastname);
   } 
   
   @Transactional
   public int updateLastname(String lastname,String firstname)
   {
   	return rep.updateByFirstname(lastname, firstname);
   } 
   
   //select query
   public List<AcademyModel> fetchbyId(int admissionid)
   {
  	   return rep.getByAdmissionid(admissionid);
   }
   

}
