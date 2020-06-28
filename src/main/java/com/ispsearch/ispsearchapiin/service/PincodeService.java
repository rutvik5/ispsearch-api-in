package com.ispsearch.ispsearchapiin.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ispsearch.ispsearchapiin.model.Isp;
import com.ispsearch.ispsearchapiin.model.IspPincode;
import com.ispsearch.ispsearchapiin.model.Pincode;
import com.ispsearch.ispsearchapiin.repository.IspPincodeRepository;
import com.ispsearch.ispsearchapiin.repository.PincodeRepository;

@Service
public class PincodeService {

	@Autowired
	private PincodeRepository pincodeRepository;

	@Autowired
	private IspPincodeRepository ispPincodeRepository;
	
	@Autowired
	private IspService ispService;

	public List<Isp> getAllVerifiedProvidersForPincode(Integer pincodeValue) {
		List<Isp> isps = new ArrayList<>();
		Pincode pin = getPincodeByValue(pincodeValue);
		if (pin == null) {
			return isps;
		}
		List<Integer> ispIds = getIspIdFromPincode(pin);
		if(ispIds.isEmpty()) {
			return isps;
		}
		return ispService.getVerifiedIspsForListOfIspIds(ispIds);
		
	}

	private List<Integer> getIspIdFromPincode(Pincode pin) {
		List<IspPincode> ispPincodes = ispPincodeRepository.findByPincodeId(pin.getPincodeId());
		return ispPincodes.stream().map(ispPincode -> ispPincode.getIspId()).collect(Collectors.toList());
	}

	private Pincode getPincodeByValue(Integer pincodeValue) {
		return pincodeRepository.findByPin(pincodeValue).orElse(null);
	}

}
