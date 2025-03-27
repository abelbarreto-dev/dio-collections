package edu.set.store.core;

import edu.set.store.model.Product;

import java.util.Set;

public interface StoreInterface {
    void addNewProduct(Long code, String name, double price, int quantity);
    Set<Product> orderProductsByName();
    Set<Product> orderProductsByPrice();
}
