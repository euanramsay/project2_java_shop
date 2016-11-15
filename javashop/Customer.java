package javashop;

import java.util.Collections;
import java.util.HashMap;


public class Customer {
  private String name;
  private HashMap<PaymentType, Integer> wallet;

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

// public PaymentType getCardTypes() {
//   return 
// }

public void setPaymentType(PaymentType card, Integer balance) {
  wallet.put(card, balance);
}





}

