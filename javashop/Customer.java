package javashop;

import java.util.Collections;
import java.util.HashMap;
import java.util.ArrayList;


public class Customer {
  private String name;
  public HashMap<PaymentType, Integer> wallet;
  private ArrayList<Product> boughtItems;

public Customer(String name){
  this.name = name;
  this.wallet = new HashMap<>();
}

public String getName() {
  return name;
}

public void setName(String customerName) {
  name = customerName;
}

public Object[] getCardTypes() {
  return wallet.keySet().toArray();
}

public void setPaymentType(PaymentType card, Integer balance) {
  wallet.put(card, balance);
}






}

