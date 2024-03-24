package person;

import java.util.ArrayList;
import java.util.Map;
import product.Product;
import thing.Bill;
import thing.Cart;
import thing.Row;

public class Cashier implements Calculatable {

  private Person person;
  private Kiosk kiosk; //never used?
  private int totalPrice;

  public Cashier(Person person) {
    System.out.printf("🙍‍ 안녕하세요. 계산원 %s입니다.\n", person.getName());
    System.out.println();
  }

  public Cashier(Kiosk kiosk) {
    this.kiosk = kiosk;
    System.out.println("🤖 키오스크에서 계산을 도와드리겠습니다.");
    System.out.println();
  }


  //TODO: for문의 unitPrice, unitQuantity, unitTotal이 두 메소드에서 중복되는 것을 막고싶음..
  @Override
  public int getTotalPrice(Cart cart) {
    totalPrice = 0;
    Map<String, Product> map = cart.getProducts();
    for (Map.Entry<String, Product> prod : map.entrySet()) {
      int unitPrice = prod.getValue().getPrice();
      int unitQuantity = prod.getValue().getQuantity();
      int unitTotal = unitPrice * unitQuantity;
      totalPrice += unitTotal;
    }
    return totalPrice;
  }

  @Override
  public Bill generateBill(Cart cart) {
    totalPrice = getTotalPrice(cart);
    Map<String, Product> map = cart.getProducts();
    ArrayList<Row> rows = new ArrayList<>();

    for (Map.Entry<String, Product> product : map.entrySet()) {
      String unitName = product.getValue().getName();
      int unitPrice = product.getValue().getPrice();
      int unitQuantity = product.getValue().getQuantity();
      int unitTotal = unitPrice * unitQuantity;
      System.out.printf("%-10s %5d %5d %6d\n", unitName, unitPrice, unitQuantity,
          unitTotal);

      Row row = new Row(unitName, unitPrice, unitQuantity, unitTotal);
      rows.add(row);
    }

    System.out.println("⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯");
    System.out.printf("%-25s %d\n", "합 계", totalPrice);

    return new Bill(rows);
  }

}
