import javashop.*;

import static org.junit.Assert.assertEquals;
import org.junit.*;
import java.util.HashMap;

public class CustomerTest{
  Customer customer;
  Product product;
  Shop shop;
  Sale sale;
  HashMap<PaymentType, Integer> wallet;

  @Before 
  public void before() {
    customer = new Customer("Charlie Brown", 30);
    product = new Product("Lemonade", 5);
    shop = new Shop("Lucys Lemonade", 0);
    sale = new Sale(customer, product, shop);
    wallet = new HashMap<PaymentType, Integer>();
    wallet.put(PaymentType.MASTERCARD, 300);
  }

  @Test
  public void hasName(){
    assertEquals( "Charlie Brown", customer.getName() ); 
  }

  @Test
  public void howMuchMoney() {
    assertEquals(30, customer.getMoney());
  }

  @Test
  public void canBuyProduct() {
    // customer.setMoney(customer.getMoney() - product.getCost());
    sale.generateSale();
    assertEquals(25, customer.getMoney());
  }



}