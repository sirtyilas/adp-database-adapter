package com.example.adpdatabaseadapter.repos;

import java.util.List;


import com.example.adpdatabaseadapter.dto.Employee;

public interface AdapterRepository {	
	
	public List<Employee> findAllEmployees();

	

}
