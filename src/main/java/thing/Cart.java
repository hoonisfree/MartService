package thing;

import java.util.HashMap;
import java.util.Map;
import product.Product;

public class Cart {

    private Map<String,Product> map = new HashMap<>();
    int index = 0;
    public void add(Product product, int quantity){
        if(index + quantity >= 10){//
            System.out.println("상품은 최대 10개까지 넣을 수 있습니다.");
            return;
        }

        Product item = null;
        if(map.containsKey(product.getName())){
            item = map.get(product.getName()); //서울우유
        } else {
            item = product; //매일우유
        }

        item.setQuantity(quantity); //현재 넣는 양.
        index += quantity; //카트에 누적된 양.

        map.put(product.getName(), item);
        System.out.printf("%s (%d원) %d개가 카트에 추가되었습니다. 현재까지 총 %d개 담았습니다. \n", item.getName(), product.getPrice(), quantity, index);
    }

    public void view() {
        System.out.println("카트 안의 모든 상품은 다음과 같습니다.");
        for(Map.Entry<String, Product> prod : map.entrySet()) {
            System.out.printf("%s : %d개\n", prod.getKey(), prod.getValue().getQuantity());
        }
    }

    public Map<String, Product> getProducts() {
        return map;
    }
}
