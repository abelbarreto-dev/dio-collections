package edu.map.products_stock;

import edu.map.products_stock.core.StockProduct;
import edu.map.products_stock.core.StockProductInterface;

public class App {
    public static void main(String[] args) {
        try {
            StockProductInterface stock = new StockProduct();

            stock.addNewProduct(1L, "arroz", 5, 2.5);
            stock.addNewProduct(2L, "sal", 7, 0.8);
            stock.addNewProduct(3L, "açucar", 3, 4.25);
            stock.addNewProduct(4L, "manteiga", 2, 3.75);

            stock.calculateTotalStock();

            stock.showProducts();

            stock.showGreaterQuantityProductsTotalPrice();

            System.out.println("expansive: " + stock.getMoreExpansiveProducts());
            System.out.println("less expansive: " + stock.getLessExpansiveProducts());
        }
        catch (RuntimeException re) {
            System.err.println(re.getMessage());
        }
    }
}
