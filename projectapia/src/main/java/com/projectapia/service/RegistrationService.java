package com.projectapia.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projectapia.entity.Registration;
import com.projectapia.repository.RegistrationRepository;

@Service
public class RegistrationService {
@Autowired
private RegistrationRepository registrationRepository;

public void saveRegistration(Registration registration) {
	registrationRepository.save(registration);
	
}

public List<Registration> getAllRegistration() {
	List<Registration>regs=registrationRepository.findAll();
	return regs;
}

public void deleteRegistration(long id) {
	registrationRepository.deleteById(id);
}

public Registration getRegistrationById(long id) {
	Registration reg=registrationRepository.findById(id).get();
	return reg;
}
}
