package com.meruvia.ariesWS.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.meruvia.ariesWS.model.Personal;

@Repository
public interface PersonalRepository extends JpaRepository<Personal, Integer>{

	public abstract Personal findById(int id);
	
}
