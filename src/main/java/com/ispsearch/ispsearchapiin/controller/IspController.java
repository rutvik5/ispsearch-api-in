package com.ispsearch.ispsearchapiin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ispsearch.ispsearchapiin.dto.IspDTO;
import com.ispsearch.ispsearchapiin.dto.MessageDTO;
import com.ispsearch.ispsearchapiin.service.IspService;

@RestController
public class IspController {
	
	@Autowired
	private IspService ispService;
	
	@GetMapping("/providers")
	public List<IspDTO> getAllProviders(){
		return ispService.getAllVerifiedProviders();
	}
	
	@GetMapping("/providers/pincode/{pincode}")
	public List<IspDTO> getAllProvidersForPincode(@PathVariable("pincode") String pincode){
		return ispService.getAllVerifiedProvidersForValidPincode(pincode);
	}
	
	@GetMapping("/providers/verify/{ispId}")
	public MessageDTO verifyIsp(@PathVariable("ispId") String ispId) {
		return ispService.verifyIsp(ispId);
	}

}
