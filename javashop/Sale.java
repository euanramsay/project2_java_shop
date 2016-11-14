package javashop;

import java.util.Collections;

public class Sale {
  private Customer customer;
  private Product product;
  private Shop shop;

  public Sale(Customer customer, Product product, Shop shop){
    this.customer = customer;
    this.product = product;
    this.shop = shop;
  }

  public void generateSale() {
    customer.setMoney(customer.getMoney() - product.getCost());
    shop.setSales(shop.getSales() + product.getCost());
  }


}