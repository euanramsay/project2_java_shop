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

  // public void generateSale() {
  //   customer.setMoney(customer.getMoney() - product.getCost());
  //   shop.setSales(shop.getSales() + product.getCost());
  // }

  public void generateSale(PaymentType card) {
    Integer amount = customer.wallet.get(card);
    int balance = amount.intValue();
    int cost = product.getCost();
    int newBalance = balance - cost;
    customer.wallet.put(card, newBalance);
  }


}