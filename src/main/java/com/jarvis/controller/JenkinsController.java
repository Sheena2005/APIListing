package com.jarvis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jarvis.service.JenkinsService;

@RestController
@RequestMapping("/jenkins")
public class JenkinsController {
	
	@Autowired(required=true)
	JenkinsService jenkinsService;
	
	@GetMapping("/test")
	public String test() {
		
		return "test success";
	}
	
	@GetMapping("/prodDeployCount")
	public int getProdDeploymentCount(String jobName, int limit) {
		return 0;
	}

}
