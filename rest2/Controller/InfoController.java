package com.restassignment2.rest2.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.restassignment2.rest2.entities.zipsInfo;
import com.restassignment2.rest2.services.zipInfoService;

@RestController
public class InfoController {
	
	@Autowired
	private zipInfoService zipInfoService;
	
	
	@GetMapping("/zips")
	public List<zipsInfo> getInfo()
	{
		return this.zipInfoService.getZips();
	}
	
	
	@GetMapping("/zips/{zip}")
	public zipsInfo getzipInfo(@PathVariable String zip)
	{
		return this.zipInfoService.
				getZips(Long.parseLong(zip));
	}

}
