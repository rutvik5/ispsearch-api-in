package com.ispsearch.ispsearchapiin.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ispsearch.ispsearchapiin.model.State;
import com.ispsearch.ispsearchapiin.repository.StateRepository;

@Service
public class StateService {
	
	@Autowired
	private StateRepository stateRepository;
	
	public State getStateById(Integer stateId) {
		Optional<State> state = stateRepository.findById(stateId);
		return state.orElse(null);
	}

}
