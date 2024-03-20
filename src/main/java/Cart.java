import java.util.HashMap;
import java.util.Map;
import Product.Product;

public class Cart {
    private Map<Product,Integer> map = new HashMap<>();
    int index = 0;
    public void add(Product product, int quantity){
        if(map.size() >= 10){
            System.out.println("상품은 최대 10개까지 넣을 수 있습니다.");
            return;
        }
        index += quantity;
        map.put(product, quantity);
        System.out.printf("%s (%d원)이 카트에 추가되었습니다. 현재까지 총 %d개 담았습니다. \n", product.getName(), product.getPrice(), index);


    }

    public void view() {
        System.out.println("카트 안의 모든 상품은 다음과 같습니다.");
        for(Map.Entry<Product, Integer> prod : map.entrySet()) {
            System.out.printf("%s : %d개\n", prod.getKey().getName(), prod.getValue());
        }
    }



}
