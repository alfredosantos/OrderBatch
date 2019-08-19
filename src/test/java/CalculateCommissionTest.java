import java.io.FileNotFoundException;
import main.java.CalculateCommission;
import org.junit.Before;
import org.junit.Test;

public class CalculateCommissionTest {

  private CalculateCommission calculateCommission;

  @Before
  public void setUp() {
    calculateCommission = new CalculateCommission();
  }

  @Test
  public void calculateCommissionSucess() throws Exception {
    calculateCommission.calculate("orders.csv");
  }

  @Test(expected = FileNotFoundException.class)
  public void calculateCommissionWithOutFile() throws Exception {
    calculateCommission.calculate("orderTest.csv");
  }

  @Test(expected = FileNotFoundException.class)
  public void calculateCommissionBlackFile() throws Exception {
    calculateCommission.calculate("ordersBlank.csv");
  }
}