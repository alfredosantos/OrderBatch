package main.java;

import com.opencsv.bean.CsvToBeanBuilder;
import java.io.FileReader;
import java.util.List;

public class CSVFileUtils {

  public List<Orders> listOrders(String file) throws Exception {

    final List<Orders> ordersList;

    ordersList = new CsvToBeanBuilder(new FileReader(file))
        .withType(Orders.class).build().parse();
    return ordersList;
  }
}
