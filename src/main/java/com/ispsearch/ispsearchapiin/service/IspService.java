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
import com.ispsearch.ispsearchapiin.utils.ISPSearchUtils;

@Service
public class IspService {

	@Autowired
	private IspRepository ispRepository;

	@Autowired
	private StateService stateService;

	@Autowired
	private CityService cityService;

	@Autowired
	private PincodeService pincodeService;

	public List<IspDTO> getAllVerifiedProviders() {
		List<IspDTO> providers = new ArrayList<>();
		List<Isp> isps = getAllVerifiedProvidersFromDatabase();
		populateProviderListFromIspList(providers, isps);
		return providers;
	}

	public List<IspDTO> getAllVerifiedProvidersForValidPincode(String pincode) {
		List<IspDTO> providers = new ArrayList<>();
		if (ISPSearchUtils.isNotValidPincode(pincode)) {
			return providers;
		}
		Integer pincodeValue = Integer.parseInt(pincode);
		List<Isp> isps = getAllVerifiedProvidersForPincodeFromDatabase(pincodeValue);
		populateProviderListFromIspList(providers, isps);
		return providers;
	}

	private List<Isp> getAllVerifiedProvidersForPincodeFromDatabase(Integer pincodeValue) {
		return pincodeService.getAllVerifiedProvidersForPincode(pincodeValue);
	}

	private IspDTO getIspDTOFromIsp(Isp isp) {
		IspDTO ispDTO = new IspDTO();
		ispDTO.setId(isp.getIspId().toString());
		ispDTO.setName(isp.getIspName());
		ispDTO.setLocation(getLocationFromCityIdAndStateId(isp.getIspCityId(), isp.getIspStateId()));
		// TODO ANJANEYA
		ispDTO.setUserLikes(0);
		return ispDTO;
	}

	private String getLocationFromCityIdAndStateId(Integer cityId, Integer stateId) {
		State state = stateService.getStateById(stateId);
		City city = cityService.getCity(cityId);
		if (city != null && state != null) {
			return city.getCityName() + ", " + state.getStateName();
		} else {
			return null;
		}
	}

	private List<Isp> getAllVerifiedProvidersFromDatabase() {
		return ispRepository.findByIsVerified(true);
	}

	private void populateProviderListFromIspList(List<IspDTO> providers, List<Isp> isps) {
		for (Isp isp : isps) {
			IspDTO ispDTO = getIspDTOFromIsp(isp);
			providers.add(ispDTO);
		}
	}

	public List<Isp> getVerifiedIspsForListOfIspIds(List<Integer> ispIds) {
		return ispRepository.findByIspIdInAndIsVerified(ispIds, true);
	}
}
