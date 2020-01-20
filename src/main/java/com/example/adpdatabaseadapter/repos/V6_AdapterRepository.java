package com.example.adpdatabaseadapter.repos;

import java.util.List;

import com.example.adpdatabaseadapter.dto.DataBaseInfo;
import com.example.adpdatabaseadapter.dto.Employee;

public class V6_AdapterRepository extends  AbstractAdapterRepo{

	public V6_AdapterRepository(DataBaseInfo dataBaseInfo) {
		super(dataBaseInfo);
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Employee> findAllEmployees() {
		String sql = "SELECT firstname, lastname, idnumber	FROM public.\"Employee\";";		
		return template.query(
                sql,
                (rs, rowNum) ->
                        new Employee(                                
                                rs.getString("firstname"),
                                rs.getString("lastname"),
                                rs.getString("idnumber")
                        )
        );	
	}

}
