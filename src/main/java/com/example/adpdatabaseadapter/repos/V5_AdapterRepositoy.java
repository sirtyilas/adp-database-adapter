package com.example.adpdatabaseadapter.repos;

import java.util.List;
import com.example.adpdatabaseadapter.dto.DataBaseInfo;
import com.example.adpdatabaseadapter.dto.Employee;


public class V5_AdapterRepositoy extends  AbstractAdapterRepo {
	
	
	
	

	public V5_AdapterRepositoy(DataBaseInfo dataBaseInfo) {
		
		super(dataBaseInfo);		
	}
	
	@Override
	public List<Employee> findAllEmployees() {
		
		String sql = "SELECT firstname, surname, idnumber	FROM public.\"Employees\";";		
		return template.query(
                sql,
                (rs, rowNum) ->
                        new Employee(                                
                                rs.getString("firstname"),
                                rs.getString("surname"),
                                rs.getString("idnumber")
                        )
        );		
		
	}		
	}


	
	
	


