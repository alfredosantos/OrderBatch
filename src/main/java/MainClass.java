package main.java;

import java.util.NoSuchElementException;

public class MainClass {

  @SuppressWarnings("unchecked")
  public static void main(String[] args) throws Exception {

    final String file;
    if (args[1] == null || args[1].isEmpty()) {
      throw new NoSuchElementException("No name file present, please type the name of CSV file");
    } else {
      file = args[1];
    }

    System.out.println("OrderBatch " + file);

    new CalculateCommission().calculate(file);

  }
}