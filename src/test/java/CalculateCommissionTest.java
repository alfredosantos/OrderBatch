import br.com.orderbatch.CSVFileUtils;
import br.com.orderbatch.CalculateCommission;
import br.com.orderbatch.Order;
import java.io.FileNotFoundException;
import java.util.AbstractMap.SimpleEntry;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import org.junit.Assert;
import org.junit.Test;

public class CalculateCommissionTest {

  private Object Empty;

  @Test
  public void calculateCommissionSuccess() throws Exception {
    final List<Order> orderList = CSVFileUtils.listOrders("orders.csv");
    final Map<String, Integer> sum = CalculateCommission.calculate(orderList);
    final Iterator<Entry<String, Integer>> iterator = sum.entrySet().iterator();
    Assert.assertEquals(new SimpleEntry<>("B10", 30), iterator.next());
    Assert.assertEquals(new SimpleEntry<>("B11", 10), iterator.next());
  }

  @Test
  public void calculateCommissionSuccessPath() throws Exception {
    final List<Order> orderList = CSVFileUtils
        .listOrders("src/test/resources/orders.csv");
    final Map<String, Integer> sum = CalculateCommission.calculate(orderList);
  }

  @Test
  public void calculateCommissionSuccessOne_order() throws Exception {
    final List<Order> orderList = CSVFileUtils
        .listOrders("src/test/resources/one_order.csv");
    final Map<String, Integer> sum = CalculateCommission.calculate(orderList);
    Assert.assertTrue(sum.isEmpty());
  }

  @Test
  public void calculateCommissionEmptyFile() throws Exception {
    final List<Order> orderList = CSVFileUtils.listOrders("src/test/resources/ordersEmpty.csv");
    final Map<String, Integer> sum = CalculateCommission.calculate(orderList);
    Assert.assertTrue(sum.isEmpty());
  }

  @Test(expected = FileNotFoundException.class)
  public void calculateCommissionWithOutFile() throws Exception {
    final List<Order> orderList = CSVFileUtils.listOrders("src/test/resources/orderTest.csv");
    CalculateCommission.calculate(orderList);
  }
}