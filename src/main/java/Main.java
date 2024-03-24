import Product.*;

public class Main {
    public static void main(String[] args) {
        Cart myCart = new Cart();
        Product seoulMilk = new Milk("서울우유", 1000);
        Product maeilMilk = new Milk("매일우유", 1100);
        Product organicEgg = new Egg("유기농 계란", 8000);
        MarketWorker marketWorker = new MarketWorker();
        marketWorker.addProductToDisplay(seoulMilk);
        marketWorker.addProductToDisplay(maeilMilk);
        marketWorker.addProductToDisplay(organicEgg);
        marketWorker.showDisplayProductList();
        marketWorker.displaySummary();
        myCart.add(seoulMilk, 1);
        myCart.add(maeilMilk, 2);
        myCart.add(organicEgg, 3);
        System.out.println("===");
        myCart.view();
    }

}
