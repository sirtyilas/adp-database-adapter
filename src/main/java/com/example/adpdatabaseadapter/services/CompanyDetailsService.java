package com.example.adpdatabaseadapter.services;

import org.springframework.http.HttpHeaders;
import org.springframework.web.reactive.function.client.WebClient;

import com.example.adpdatabaseadapter.dto.DataBaseInfo;

import reactor.core.publisher.Mono;

public class CompanyDetailsService {
	

	private static CompanyDetailsService companyDetailsService;
    private final WebClient webClient;
    private static final String API_MIME_TYPE = "application/json";
    private static final String API_BASE_URL = "http://localhost:8086/";
    private static final String USER_AGENT = "ADP database connector";
	
	private CompanyDetailsService() {
		
		 this.webClient = WebClient.builder()
	                .baseUrl(API_BASE_URL)
	                .defaultHeader(HttpHeaders.CONTENT_TYPE, API_MIME_TYPE)
	                .defaultHeader(HttpHeaders.USER_AGENT, USER_AGENT)
	                .build();		
	}
	
	
	public static CompanyDetailsService getInstance() {
		
		if(companyDetailsService == null) {
			
			companyDetailsService = new CompanyDetailsService();
		}
		return companyDetailsService;		
		
	}
	
	
	
	public DataBaseInfo getDatabaseDetails(String companyId) {		

		Mono<DataBaseInfo> map = webClient.get().uri("/details/database/"+companyId).retrieve().bodyToMono(DataBaseInfo.class);
		return map.block();		
		
	}



}
