package com.restassignment2.rest2.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.restassignment2.rest2.entities.zipsInfo;

@Service
public class ZipServiceImpl implements zipInfoService {
	
	List<zipsInfo> list;
	
	
	public ZipServiceImpl()
	{
		list = new ArrayList<>();
		list.add(new zipsInfo(210,"Jaipur","Rajasthan","India"));
		list.add(new zipsInfo(220,"Saharanpur","Uttar Pradesh","India"));
		list.add(new zipsInfo(230,"Pune","Maharashtra","India"));
		list.add(new zipsInfo(240,"Ranchi","Jharkhand","India"));
		
	}

	@Override
	public List<zipsInfo> getZips() {
	
		return list;
	}

	@Override
	public zipsInfo getZips(long zip) {
		
		zipsInfo z = null;
		for (zipsInfo zipsInfo : list) 
		{
			if(zipsInfo.getZip()==zip)
			{
				z=zipsInfo;
				break;
			}
		}
		
		return z;
	}

}
