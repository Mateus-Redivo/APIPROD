package com.aos.productsapi.mapper;

import org.springframework.stereotype.Component;

import com.aos.productsapi.dto.ProductDTO;
import com.aos.productsapi.model.Product;

// @Component registra essa interface no contexto do Spring (necessario para injecao de dependencias)
@Component
public interface ProductMapper {

        //Converte uma entidade Product em DTO para ser enviado como resposta da API
        static ProductDTO toDTO(Product product){
            return new ProductDTO(
                product.getId(),
                product.getName(),
                product.getDescription(),
                product.getValue(),
                product.getQuantity()
            );
        }

} 
