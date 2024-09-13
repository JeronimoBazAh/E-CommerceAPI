package com.bolsaideas.springboot.app.services;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.bolsaideas.springboot.app.models.Producto;

@Service
public interface IService extends JpaRepository<Producto, Long>{
	
	public Producto crear(Producto producto);

	public Producto actualizarProducto(Long id, Producto producto);

	public Producto obtenerProductoPorId(Long id);

	public Object noContent();

	public void eliminarProducto(Long id);
	

}
