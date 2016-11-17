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

  public int getNumberOfProducts () {
    return products.size();
  }

  public void setName(String shopName) {
    name = shopName;
  }

  public void setSales(int shopSales) {
    sales = shopSales;
  }

  public void setForSale(Product product) {
    products.add(product);
  }

  public void removeFromSale(Product product) {
    products.remove(product);
  }

  public Product forSale(String productName) {
    for (Product item : products)
      if (productName.equals(item.getName())) {
        return item;
      }
    return null;
  }

  public void sellProduct(String productName, Customer customer) {
    Product product = forSale(productName);
    sales = sales + product.getCost();
    products.remove(product);

    customer.buyProduct(PaymentType.MASTERCARD, product);
    customer.bagProduct(product); 
  }

  public void refundProduct(Product product, Customer customer) {
    sales = sales - product.getCost();
    products.add(product);

    customer.returnProduct(PaymentType.MASTERCARD, product);
    customer.removeFromBag(product);
    
  }

}
