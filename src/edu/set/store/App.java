package edu.set.store;

import edu.set.store.core.Store;
import edu.set.store.core.StoreInterface;

public class App {
    public static void main(String[] args) {
        try {
            StoreInterface store = new Store();

            store.addNewProduct(5L, "iogurte", 0.75, 10);
            store.addNewProduct(4L, "macarrão", 3.2, 10);
            store.addNewProduct(1L, "arroz", 1.25, 10);
            store.addNewProduct(2L, "feijão", 2.25, 10);
            store.addNewProduct(3L, "carne", 5.25, 10);

            System.out.println("order by price");
            System.out.println(store.orderProductsByPrice());

            System.out.println("order by name");
            System.out.println(store.orderProductsByName());
        }
        catch (RuntimeException re) {
            System.err.println(re.getMessage());
        }
    }
}
