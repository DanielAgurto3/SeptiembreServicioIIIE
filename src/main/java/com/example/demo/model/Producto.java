package com.example.demo.model;

public class Producto {
	
	private Integer idproducto;
	
	private String nombre;
	
	private String descripcion;
	
	private Double precio;
	
	private Integer stock;
	
	

	public Producto() {
		
	}

	public Producto(Integer idproducto, String nombre, String descripcion, Double precio, Integer stock) {
		
		this.idproducto = idproducto;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.precio = precio;
		this.stock = stock;
	}

	public Integer getIdproducto() {
		return idproducto;
	}

	public void setIdproducto(Integer idproducto) {
		this.idproducto = idproducto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public Integer getStock() {
		return stock;
	}

	public void setStock(Integer stock) {
		this.stock = stock;
	}
	
	

}
