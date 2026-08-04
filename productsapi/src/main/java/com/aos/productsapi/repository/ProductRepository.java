package com.aos.productsapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aos.productsapi.model.Product;

// @Repository marca essa interface como componente de acesso a dados no Spring
@Repository
// Extender JpaRepository ja fornece todos os metodos CRUD prontos:
// save(), findById(), findAll(), deleteById(), existsById(),entre outros
// O primeiro tipo generico é a entidade (Product), o segundo é o tipo do ID (Long)
public interface ProductRepository extends JpaRepository<Product, Long>{

} 
