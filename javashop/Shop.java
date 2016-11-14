package javashop;

import java.util.Collections;

public class Shop {
  private String name;
  private int sales;

  public Shop(String name, int sales){
    this.name = name;
    this.sales = sales;
  }

  public String getName() {
    return name;
  }

  public int getSales() {
    return sales;
  }

}