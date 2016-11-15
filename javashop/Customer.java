package javashop;

import java.util.Collections;
import java.util.HashMap;
import java.util.ArrayList;


public class Customer {
  private String name;
  public HashMap<PaymentType, Integer> wallet;
  private ArrayList<Product> basket;

public Customer(String name, Enum defaultCardType){
  this.name = name;
  this.wallet = new HashMap<>();
  this.basket = new ArrayList<Product>();
  this.defaultCardType = defaultCardType;
}

public String getName() {
  return name;
}

public void setName(String customerName) {
  name = customerName;
}

public void setPaymentType(PaymentType card, Integer balance) {
  wallet.put(card, balance);
}

public void buyProduct(){
  
}


}

