package com.io.spring;

import java.util.List;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentRepository extends  MongoRepository<Student,String>{
	
	List<Student> findById(int id);

	List<Student> findByName(String string, PageRequest pageRequest);
	

	
	
	

}
