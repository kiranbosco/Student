package com.io.spring;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentRepository extends  MongoRepository<Student,String>{
	
	List<Student> findByName(String name, Pageable pageable);

	List<Student> findByAge(String age, Pageable pageable);
	

}
