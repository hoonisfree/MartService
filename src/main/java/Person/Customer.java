package person;

import PaymentMethod.PaymentMethod;
import Product.Product;
import thing.Cart;

public class Customer {

    private Person person;
    private PaymentMethod paymentMethod;
    private Cart cart;

    public Customer(Person person, Cart cart) {
        this.person = person;
        this.cart = cart;
    }

    public Customer(Person person, PaymentMethod paymentMethod, Cart cart) {
        this.person = person;
        this.paymentMethod = paymentMethod;
        this.cart = cart;
    }
    public void putInCart(Product product, Integer quantity) {
        cart.add(product, quantity);
    }
}
