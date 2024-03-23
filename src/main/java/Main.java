//import person.Cashier;
//import person.Kiosk;
import person.Person;
import product.*;
import thing.Bill;
import thing.Cart;

public class Main {
    public static void main(String[] args) {
        Cart myCart = new Cart();
        Product seoulMilk = new Milk("서울우유", 1000);
        Product maeilMilk = new Milk("매일우유", 1100);
        Product organicEgg = new Egg("유기농 계란", 8000);
        Product seoulMilk2 = new Milk("서울우유", 1000);
        myCart.add(seoulMilk, 1);
        myCart.add(maeilMilk, 2);
        myCart.add(organicEgg, 1);
        myCart.add(seoulMilk2, 4); //

        myCart.add(organicEgg, 3);
        System.out.println("===");
        myCart.view();

        System.out.println();
//        Cashier cashier = new Cashier(new Person("최민수"));
////        cashier = new Cashier(new Kiosk());
//        cashier.generateBill(myCart);
    }
}
