package com.example.demo.repository;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.example.demo.model.Producto;

@Repository
public class ProductoRepositoryImp implements ProductoRepository {

	
	List<Producto> almacenamiento = new ArrayList<>();
	
	@Override
	public void guardar(Producto producto) {
		almacenamiento.add(producto);

	}

	@Override
	public void actualizar(Producto producto) {
		Producto existe = obtener (producto.getIdproducto());
		eliminar(producto.getIdproducto());
		almacenamiento.add(producto);
		
	}

	@Override
	public void eliminar(Integer id) {
		Producto existe = obtener(id);
		almacenamiento.remove(existe);

	}

	@Override
	public List<Producto> listar() {
		// TODO Auto-generated method stub
		return almacenamiento;
	}

	@Override
	public Producto obtener(Integer id) {
		
		/*for(Producto producto : almacenamiento) {
			if(producto.getIdproducto() == id) {
				return producto;
			}
		}
		return null;*/
		return almacenamiento.stream().filter(p->p.getIdproducto() == id).findFirst().orElse(null);
	}

}
