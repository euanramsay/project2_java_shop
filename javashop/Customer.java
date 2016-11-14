package javashop;

import java.util.Collections;
import java.util.HashMap;


public class Customer {
  private String name;
  private int money;
  private HashMap<PaymentType, Integer> wallet;

public Customer(String name, int money){
  this.name = name;
  this.money = money;
  this.wallet = new HashMap<>();
}

public String getName() {
  return name;
}

public int getMoney() {
  return money;
}

public void setName(String customerName) {
  name = customerName;
}

public void setMoney(int customerMoney) {
  money = customerMoney;
}
 



}

