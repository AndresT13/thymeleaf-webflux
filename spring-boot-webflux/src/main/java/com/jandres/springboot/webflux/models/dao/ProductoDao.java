package com.jandres.springboot.webflux.models.dao;

import com.jandres.springboot.webflux.documents.Producto;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoDao extends ReactiveMongoRepository<Producto, String> {


}
