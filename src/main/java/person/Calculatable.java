package person;

import thing.Cart;

public interface Calculatable {

    int calculate(Cart cart);

    void generateBill(Cart cart);
}
