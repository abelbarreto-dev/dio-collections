package edu.set.store.core;

import edu.set.store.model.Product;
import edu.set.store.util.ProductByName;
import edu.set.store.util.ProductByPrice;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Store implements StoreInterface {
    private final Set<Product> products;

    public Store() {
        this.products = new HashSet<>();
    }

    protected Set<Product> getProducts() {
        return products;
    }

    @Override
    public void addNewProduct(Long code, String name, double price, int quantity) {
        var product = new Product(code, name, price, quantity);

        if (this.getProducts().add(product))
            System.out.println("success: product added to store.");
        else
            throw new RuntimeException("error: product with this code has ever added.");
    }

    @Override
    public Set<Product> orderProductsByName() {
        Set<Product> productsByName = new TreeSet<>(new ProductByName());

        if (!this.getProducts().isEmpty()) {
            productsByName.addAll(this.getProducts());
            return productsByName;
        }

        throw new RuntimeException("error: this products set is empty.");
    }

    @Override
    public Set<Product> orderProductsByPrice() {
       Set<Product> productsByPrice =  new TreeSet<>(new ProductByPrice());

       if (!this.getProducts().isEmpty()) {
           productsByPrice.addAll(this.getProducts());
           return productsByPrice;
       }

       throw new RuntimeException("error: this products set is empty.");
    }
}
