import static org.testng.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;
import org.testng.annotations.Test;

public class javaStreams {

	public static void main(String[] args) {
		
	}
		// TODO Auto-generated method stub

	@Test
 public static void regular()
		{
	  ArrayList<String> names = new ArrayList<String>();
	  names.add("tamanna");
	  names.add("rakul preet singh");
	  names.add("kajal agarwal");
	  names.add("nabha natesh");
	  names.add("katrina kaif");
	  names.add("anupama parameshwaran");
	  
	  for(int i =0;i<names.size();i++)
	  {
		   String actual =names.get(i);
		  if (actual.startsWith("a"))
		  {
			  System.out.println(actual);
		  }
		  
	  }
		
	 
	  
	  
	}
	
 
	 @Test
	 public void StreamFilter()
	 {
		 ArrayList<String> names = new ArrayList<String>();
		  names.add("tamanna");
		  names.add("rakul preet singh");
		  names.add("kajal agarwal");
		  names.add("nabha natesh");
		  names.add("katrina kaif");
		  names.add("anupama parameshwaran");
		  names.add("amala paul");
		  
		  names.stream().filter(s -> s.startsWith("a")).forEach(s->System.out.println(s));
		  long c= names.stream().filter(s -> s.startsWith("a")).count();
		  System.out.println(c);
		  names.stream().forEach(s-> System.out.println(s));
		  names.stream().filter(s->s.length()>7).forEach(s->System.out.println(s));
		  names.stream().filter(s->s.length()>7).limit(4).forEach(s->System.out.println(s));
	 }
	 @Test
	 public void StreamMap()
	 {
		 
		 ArrayList<String> names = new ArrayList<String>();
		  names.add("bobby");
		  names.add("Vijay deverakonda");
		  names.add("chiraneevi");
		 
		  
		  Stream.of("tamanna","rakul preet singh","kajal agarwal",
				 "nabha natesh","katrina kaif","anupama parameshwaran","amala paul")
		 .filter(s->s.length()>7).map(s -> s.toUpperCase()).forEach(s ->System.out.println(s));
		 List<String> names1=Arrays.asList("tamanna","rakul preet singh","kajal agarwal",
				 "nabha natesh","katrina kaif","anupama parameshwaran","amala paul","amy jakson");
				 
			names1.stream().sorted().filter(s -> s.startsWith("a")).forEach(s -> System.out.println(s));
			System.out.println("_______________________________________________________________________");
			
			Stream.concat(names.stream(),names1.stream()).forEach(s-> System.out.println(s));
			boolean flag = names1.stream().anyMatch(a->a.equalsIgnoreCase("TAMANNA"));
			
			Assert.assertTrue(flag);
	 }
	 
	 @Test
	 public void StreamCollect()
	 {
		 
		  List<String> ls          =Stream.of("tamanna","rakul preet singh","kajal agarwal",
				 "nabha natesh","katrina kaif","anupama parameshwaran","amala paul")
		 .filter(s->s.length()>7).map(s -> s.toUpperCase()).collect(Collectors.toList());
		  System.out.println("my first letter is "+ ls.get(0));
		  
		  
		  List<Integer> values =Arrays.asList(3,2,2,7,7,7,8,9,5,5,6);
		  
		  //find the unique number
		  values.stream().distinct().forEach(s->System.out.println(s));
		  //sort the numbers
		  values.stream().distinct().sorted().forEach(s-> System.out.println(s) );
		  List<Integer> values1 =values.stream().distinct().sorted().collect(Collectors.toList());
		  System.out.println("The 3 rd sorted number is :"+values.get(3));
		  
		  
		  
		 
	 }
	 
		 
}
