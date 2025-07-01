package com.example.WebApp.service;

import com.example.WebApp.model.Product;
import com.example.WebApp.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    @Autowired
    ProductRepo repo;

//    private final List<Product> products = new ArrayList<>(List.of(
//            new Product(1000, "Iphone", 101),
//            new Product(2000, "Samsung", 102),
//            new Product(3000, "POCO", 103)
//    ));

    public List<Product> getProducts() {
        return repo.findAll();
    }

    public Product getProdByID(int id) {
        return repo.findById(id).orElse(null);
    }

    public void addProduct(Product prod) {
        repo.save(prod);
    }

    public void updateProduct(Product prod){
       repo.save(prod);
    }

    public void deleteProduct(int prodID) {
       repo.deleteById(prodID);
    }
}

