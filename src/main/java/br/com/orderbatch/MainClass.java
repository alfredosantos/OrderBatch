package br.com.orderbatch;

import static br.com.orderbatch.CalculateCommission.calculate;

import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

public class MainClass {

  @SuppressWarnings("unchecked")
  public static void main(String[] args) throws Exception {

    final String file;
    if (args == null || args.length <= 0 || args[0].isEmpty()) {
      throw new NoSuchElementException("No name file present, please type the name of CSV file");
    } else {
      file = args[0];
    }

    System.out.println("OrderBatch " + file);

    final List<Order> orderList = CSVFileUtils.listOrders(file);
    final Map<String, Integer> calculated = calculate(orderList);

    calculated.forEach((key, value) -> System.out.println(key + "," + value));
  }
}