package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Producto;
import com.example.demo.repository.ProductoRepository;

@Service
public class ProductoServiceImpl implements ProductoService {

	
	private ProductoRepository repository;
	
	@Override
	public void guardar(Producto producto) {
		// TODO Auto-generated method stub
		repository.guardar(producto);

	}

	@Override
	public void actualizar(Producto producto) {
		// TODO Auto-generated method stub
		repository.actualizar(producto);

	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		repository.eliminar(id);

	}

	@Override
	public List<Producto> listar() {
		// TODO Auto-generated method stub
		return repository.listar();
	}

	@Override
	public Producto obtener(Integer id) {
		// TODO Auto-generated method stub
		return repository.obtener(id);
	}

}
