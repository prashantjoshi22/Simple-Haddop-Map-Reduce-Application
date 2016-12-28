import java.io.IOException;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

public class ReducerClass extends Reducer<IntWritable,IntWritable,IntWritable,Text> {

	public void reduce(IntWritable key , Iterable<IntWritable> value ,Context context) throws IOException
	{
		//Declaring Variables.
		int sum=0;
		int count=0;
		int average ;
		int maxValue=0;
		int minValue= Integer.MAX_VALUE ;
		int j;
		
		//Fetching all the data from the value Iterator 
		while(value.iterator().hasNext())
		{
			IntWritable i = value.iterator().next();
			sum=sum + i.get();
			j=i.get();
			count=count+1;
			
			//Finding Maximum value.
			 if(j > maxValue) {
		            maxValue = j;
		        }
			 
			 //FInding Minimum value
			 if(j < minValue) {
		            minValue = j;
		        } 
		}
		
		//Calculating the average of the price for a given Product
		average = sum/count;
		
		//Combining all the results in the String "total"
		String total = " Count " + count +" Average " + average + " " + " Minimum value " + minValue + " " + " Maximum value " + maxValue;
		
		try {
			//Final output will be written in output file
			context.write(key,new Text(total)) ;
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}}
	
	