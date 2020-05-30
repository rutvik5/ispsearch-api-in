package com.ispsearch.ispsearchapiin.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ispsearch.ispsearchapiin.dto.IspDTO;
import com.ispsearch.ispsearchapiin.model.City;
import com.ispsearch.ispsearchapiin.model.Isp;
import com.ispsearch.ispsearchapiin.model.State;
import com.ispsearch.ispsearchapiin.repository.IspRepository;

@Service
public class IspService {
	
	@Autowired
	private IspRepository ispRepository;
	
	@Autowired
	private StateService stateService;
	
	@Autowired
	private CityService cityService;
	
	public List<IspDTO> getAllProviders(){
		List<IspDTO> providers = new ArrayList<>();
		List<Isp> isps = ispRepository.findAll();
		for(Isp isp : isps) {
			IspDTO ispDTO = getIspDTOFromIsp(isp);
			providers.add(ispDTO);
		}
		return providers;
	}

	private IspDTO getIspDTOFromIsp(Isp isp) {
		IspDTO ispDTO = new IspDTO();
		ispDTO.setId(isp.getIspId().toString());
		ispDTO.setName(isp.getIspName());
		ispDTO.setLocation(getLocationFromCityIdAndStateId(isp.getIspCityId(), isp.getIspStateId()));
		//TODO ANJANEYA
		ispDTO.setUserLikes(0);
		return ispDTO;
	}
	
	private String getLocationFromCityIdAndStateId(Integer cityId, Integer stateId) {
		State state = stateService.getStateById(stateId);
		City city = cityService.getCity(cityId);
		if(city != null && state != null) {
			return city.getCityName() + ", " + state.getStateName();
		}
		else {
			return null;
		}
	}

}
