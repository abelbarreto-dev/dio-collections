package edu.set.store.util;

import edu.set.store.model.Product;

import java.util.Comparator;

public class ProductByPrice implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return Double.compare(o1.getPrice(), o2.getPrice());
    }
}
