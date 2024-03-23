package person;

import java.util.Map;
import thing.Cart;

public class Cashier implements calculatable {
    private Person person;
    public Cashier(Person person) {
        this.person = person;
    }
    public Cashier(Kiosk kiosk) {
    }

    @Override
    public void calculate(Cart cart) {
        // 총 금액 넘기기 <- 카트 안에 담긴 물품의 수량과 가격 보고 계산만 하는 곳
        // product.getPrice() -> getKey().getPrice() * getValue()
        // 카트에 담긴 product, 수량 list 로 리턴하면 좋을듯?
//        cart.view();
//        Map<Product, Integer> cart.getMap();
// 카트에 담긴 아이템 이름 보고 가격 * 수량 계산만

    }
    public void generateBill(Cart cart) {
        // calculate해서 , 결제 수단 받아서
        // 영수증 출력하기
    }
}
