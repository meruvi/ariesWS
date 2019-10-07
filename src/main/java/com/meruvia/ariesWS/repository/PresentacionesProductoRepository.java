package com.meruvia.ariesWS.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.meruvia.ariesWS.model.PresentacionesProducto;

@Repository
public interface PresentacionesProductoRepository extends JpaRepository<PresentacionesProducto, Integer>{

	public abstract List<PresentacionesProducto> findAll();
	
	public abstract PresentacionesProducto findById(int id);

	
}
