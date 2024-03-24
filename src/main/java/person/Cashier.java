package person;

import java.util.Map;
import product.Product;
import thing.Cart;

public class Cashier implements Calculatable {
    private Person person;
    private int totalPrice;
    public Cashier(Person person) {
        this.person = person;
        System.out.printf("🙍‍ 안녕하세요. 계산원 %s입니다.\n", person.getName());
    }

  public Cashier(Calculatable calculatable) {

  }

  @Override
    public int calculate(Cart cart) {
        totalPrice = 0;
        Map<String, Product> map = cart.getProducts();
        for (Map.Entry<String, Product> prod : map.entrySet()) {
            int unitPrice = prod.getValue().getPrice();
            int unitQuantity = prod.getValue().getQuantity();
            totalPrice += unitPrice * unitQuantity;
        }
        return totalPrice;
    }

    @Override
    public void generateBill(Cart cart) {
        totalPrice = calculate(cart);

        Map<String, Product> map = cart.getProducts();
        System.out.println("📝 지불하실 내역은 다음과 같습니다.");
        System.out.println("⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯");
        System.out.printf("%-9s %5s %6s %4s\n", "상품명", "단가", "수량", "금액");
        System.out.println("⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯");
        for (Map.Entry<String, Product> product : map.entrySet()) {
            String unitName = product.getValue().getName();
            int unitPrice = product.getValue().getPrice();
            int unitQuantity = product.getValue().getQuantity();
            System.out.printf("%-10s %5d %5d %6d\n", unitName, unitPrice, unitQuantity, unitPrice * unitQuantity);
        }
        System.out.println("⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯");
        System.out.printf("%-25s %d\n", "합 계", totalPrice);
    }
}
