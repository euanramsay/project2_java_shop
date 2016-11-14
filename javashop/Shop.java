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

  public void setName(String shopName) {
    name = shopName;
  }

  public void setSales(int shopSales) {
    sales = shopSales;
  }

}