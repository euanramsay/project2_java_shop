package javashop;

import java.util.Collections;

public class Customer {
  private String name;
  private int money;

public Customer(String name, int money){
  this.name = name;
  this.money = money;
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

