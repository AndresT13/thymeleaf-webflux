package com.jandres.springboot.webflux.models.services;

import com.jandres.springboot.webflux.documents.Categoria;
import com.jandres.springboot.webflux.documents.Producto;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ProductoService {

    public Flux<Producto> findAll();

    public Flux<Producto> findAllConNombreUpperCaseRepeat();

    public Mono<Producto> findById(String id);

    public Mono<Producto> save(Producto producto);

   public Mono<Void> delete(Producto producto);

   public Flux<Producto> findAllConNombreUpperCase();

    public Flux<Categoria> findAllCategoria();

    public Mono<Categoria> findByIdCategoria(String id);

    public Mono<Categoria> saveCategoria(Categoria categoria);

}
