package com.example.adpdatabaseadapter.repos;

import org.springframework.stereotype.Component;

import com.example.adpdatabaseadapter.dto.DataBaseInfo;
import com.example.adpdatabaseadapter.services.CompanyDetailsService;

@Component
public class AdapterRepoFactory {
	
	
	public AdapterRepository getRepositoy(String CompanyId){
		
		CompanyDetailsService detailsService = CompanyDetailsService.getInstance();
		DataBaseInfo databaseDetails = detailsService.getDatabaseDetails(CompanyId);

		
		if(databaseDetails.getDbVersion().equals("V5")) {			
			return new V5_AdapterRepositoy(databaseDetails);
		}
		if(databaseDetails.getDbVersion().equals("V6")) {			
			return new V6_AdapterRepository(databaseDetails);
		}
		return null;
		
		
	}

}
