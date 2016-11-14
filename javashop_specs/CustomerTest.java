import javashop.*;

import static org.junit.Assert.assertEquals;
import org.junit.*;

public class CustomerTest{
  Customer customer;
  Product product;
  Shop shop;
  Sale sale;

  @Before 
  public void before() {
    customer = new Customer("Charlie Brown", 30);
    product = new Product("Lemonade", 5);
    shop = new Shop("Lucys Lemonade", 0);
    sale = new Sale(customer, product, shop);
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
    customer.money = customer.getMoney() - product.getCost();
    assertEquals(25, customer.money);
  }

}