import javashop.*;

import static org.junit.Assert.assertEquals;
import org.junit.*;
import java.util.HashMap;
import java.util.ArrayList;

public class CustomerTest{
  Customer customer;
  PaymentType card;
  Product product;
  Shop shop;
  Sale sale;
  HashMap<PaymentType, Integer> wallet;
  ArrayList<Product> bag;

  @Before 
  public void before() {
    customer = new Customer("Charlie Brown", PaymentType.MASTERCARD);
    product = new Product("Lemonade", 5);
    shop = new Shop("Lucys Lemonade", 0);
    // sale = new Sale(customer, PaymentType.card, product, shop);
    wallet = new HashMap<PaymentType, Integer>();
    wallet.put(PaymentType.MASTERCARD, 300);
    bag = new ArrayList<Product>();
  }

  @Test
  public void hasName(){
    assertEquals("Charlie Brown", customer.getName());
  }

  @Test
  public void hasPaymentTypeWithBalanceInWallet() {
    Integer amount = wallet.get(PaymentType.MASTERCARD);
    int balance = amount.intValue();
    assertEquals(300, balance);
  }

  @Test
  public void canPutCardsIntoWallet() {
    customer.setPaymentType(PaymentType.VISA, 100);
    assertEquals(false, customer.wallet.isEmpty());
  }

  @Test
  public void canPutItemInBoughtBag() {
    bag.add(product);
    int items = bag.size();
    assertEquals(1, items);
  }

  // @Test
  // public void canBuyProduct(){
  //   customer.buyProduct(PaymentType.MASTERCARD, product);
  //   Integer amount = wallet.get(PaymentType.MASTERCARD);
  //   int balance = amount.intValue();
  //   assertEquals(295, balance);
  // }

}