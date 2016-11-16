import javashop.*;

import java.util.ArrayList;
import static org.junit.Assert.assertEquals;
import org.junit.*;

public class ShopTest{
  Customer customer;
  Product product;
  Shop shop;

  @Before 
  public void before() {
    shop = new Shop("Lucys Lemonade", 0);
    customer = new Customer("Charlie Brown", PaymentType.MASTERCARD);
    product = new Product("Lemonade", 5);
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
  public void canSetProductForSale() {
    shop.setForSale(product);
    int items = shop.getNumberOfProducts();
    assertEquals(1, items);
  }

  @Test
  public void canGetProductFromString() {
    shop.setForSale(product);
    assertEquals(product, shop.forSale("Lemonade"));
  }

  @Test
  public void canSeeIfProductIsForSaleInShop() {
    shop.setForSale(product);
    Product forSale = shop.forSale("Lemonade");
    assertEquals("Lemonade", forSale.getName());
  }

  // @Test
  // public void canMakeSale() {
  //   sale.generateSale();
  //   assertEquals();
  // }



}