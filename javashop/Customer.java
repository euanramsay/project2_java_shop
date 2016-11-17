package javashop;

import java.util.Collections;
import java.util.HashMap;
import java.util.ArrayList;


public class Customer {
  private String name;
  private HashMap<PaymentType, Integer> wallet;
  private ArrayList<Product> bag;
  private PaymentType defaultCardType;

  public Customer(String name, PaymentType defaultCardType){
    this.name = name;
    this.wallet = new HashMap<PaymentType, Integer>();
    this.bag = new ArrayList<Product>();
    this.defaultCardType = defaultCardType;
    this.setPaymentType(defaultCardType, 300);
  }

  public String getName() {
    return name;
  }

  public void setName(String customerName) {
    name = customerName;
  }

  public void setPaymentType(PaymentType card, Integer balance) {
    wallet.put(card, balance);
  }

  public int getBalance(PaymentType card) {
    Integer integerFunds = wallet.get(card);
    int balance = integerFunds.intValue();
    return balance;
  }

  public int numberOfCards() {
    return wallet.size();
  }

  public void bagProduct(Product product) {
    bag.add(product);
  }

  public void removeFromBag(Product product) {
    bag.remove(product);
  }

  public int numberOfProductsInBag() {
    return bag.size();
  }

  public void buyProduct(PaymentType card, Product product){
    Integer integerFunds = wallet.get(card);
    int balance = integerFunds.intValue();
    int cost = product.getCost();
    Integer newBalance = (Integer) balance - cost;
    wallet.put(card, newBalance);
  }

  public Product forReturn(String productName) {
    for (Product item : bag)
      if (productName.equals(item.getName())) {
        return item;
      }
      return null;
    }

  public void returnProduct(PaymentType card, Product product){
     Integer integerFunds = wallet.get(card);
     int balance = integerFunds.intValue();
     int cost = product.getCost();
     Integer newBalance = (Integer) balance + cost;
     wallet.put(card, newBalance);
    }

  }