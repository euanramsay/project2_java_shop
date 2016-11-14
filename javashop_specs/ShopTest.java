import javashop.*;

import static org.junit.Assert.assertEquals;
import org.junit.*;

public class ShopTest{
  Shop shop;

  @Before 
  public void before() {
    shop = new Shop("Lucys Lemonade", 0);
  }

  @Test
  public void hasName(){
    assertEquals( "Lucys Lemonade", shop.getName() ); 
  }

}