package person;

import thing.Cart;

public class Kiosk implements calculatable {
    public Kiosk() {
        System.out.println("키오스크에서 계산을 도와드리겠습니다.");
    }

    @Override
    public void calculate(Cart cart) {

    }
}
