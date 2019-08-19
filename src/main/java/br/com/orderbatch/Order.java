package br.com.orderbatch;

import com.opencsv.bean.CsvBindByPosition;

public class Order {

  @CsvBindByPosition(position = 0)
  public String Boutique_ID;

  @CsvBindByPosition(position = 1)
  public String Order_ID;

  @CsvBindByPosition(position = 2)
  public double TotalOrderPrice;

  public String getBoutique_ID() {
    return Boutique_ID;
  }

  public void setBoutique_ID(String boutique_ID) {
    Boutique_ID = boutique_ID;
  }

  public String getOrder_ID() {
    return Order_ID;
  }

  public void setOrder_ID(String order_ID) {
    Order_ID = order_ID;
  }

  public double getTotalOrderPrice() {
    return TotalOrderPrice;
  }

  public void setTotalOrderPrice(double totalOrderPrice) {
    TotalOrderPrice = totalOrderPrice;
  }

}