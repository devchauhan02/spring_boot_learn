package com.example.WebApp.model;

public class Product {
    private int prodID;
    private String prodName;
    private int price;

    public Product(){

    }

    public Product(int price, String prodName, int prodID) {
        this.price = price;
        this.prodName = prodName;
        this.prodID = prodID;
    }

    public int getProdID() {
        return prodID;
    }

    public void setProdID(int prodID) {
        this.prodID = prodID;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "prodID=" + prodID +
                ", prodName='" + prodName + '\'' +
                ", price=" + price +
                '}';
    }
}
