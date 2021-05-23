package Assessments;

import java.util.HashMap;
import java.util.Map;

public class HashmapUpper {

		  public static void main(String[] args) {
			String arr[]=new String[] {"goa","kerala","gujrat"};
		    HashMap<String,String> h1 = new HashMap<String,String>();

		    h1.put("GOA", arr[0]);
		    h1.put("KER", arr[1]);
		    h1.put("GUJ", arr[2]);
		    //System.out.println(h1);
		    
		    //List<Integer> l=new ArrayList<Integer>();
		    System.out.print("{");
		    for(Map.Entry m : h1.entrySet()){    
		    	System.out.print("{"+m.getKey()+","+m.getValue()+"}");  
		    	}
		    System.out.print("}");
	}

}
