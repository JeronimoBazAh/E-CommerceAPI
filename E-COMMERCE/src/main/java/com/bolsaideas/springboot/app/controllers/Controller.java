package com.bolsaideas.springboot.app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bolsaideas.springboot.app.models.Producto;
import com.bolsaideas.springboot.app.services.IService;

@RestController
@RequestMapping("/api/productos")
public class Controller {
	
	@Autowired
	private IService service;
	
	@GetMapping
	public List<Producto> findAll(){
		return service.findAll();
		
	}
	
	@PostMapping
	public Producto crear(@RequestBody Producto producto) {
		return service.crear(producto);
	}
	

    @GetMapping("/{id}")
    public Producto obtenerProductoPorId(@PathVariable Long id) {
        return service.obtenerProductoPorId(id);
    }

    @PutMapping("/{id}")
    public Producto actualizarProducto(@PathVariable Long id, @RequestBody Producto producto) {
        return service.actualizarProducto(id, producto);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarProducto(@PathVariable Long id) {
    	service.eliminarProducto(id);
        return ResponseEntity.noContent().build();
    }
	
	
	

	
	
}
