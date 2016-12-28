//Mapper Class 

//Data format 
//Key   value
//3	    935603
//10	212811
//3	    112455


import java.io.IOException;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

public class MapperClass extends Mapper<LongWritable,Text,IntWritable,IntWritable> {
	
	public void map(LongWritable key,Text value,Context context) throws IOException, InterruptedException
	{
		//converting text class to string class
		String data=value.toString();
		
		//Splitting the string by tab character
		String splitedData [] = data.split("\t");
		int productId=Integer.parseInt(splitedData[0]);
		int price = Integer.parseInt(splitedData[1]);

		
		//Giving the Mapper output to Reducer Function, which will act as input to Reducer Function.
		context.write(new IntWritable(productId),new IntWritable(price));	
	}

}
	


