package com.restassignment2.rest2.services;

import java.util.List;

import com.restassignment2.rest2.entities.zipsInfo;

public interface zipInfoService {
	
	public List<zipsInfo> getZips();

	public zipsInfo getZips(long zip);

}
