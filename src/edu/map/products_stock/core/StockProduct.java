package edu.map.products_stock.core;

import edu.map.products_stock.model.Product;

import java.util.HashMap;
import java.util.Map;

public class StockProduct implements StockProductInterface {
    private final Map<Long, Product> products;

    public StockProduct() {
        this.products = new HashMap<>();
    }

    protected Map<Long, Product> getProducts() {
        return products;
    }

    @Override
    public void addNewProduct(Long code, String name, int quantity, double price) {
        var product = new Product(name, quantity, price);

        if (this.getProducts().put(code, product) != null)
            throw new RuntimeException("error: product not added to stock.");

        System.out.println("success: product added to stock.");
    }

    @Override
    public void showProducts() {
        this.getProducts().forEach((Long code, Product product) -> {
            System.out.println("[ code= " + code + " -> " + product + " ]");
        });
    }

    @Override
    public void calculateTotalStock() {
        if (this.getProducts().isEmpty())
            throw new RuntimeException("error: stock is empty.");

        Map<String, Double> totalStock = new HashMap<>();

        this.getProducts().forEach(
            (Long code, Product product) -> {
                double totalPrice = product.getPrice() * product.getQuantity();
                totalStock.put(product.getName(), totalPrice);
            }
        );

        double total = 0;

        for (Double num : totalStock.values()) {
            total = Double.sum(total, num);
        }

        System.out.println("Total Stock: R$ " +
                Double.toString(total));
    }

    @Override
    public Product getMoreExpansiveProducts() {
        if (this.getProducts().isEmpty())
            throw new RuntimeException("error: stock is empty.");

        double maxValue = Double.MIN_VALUE;

        Product maxProduct = null;

        for (Product product : this.getProducts().values()) {
            if (product.getPrice() > maxValue) {
                maxValue = product.getPrice();
                maxProduct = product;
            }
        }

        return maxProduct;
    }

    @Override
    public Product getLessExpansiveProducts() {
        if (this.getProducts().isEmpty())
            throw new RuntimeException("error: stock is empty.");

        double minValue = Double.MAX_VALUE;

        Product minProduct = null;

        for (Product product : this.getProducts().values()) {
            if (product.getPrice() < minValue) {
                minValue = product.getPrice();
                minProduct = product;
            }
        }

        return minProduct;
    }

    @Override
    public void showGreaterQuantityProductsTotalPrice() {
        if (this.getProducts().isEmpty())
            throw new RuntimeException("error: stock is empty.");

        Map<String, Double> totalStock = new HashMap<>();

        this.getProducts().forEach(
                (Long code, Product product) -> {
                    double totalPrice = product.getPrice() * product.getQuantity();
                    totalStock.put(product.getName(), totalPrice);
                }
        );

        totalStock.forEach(
                (String name, Double price) -> {
                    System.out.println("{ name= '" + name + "', price(R$)= " + price + " }");
                }
        );
    }
}
