package com.example.adpdatabaseadapter.dto;

public class DataBaseInfo {
	
	private String driverClassname;
	private String jdbcURL;
	private String userName;
	private String userPass;
	private String companyId;
	private String dbVersion;
	
	public DataBaseInfo() {}
	
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

	public String getDriverClassname() {
		return driverClassname;
	}

	public void setDriverClassname(String driverClassname) {
		this.driverClassname = driverClassname;
	}

	public String getJdbcURL() {
		return jdbcURL;
	}

	public void setJdbcURL(String jdbcURL) {
		this.jdbcURL = jdbcURL;
	}

	public String getUserPass() {
		return userPass;
	}

	public void setUserPass(String userPass) {
		this.userPass = userPass;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

}
