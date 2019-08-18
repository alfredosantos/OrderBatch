# Order batch processing

Given a CSV file with the amount of orders for each boutique for a given day, with the following structure:
<Boutique_ID>,<Order_ID>,<TotalOrderPrice>

Implement a console application that will calculate the total commissions that Boutique should charge for each boutique on a given day, 
with the following rules:
* Boutiques should be charged by 10% of the total value every order
* The order with the highest value of the day will not be subject to commission

The program must produce an output to the console formatted as follows:
<Boutique_ID>,<Total_Commission>

## Command line interface
The program must run from the command line with the following program arguments:

* `<Path_to_orders_file>`: path to the file to be processed

e.g. `java -jar OrderBatch.jar orders.csv`

## Example
Given the input `orders.csv` file:
```
B10,O1000,100.00
B11,O1001,100.00
B10,O1002,200.00
B10,O1003,300.00
```

The result should be:
```
$ OrderBatch orders.csv
B10,30
B11,10
```

## Deliverable
We expect you to deliver a zip file containing the source code that implements the solution for this problem.
Please provide clear instructions on how to build and run the application.

# Tips
We are expecting a simple solution to this problem. No need to over-engineer it nor introduce unnecessary complexity.

Remember to keep the code elegant and efficient.
