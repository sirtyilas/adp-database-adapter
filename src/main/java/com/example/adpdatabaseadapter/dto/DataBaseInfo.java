package com.example.adpdatabaseadapter.dto;

public class DataBaseInfo {
	
	String driverClassname;
	String jdbcURL;
	String userName;
	String userPass;
	private String companyId;
	private String dbVersion;
	
	public DataBaseInfo(String driverClassname,String jdbcURL,String userName,String userPass,String companyId,String dbVersion) {
		
		this.driverClassname=driverClassname;
		this.jdbcURL=jdbcURL;
		this.userName=userName;
		this.userPass=userPass;
		this.setCompanyId(companyId);
		this.setDbVersion(dbVersion);
		
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
	public String getDbVersion() {
		return dbVersion;
	}
	public void setDbVersion(String dbVersion) {
		this.dbVersion = dbVersion;
	}
	public String getCompanyId() {
		return companyId;
	}
	public void setCompanyId(String companyId) {
		this.companyId = companyId;
	}

}
