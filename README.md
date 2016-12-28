# Simple-Haddop-Map-Reduce-Application
MapReduce-based java code to calculate the count,
average, minimum and maximum of each product from a series of numbers given as
input in a file. The file contains several entries with the following format: value1 \t
value2 whereby value1 represents the product id, and value2 represents the price. For_
example the input looks like this:_
6 553066_
9 790076_
5 1551_
3 497585_
10 12974_

The output should list the count, average (as integer), minimum, and maximum per
product. For example, the output should look like this:
Product 1: Average = 22342
Product 1: Count = 2342
Product 1: Min = 1346
Product 1: Max = 382389
Product 2: Average = 4344
Product 2: Count = 3691
...
The output should be stored in output file(s). Your program should work for any dataset
containing integer numbers.


To run this program-:
1) Put the file in hdfs using the command 
    hadoop fs -put "path of the file in local file system" "path in hdfs where you want to put this file"

2)Now write the Mapper,Driver,Reducer Code in any IDE.
3)Now run the program to create the executable jar file
4)Run the jar file using the command -:
    hadoop jar "path to jar file" "path to output file" "name of the output directory"
