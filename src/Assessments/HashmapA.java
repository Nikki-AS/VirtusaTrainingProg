package Assessments;
/* HashMap with regnum as key and mark as value.         
 * find the avg of values 
 * whose key is odd.
 * Input:: {11:80,35:90,33:90,56:88}
 * output::avg of(90+90)=90
*/


import java.util.*;

public class HashmapA {
  public static void main(String[] args) {
	  int sum=0,cnt=0,avg;
    HashMap<Integer, Integer> h1 = new HashMap<Integer,Integer>();

    h1.put(11, 80);
    h1.put(35, 90);
    h1.put(33, 90);
    h1.put(56, 90);
    //System.out.println(h1);
    
    List<Integer> l=new ArrayList<Integer>();
    for(Map.Entry m : h1.entrySet()){    
       // System.out.println(m.getKey()+" "+m.getValue()); 
    	int s=0,t=0;
    	s= (int) m.getKey();
    	t=(int) m.getValue();
    	if(s%2!=0)
    	{
    		cnt++;
    		l.add(t);
    		sum=sum+t;
    			
    	}
       }
    avg=sum/cnt;
    System.out.println("avg of "+ l +" = "+avg); 
    //System.out.println(l); 
  }
}


