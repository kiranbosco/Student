package com.io.spring;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

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
	public List<Student>sendAllData=Arrays.asList(
			new Student(100, "10", "John", "96385274"),
			new Student(101, "11", "Peter", "963852741"),
			new Student(102, "12", "Mathew", "85296374"),
			new Student(103, "13", "Issac", "85274"),
			new Student(104, "14", "Abraham", "452548"),
			new Student(105, "15", "Ruth", "4526665"),
			new Student(106, "16", "Mery", "4525444"),
			new Student(107, "17", "Blesey", "7418596"),
			new Student(108, "13", "Issac", "85274"),
			new Student(109, "13", "Issac", "85274"),
			new Student(110, "13", "Issac", "85274"),
			new Student(111 ,"13", "Issac", "85274"));

			
@RequestMapping(value = "/payments123", method = RequestMethod.POST)
	public List<Student>getAllStudent(){
		return studentRepository.save(sendAllData);

}
@RequestMapping(value = "/findAll", method = RequestMethod.GET)
public List<Student>getAllData(){
	List<Student> student=new ArrayList<>();
	studentRepository.findAll().forEach(student :: add);
	return sendAllData;
	
}
@RequestMapping(value = "/{id}", method = RequestMethod.GET)
public List<Student> getSingleValue(@PathVariable int id) {
	return studentRepository.findById(id);		
}
public List<Student>findByName(String name ,PageRequest pageable){
	return studentRepository.findByName(name,  pageable);
	
}
}










