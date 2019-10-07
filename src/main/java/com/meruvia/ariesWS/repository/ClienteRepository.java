package com.meruvia.ariesWS.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.meruvia.ariesWS.model.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

	public List<Cliente> findAll();
	
	public abstract Cliente findById(int id);
	
}
