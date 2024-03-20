package person;

import PaymentMethod.Card;
import PaymentMethod.Money;
import Product.Product;
import thing.Cart;

public class Customer {

    private Person person;
    private Money money;
    private Card card;
    private Cart cart;

    public Customer(Person person, Cart cart) {
        this.person = person;
        this.cart = cart;
    }

    public Customer(Person person, Money money, Cart cart) {
        this.person = person;
        this.money = money;
        this.cart = cart;
    }

    public Customer(Person person, Card card, Cart cart) {
        this.person = person;
        this.card = card;
        this.cart = cart;
    }

    public void putInCart(Product product, Integer quantity) {
        cart.add(product, quantity);
    }
}
