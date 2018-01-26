package com.io.spring;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;

@SpringBootApplication
@EnableAutoConfiguration
@RefreshScope
public class StudentDataApplication  implements CommandLineRunner{

	@Autowired
	StudentRepository studentRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(StudentDataApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	
	List<Student> list =studentRepository.findByName("Issac",
			new PageRequest(0, 3, Direction.ASC, "name"));
	list.forEach(System.out::println);
		
	}
}
