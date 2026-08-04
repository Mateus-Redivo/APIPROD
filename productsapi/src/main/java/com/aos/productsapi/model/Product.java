package com.aos.productsapi.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

// @Entity diz ao JPA que essa classe representa uma 
// tabela no banco de dados
@Entity
// Define o nome da tabela que sera criada/usada no banco
@Table(name = "product")
public class Product {

    // @ID marca esse campo como chave primaria da tabela
    @Id
    // @GeneratedValue com IDENTITY indica
    // geracao de valor do tipo identidade
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // @Column configura a coluna: nullable = false significa que nao
    // pode ser nulo ( campo obrigatorio )
    @Column(nullable = false, length = 100)
    private String name;

    @Column(nullable = false, length = 255)
    private String description;

    @Column(nullable = false)
    private double value;

    @Column(nullable = false)
    private int quantity;

    // Construtor vazio para o JPA instanciar a classe internamente
    public Product() {

    }

    // Construtor usado para criar um novo produto ( sem ID: o banco gerencia)
    public Product(String name, String description, double value, int quantity) {
        this.name = name;
        this.description = description;
        this.value = value;
        this.quantity = quantity;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getValue() {
        return value;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Product{id = " + id + ", name = " + name +
                ", description = " + description + ", quantity" + quantity + "}";
    }

}
