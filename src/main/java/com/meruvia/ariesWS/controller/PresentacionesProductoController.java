package com.meruvia.ariesWS.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.meruvia.ariesWS.model.PresentacionesProducto;
import com.meruvia.ariesWS.repository.PresentacionesProductoRepository;

@RestController
@RequestMapping("/aries")
public class PresentacionesProductoController {

	@Autowired
	private PresentacionesProductoRepository productoRepository;
	
	@GetMapping("/producto")
	public List<PresentacionesProducto> getAllProducto(){
		return productoRepository.findAll();
	}
	
	@GetMapping("/producto/{id}")
	public PresentacionesProducto getProductoById(@PathVariable(value = "id") int productId) {
		PresentacionesProducto producto = productoRepository.findById(productId);
		return producto;
	}
	
}
