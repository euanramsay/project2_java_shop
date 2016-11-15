import javashop.*;

import java.util.ArrayList;
import static org.junit.Assert.assertEquals;
import org.junit.*;

public class ShopTest{
  Customer customer;
  Product product;
  Shop shop;
  Sale sale;
  ArrayList<Product> products;

  @Before 
  public void before() {
    shop = new Shop("Lucys Lemonade", 0);
    customer = new Customer("Charlie Brown");
    product = new Product("Lemonade", 5);
    sale = new Sale(customer, product, shop);
    products = new ArrayList<Product>();
  }

  @Test
  public void hasName(){
    assertEquals( "Lucys Lemonade", shop.getName() ); 
  }

  @Test
  public void howMuchInSales() {
    assertEquals( 0, shop.getSales());
  }

  // @Test
  // public void canSellProduct() {
  //   // shop.setSales(shop.getSales() + product.getCost());
  //   sale.generateSale();
  //   assertEquals(5, shop.getSales());
  // }

}