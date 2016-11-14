import javashop.*;

import static org.junit.Assert.assertEquals;
import org.junit.*;

public class ShopTest{
  Customer customer;
  Product product;
  Shop shop;
  Sale sale;

  @Before 
  public void before() {
    shop = new Shop("Lucys Lemonade", 0);
    customer = new Customer("Charlie Brown", 30);
    product = new Product("Lemonade", 5);
    sale = new Sale(customer, product, shop);
  }

  @Test
  public void hasName(){
    assertEquals( "Lucys Lemonade", shop.getName() ); 
  }

  @Test
  public void howMuchInSales() {
    assertEquals( 0, shop.getSales());
  }

  @Test
  public void canSellProduct() {
    shop.sales = shop.getSales() + product.getCost();
    assertEquals(5, shop.sales);
  }

}