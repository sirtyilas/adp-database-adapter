package com.example.adpdatabaseadapter.controllers;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.adpdatabaseadapter.dto.Employee;
import com.example.adpdatabaseadapter.repos.AdapterRepoFactory;
import com.example.adpdatabaseadapter.repos.AdapterRepository;

@RestController
@RequestMapping("/data")
public class AdapterController {
	
	@Autowired
	private AdapterRepoFactory factory;
	
	@RequestMapping("/{companyId}/employees")
	public List<Employee> getEmployees(@PathVariable("companyId")String companyId){	
		
		AdapterRepository repository = factory.getRepositoy(companyId);
		return repository.findAllEmployees();	
		
	}


}
