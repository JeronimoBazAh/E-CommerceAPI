package com.bolsaideas.springboot.app.models;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Producto {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
	private String descripcion;
	private Double precio;
	private Integer stock;
	
	@ManyToOne
	private Categoria categoria;
	
	
	


	
	

}
