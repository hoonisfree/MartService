package person;

import thing.Bill;
import thing.Cart;

public interface Calculatable {

  int getTotalPrice(Cart cart);

  Bill generateBill(Cart cart);
//    void generateBill(Cart cart);
}
