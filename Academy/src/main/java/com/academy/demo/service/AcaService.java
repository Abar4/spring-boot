package com.academy.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.academy.demo.model.AcademyModel;
import com.academy.demo.repository.AcaRepository;


@Service
public class AcaService {
 @Autowired
  AcaRepository rep;
  public List<AcademyModel> getAllDetails()
  {
	  return rep.findAll();
  }
  public AcademyModel savedet(AcademyModel aca)
  {
	   return rep.save(aca);
  }
	public List<AcademyModel> sortStudents(String name) 
	 {
		   return rep.findAll(Sort.by(name));
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
}

