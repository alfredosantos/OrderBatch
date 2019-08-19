package br.com.orderbatch;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CalculateCommission {

  public static Map<String, Integer> calculate(List<Order> orderList) throws Exception {
    final Map<String, Integer> calculated = new LinkedHashMap<>();
    final Map<String, Double> sum = orderList.stream().collect(
        Collectors.groupingBy(Order::getBoutique_ID,
            Collectors.summingDouble(Order::getTotalOrderPrice)));
    sum.forEach((key, value) -> calculated.put(key, (int) (value * 0.1)));
    return calculated;
  }
}