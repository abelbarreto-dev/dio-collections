package edu.set.store.util;

import edu.set.store.model.Product;

import java.util.Comparator;

public class ProductByName implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
