package paymentMethod;

import thing.Receipt;

public class Card extends PaymentMethod {

  public Card() {
    super();
  }

  @Override
  public Receipt transact() {

    //잔돈 0원
    return null;
  }


}
