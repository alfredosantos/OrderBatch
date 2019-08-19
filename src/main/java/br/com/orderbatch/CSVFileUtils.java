package br.com.orderbatch;

import com.opencsv.bean.CsvToBeanBuilder;
import java.io.File;
import java.io.FileReader;
import java.util.Comparator;
import java.util.List;

@SuppressWarnings("unchecked")
public class CSVFileUtils {

  public static List<Order> listOrders(String file) throws Exception {

    final List<Order> orderList;

    orderList = new CsvToBeanBuilder(new FileReader(new File(file)))
        .withType(Order.class).build().parse();

    orderList.sort(Comparator.comparing(Order::getTotalOrderPrice).reversed()
        .thenComparing(Comparator.comparing(Order::getTotalOrderPrice).reversed())
    );

    if (!orderList.isEmpty()) {
      orderList.remove(0);
    } else {
      System.out.println("Empty order");
    }

    return orderList;
  }
}
