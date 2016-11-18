import javashop.*;

import static org.junit.Assert.assertEquals;
import org.junit.*;
import java.util.HashMap;
import java.util.ArrayList;

public class CustomerTest{
  Customer customer;
  Product product;
  HashMap<PaymentType, Integer> wallet;
  ArrayList<Product> bag;

  @Before 
  public void before() {
    customer = new Customer("Snoopy", PaymentType.MASTERCARD);
    product = new Product("Lemonade", 5);
    wallet = new HashMap<PaymentType, Integer>();
    bag = new ArrayList<Product>();
  }

  @Test
  public void hasName(){
    assertEquals("Charlie Brown", customer.getName());
  }

  @Test
  public void hasPaymentTypeWithBalanceInWallet() {
    int balance = customer.getBalance(PaymentType.MASTERCARD);
    assertEquals(300, balance);
  }

  @Test
  public void canPutCardsIntoWallet() {
    customer.setPaymentType(PaymentType.VISA, 100);
    assertEquals(2, customer.numberOfCards());
  }

  @Test
  public void canPutItemInBoughtBag() {
    customer.bagProduct(product);
    int items = customer.numberOfProductsInBag();
    assertEquals(1, items);
  }

  @Test
  public void canSeeIfProductForReturnIsInBag() {
    customer.bagProduct(product);
    Product canReturn = customer.forReturn("Lemonade");
    assertEquals("Lemonade", canReturn.getName());
  } 

  @Test
  public void canGetBalanceOfCard() {
    int balance = customer.getBalance(PaymentType.MASTERCARD);
    assertEquals(300, balance);
  }

  @Test
  public void canBuyProduct(){
    customer.buyProduct(PaymentType.MASTERCARD, product);
    int balance = customer.getBalance(PaymentType.MASTERCARD);
    assertEquals(295, balance);
  }

  @Test
  public void canReturnProduct(){
    customer.returnProduct(PaymentType.MASTERCARD, product);
    int balance = customer.getBalance(PaymentType.MASTERCARD);
    assertEquals(305, balance);
  }

}