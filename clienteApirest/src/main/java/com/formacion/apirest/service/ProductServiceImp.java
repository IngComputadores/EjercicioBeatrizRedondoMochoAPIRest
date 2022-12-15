package com.formacion.apirest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.formacion.apirest.entity.Producto;
import com.formacion.apirest.repository.ProductRepository;

@Service
public class ProductServiceImp implements ProductService {

	
	@Autowired
	ProductRepository productoRespositorio;
	
	@Override
	@Transactional(readOnly = true)
	public List<Producto> mostrarProducto() {
		return (List<Producto>) productoRespositorio.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Producto buscarProducto(long id) {
		return productoRespositorio.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public Producto guardarProducto(Producto producto) {
		return productoRespositorio.save(producto);
	}

	@Override
	@Transactional
	public Producto borrarProducto(long id) {
		Producto productoBorrado = buscarProducto(id);
		productoRespositorio.deleteById(id);
		return productoBorrado;
	}

}
