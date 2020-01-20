package com.example.adpdatabaseadapter.repos;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.example.adpdatabaseadapter.dto.DataBaseInfo;

public abstract class AbstractAdapterRepo implements AdapterRepository {
	
	protected JdbcTemplate template;
	
	public AbstractAdapterRepo(DataBaseInfo dataBaseInfo ) {
		
		template = new JdbcTemplate(buildDataSource(dataBaseInfo));
		
	}
	
	protected  DataSource buildDataSource(DataBaseInfo dataBaseInfo) {
		
	
		
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
	    dataSource.setDriverClassName(dataBaseInfo.getDriverClassName());
	    dataSource.setUrl(dataBaseInfo.getJDBCUrl());
	    dataSource.setUsername(dataBaseInfo.getUserName());
	    dataSource.setPassword(dataBaseInfo.getPass());
	    return dataSource;
		
	
	}

	

}
