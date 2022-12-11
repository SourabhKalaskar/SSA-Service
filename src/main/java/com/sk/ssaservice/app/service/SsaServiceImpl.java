package com.sk.ssaservice.app.service;

import org.springframework.stereotype.Service;

@Service
public class SsaServiceImpl implements SsaService {

	@Override
	public String getStateName(String ssnNo) {
		String stateName=null;

		if(ssnNo.startsWith("1")) {
			stateName= "New Jersey";
		}
		else if (ssnNo.startsWith("2")) {
			stateName= "Rhode Island";
		}
		else if (ssnNo.startsWith("3")) {
			stateName= "Kentucky";
		}
		else if (ssnNo.startsWith("4")) {
			stateName= "Ohio";
		}
		else {
			stateName="Invalid SSN";
		}
		return stateName;
	}

}
