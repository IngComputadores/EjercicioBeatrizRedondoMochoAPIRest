package com.formacion.apirest.repository;

import org.springframework.data.repository.CrudRepository;

import com.formacion.apirest.entity.Producto;

public interface ProductRepository extends CrudRepository<Producto, Long>{

}
