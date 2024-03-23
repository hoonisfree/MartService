package thing;

import java.util.HashMap;
import java.util.Map;
import product.Product;

public class Cart {     //나중에 enum할지 고민하기
  private static final Map<String, Product> map = new HashMap<>(); //"서울우유", Milk
  private int count = 0;

  public void add(Product product, int quantity) {
    //최대 수량 넘는지 체크
    int max = 10;
    if (count + quantity > max) {
      System.out.printf("상품은 최대 %d개까지 넣을 수 있습니다.\n", max);
      return;
    }

    //카트에 존재하는 지 체크
    String name = product.getName();
    Product current;
    if (map.containsKey(name)) {
      current = map.get(name); //카트에 이미 있는 객체
    } else {
      current = product; //새로운 객체
    }
    current.setQuantity(quantity); //현재 넣는 양
    count += quantity; //카트에 누적되는 양
    map.put(name, current); //객체 업데이트

    System.out.printf("%s (%d원) %d개가 카트에 추가되었습니다. (현재까지 %d / %d 개)\n", product.getName(), product.getPrice(), quantity, count, max);
  }

  public void view() {
    System.out.println("카트 안의 모든 상품은 다음과 같습니다.");
    for (Map.Entry<String, Product> prod : map.entrySet()) {
      System.out.printf("%s: %d개\n", prod.getKey(), prod.getValue().getQuantity());
    }
  }

  //getter
  public Map<String, Product> getProducts() {
    return map;
  }
}
