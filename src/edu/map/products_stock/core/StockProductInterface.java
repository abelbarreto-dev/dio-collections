package edu.map.products_stock.core;

import edu.map.products_stock.model.Product;

import java.util.Map;

public interface StockProductInterface {
    void addNewProduct(Long code, String name, int quantity, double price);
    void showProducts();
    void calculateTotalStock();
    Product getMoreExpansiveProducts();
    Product getLessExpansiveProducts();
    void showGreaterQuantityProductsTotalPrice();
}
