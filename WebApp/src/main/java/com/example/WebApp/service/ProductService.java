package com.example.WebApp.service;

import com.example.WebApp.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    private final List<Product> products = new ArrayList<>(List.of(
            new Product(1000, "Iphone", 101),
            new Product(2000, "Samsung", 102),
            new Product(3000, "POCO", 103)
    ));

    public List<Product> getProducts() {
        return products;
    }

    public Product getProdByID(int id) {
        return products.stream()
                .filter(p -> p.getProdID() == id)
                .findFirst()
                .orElse(null);
    }

    public void addProduct(Product prod) {
        products.add(prod);
    }

    public void updateProduct(Product prod){
        int index = -1;
        for(int i = 0; i < products.size(); i++){
            if(products.get(i).getProdID() == prod.getProdID())
                    index = i;
        }
        products.set(index , prod);
    }

    public void deleteProduct(int prodID) {
        int index = -1;
        for(int i = 0; i < products.size(); i++){
            if(products.get(i).getProdID() == prodID)
                index = i;
        }
        products.remove(index);
    }
}

