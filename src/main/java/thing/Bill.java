package thing;

import java.util.Map;
import product.Product;

public class Bill {
    private Map<Product, Integer> cartItems;
    public Bill(Map<Product, Integer> cartItems) {
        this.cartItems = cartItems;
    }
}
