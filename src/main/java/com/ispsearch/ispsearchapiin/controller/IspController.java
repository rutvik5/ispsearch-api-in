package com.ispsearch.ispsearchapiin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ispsearch.ispsearchapiin.dto.IspDTO;
import com.ispsearch.ispsearchapiin.service.IspService;

@RestController
public class IspController {
	
	@Autowired
	private IspService ispService;
	
	@GetMapping("/providers")
	public List<IspDTO> getAllProviders(){
		return ispService.getAllProviders();
	}

}
