package com.meruvia.ariesWS.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.meruvia.ariesWS.model.Personal;
import com.meruvia.ariesWS.repository.PersonalRepository;

@RestController
@RequestMapping("/aries")
public class PersonalController {

	@Autowired
	private PersonalRepository personalRepository;
	
	@GetMapping("/personal")
	public List<Personal> getAllPersonal(){
		return personalRepository.findAll();
	}
	
	@GetMapping("/personal/{id}")
	public Personal getPersonalById(@PathVariable(value = "id") int personalId) {
		Personal personal = personalRepository.findById(personalId);
		return personal;
	}
	
}
