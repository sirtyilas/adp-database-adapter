package com.example.adpdatabaseadapter.dto;

public class DataBaseInfo {
	
	String driverClassname;
	String jdbcURL;
	String userName;
	String userPass;

	public DataBaseInfo(String driverClassname,String jdbcURL,String userName,String userPass) {
		
		this.driverClassname=driverClassname;
		this.jdbcURL=jdbcURL;
		this.userName=userName;
		this.userPass=userPass;
		
	}
	public String getDriverClassName() {

		return driverClassname;

	}

	public String getJDBCUrl() {

		return jdbcURL;

	}
	
	public String getUserName() {

		return userName;

	}
	
	public String getPass() {

		return userPass;

	}

}
