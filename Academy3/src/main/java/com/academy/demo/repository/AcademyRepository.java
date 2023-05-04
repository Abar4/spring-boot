package com.academy.demo.repository;

import org.springframework.stereotype.Repository;

import com.academy.demo.model.AcademyModel;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
@Repository
public interface AcademyRepository extends JpaRepository <AcademyModel,Integer>{
	
	
	//DERIVED QUERY
	AcademyModel findByFirstname(String firstname);
	
	//DML QUERY
	@Modifying
	@Query("delete from AcademyModel s where s.lastname=?1" )
	public int deleteByLastname(String lastname);
	
	@Modifying
	@Query("update AcademyModel s set s.lastname=?1 where s.firstname=?2")
	public int updateByFirstname(String lastname,String firstname);
	
	//SELECT QUERY
	@Query("select s from AcademyModel s where s.admissionid=:admissionid")
	public List<AcademyModel> getByAdmissionid(int admissionid);

}
