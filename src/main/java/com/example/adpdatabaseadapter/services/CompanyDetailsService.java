package com.example.adpdatabaseadapter.services;

import com.example.adpdatabaseadapter.dto.DataBaseInfo;

public class CompanyDetailsService {
	

	private static CompanyDetailsService companyDetailsService;
	
	private CompanyDetailsService() {}
	
	
	public static CompanyDetailsService getInstance() {
		
		if(companyDetailsService == null) {
			
			companyDetailsService = new CompanyDetailsService();
		}
		return companyDetailsService;
		
		
	}
	
	
	
	public DataBaseInfo getDatabaseDetails(String companyId) {
		
		if(companyId.equals("6")){
			DataBaseInfo dbInfo= new DataBaseInfo("org.postgresql.Driver",
					"jdbc:postgresql://localhost:5432/V5_adp", "postgres", "postgres");
			return dbInfo;
			
		}
		else if(companyId.equals("7")) {
			
			DataBaseInfo dbInfo= new DataBaseInfo("org.postgresql.Driver",
					"jdbc:postgresql://localhost:5432/V6_adp", "postgres", "postgres");
			return dbInfo;
			
		}
		return null;
		
		
		
	}


	public String getDatabaseVersion(String companyId) {
		
		if(companyId.equals("6")){
		// TODO Auto-generated method stub
		return "V5";
		
		}
		else if(companyId.equals("7")) {
			
			return "V6";
			
		}
		return null;
	}

}
