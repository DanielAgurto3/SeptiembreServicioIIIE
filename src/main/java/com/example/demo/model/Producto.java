package com.example.demo.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;


@Entity
@Table(name = "producto")
public class Producto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idproducto;
	
	private String nombre;
	
	private String descripcion;
	
	private Double precio;
	
	private Integer stock;
	
	
	@ManyToMany(cascade = {CascadeType.MERGE})
	@JoinTable(
			name  = "producto_cliente",
			joinColumns = @JoinColumn(
					name ="idproducto",
					nullable = false,
					unique = true,
					foreignKey = @ForeignKey(foreignKeyDefinition = "foreign Key(idproducto) references producto(idproducto)")
					),
			inverseJoinColumns = @JoinColumn(
					name ="id_cliente",
					nullable = false,
					unique = true,
					foreignKey = @ForeignKey(foreignKeyDefinition = "foreign Key(id_cliente) references cliente(id_cliente)")
					)
			)
	private List<Cliente> clientes = new ArrayList<>();	
	

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
