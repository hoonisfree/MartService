package person;

import java.util.Map;
import product.Product;
import thing.Cart;

public class Kiosk implements Calculatable {

    private int totalPrice;

    public Kiosk() {
        System.out.println("키오스크에서 계산을 도와드리겠습니다.");
    }

    @Override
    public int calculate(Cart cart) {
        totalPrice = 0;
        Map<Product, Integer> products = cart.getProducts();
        for (Map.Entry<Product, Integer> product : products.entrySet()) {
            totalPrice += product.getKey().getPrice() * product.getValue();
        }
        return totalPrice;
    }

    @Override
    public void generateBill(Cart cart) {
        totalPrice = calculate(cart);

        Map<Product, Integer> products = cart.getProducts();
        System.out.printf("%-7s %5s %5s %5s\n", "상품명", "단가", "수량", "금액");
        System.out.println("================================");
        for (Map.Entry<Product, Integer> product : products.entrySet()) {
            String name = product.getKey().getName();
            int price = product.getKey().getPrice();
            int quantity = product.getValue();
            System.out.printf("%-10s %5d %5d %5d\n", name, price, quantity, price * quantity);
        }
        System.out.println("================================");
        System.out.printf("%-24s %d\n", "합 계", totalPrice);
    }
}