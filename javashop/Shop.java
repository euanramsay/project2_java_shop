package javashop;

import java.util.Collections;
import java.util.ArrayList;

public class Shop {
  private String name;
  private int sales;
  private ArrayList<Product> products;

  public Shop(String name, int sales){
    this.name = name;
    this.sales = sales;
    this.products = new ArrayList<Product>();
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

  public void setProductsForSale(Product product) {
    products.add(product);
  }

}