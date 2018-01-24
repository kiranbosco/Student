package com.io.spring;


import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

import javax.swing.event.TreeSelectionEvent;

import org.apache.commons.collections.map.HashedMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import ch.qos.logback.core.net.SyslogOutputStream;



@RestController
public class StudentController<SortArrayListAscendingDescending> {

	@Autowired
	private StudentRepository studentRepository;


	@RequestMapping(method=RequestMethod.POST,value="/getdata")
	public Student carInfo(@RequestBody Student student) {
		Student Student1=studentRepository.save(student);
		return Student1;


	}
	@RequestMapping(value = "/payments", method = RequestMethod.POST)
	public @ResponseBody List<Student> 
	batchCreate(@RequestBody List<Student> payments) {
		return studentRepository.save(payments);

	}
	@RequestMapping(value = "/getValue", method = RequestMethod.GET)
	public void run() throws IOException{
		List<Student>list=studentRepository.findByName("Heemaja",
				new PageRequest(0, 4,Direction.DESC,"name"));
		list.forEach(System.out::println);

	}
	@RequestMapping(value = "/getValues", method = RequestMethod.GET)
	public void runs() {
		List<Student>list1=studentRepository.findByAge("age",
				new PageRequest(0, 3,Direction.ASC,"age"));
		list1.forEach(System.out::println );
	}
}

//Comment on main Class

//Remove Comment on this class









