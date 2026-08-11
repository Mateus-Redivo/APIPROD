package com.aos.productsapi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.aos.productsapi.dto.ProductDTO;
import com.aos.productsapi.mapper.ProductMapper;
import com.aos.productsapi.repository.ProductRepository;

// @Service registra essa classe como componente de serviço no Spring
// É aqui que fica a lógica de negócio da aplicação
@Service
public class ProductService {

    private final ProductRepository productRepository;

    // Injeção de dependência via construtor: o Spring injeta o repositório automaticamente
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

}