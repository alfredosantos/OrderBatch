# Order batch processing
## OrderBatch

Application that will calculate the total commissions that Boutique should charge for each boutique on a given day,
with the following rules:
* Boutiques should be charged by 10% of the total value every order
* The order with the highest value of the day will not be subject to commission

# Java technologies:
## Java Project using:
- Java 1.8
- Gradle 4.6

## Dependencies:
- name: 'junit', version: '4.12'
- name: 'opencsv', version: '4.6'


# How to install
- First configure the Java and Gradle in your machine.
- Unzip the file with contains the project in a directory.

## Execute in command line or in your ide:
- gradle clean
- gradle build
- gradle fatJar

The .jar will be generated in path:
- OrderBatch\build\libs\OrderBatch.jar

With name: OrderBatch.jar

## Command line to run
In the same directory that you have the .jar
- Type the commnand:
java -jar OrderBatch.jar orders.csv

Where on the second parameter we can have the name of the file, if it's in the same place of
the .jar, or the path of the file that will be processed.