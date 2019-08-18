package main.java;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CalculateCommission {

  public void calculate(String file) throws Exception {

    final CSVFileUtils cSVFileUtils = new CSVFileUtils();

    final List<Orders> ordersList = cSVFileUtils.listOrders(file);

    ordersList.sort(Comparator.comparing(Orders::getTotalOrderPrice)
        .reversed()
        .thenComparing(Comparator.comparing(Orders::getTotalOrderPrice)
            .reversed())
    );

    if (ordersList.size() > 1) {
      ordersList.remove(0);
    }

    Map<String, Double> sum = ordersList.stream().collect(
        Collectors.groupingBy(Orders::getBoutique_ID,
            Collectors.summingDouble(Orders::getTotalOrderPrice)));

    sum.entrySet().forEach(
        entry -> System.out.println(entry.getKey() + "," + (int) (entry.getValue() * 0.1)));
  }
}