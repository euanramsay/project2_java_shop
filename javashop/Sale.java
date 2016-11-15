package javashop;

import java.util.Collections;

public class Sale {
  private Customer customer;
  private PaymentType card;
  private Product product;
  private Shop shop;

  public Sale(Customer customer, Product product, Shop shop){
    this.customer = customer;
    this.product = product;
    this.shop = shop;
  }

  public void generateSale() {
    Integer amount = customer.wallet.get(card);
    int balance = amount.intValue();
    int cost = product.getCost();
    Integer newBalance = (Integer) balance - cost;
    customer.wallet.put(card, newBalance);
  }


}