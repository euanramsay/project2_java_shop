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
    customer = new Customer("Snoopy", PaymentType.MASTERCARD);
    product = new Product("Lemonade", 5);
    shop.setForSale(product);
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
    int items = shop.getNumberOfProducts();
    assertEquals(1, items);
  }

  @Test
  public void canGetProductFromString() {
    assertEquals(product, shop.forSale("Lemonade"));
  }

  @Test
  public void canSeeIfProductIsForSaleInShop() {
    Product forSale = shop.forSale("Lemonade");
    assertEquals("Lemonade", forSale.getName());
  } 

  @Test
  public void canSellProduct() {
    shop.sellProduct("Lemonade", customer);
    assertEquals(1, customer.numberOfProductsInBag());
    assertEquals(0, shop.getNumberOfProducts());
    assertEquals(295, customer.getBalance(PaymentType.MASTERCARD));
    assertEquals(5, shop.getSales());
  }

  @Test
  public void canRefundProduct() {
    shop.sellProduct("Lemonade", customer);

    shop.refundProduct(product, customer);
    assertEquals(0, customer.numberOfProductsInBag());
    assertEquals(1, shop.getNumberOfProducts());
    assertEquals(300, customer.getBalance(PaymentType.MASTERCARD));
    assertEquals(0, shop.getSales());
  }




}