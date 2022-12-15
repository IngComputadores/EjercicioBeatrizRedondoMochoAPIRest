package com.formacion.apirest.service;

import java.util.List;

import com.formacion.apirest.entity.Producto;


public interface ProductService {

	//metodo para mostrar todos los clientes
		public List<Producto> mostrarProducto();
		
		//metodo que busque cliente por id
		public Producto buscarProducto(long id);
		
		//metodo para crear un nuevo cliente
		public Producto guardarProducto(Producto producto);
		
		//metodo para borrar un cliente
		public Producto borrarProducto(long id);
		
}
