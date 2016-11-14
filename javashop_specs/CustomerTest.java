import static org.junit.Assert.assertEquals;
import org.junit.*;

public class CustomerTest{
  Customer customer;

  @Before 
  public void before() {
    customer = new Customer("Charlie Brown", 30);
  }

  @Test
  public void hasName(){
    assertEquals( "Charlie Brown", customer.getName() ); 
  }

}