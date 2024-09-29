package com.jandres.springboot.webflux.models.dao;

import com.jandres.springboot.webflux.documents.Categoria;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface CategoriaDao extends ReactiveMongoRepository<Categoria, String> {
}
