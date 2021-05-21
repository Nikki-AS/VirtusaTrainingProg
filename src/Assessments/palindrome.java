package Assessments;
/* Retrieve the palindrome-true number set from given number
 * limit and return the sum
 * input1::90
 * input2::120
 * logic:90+101+111
 * output::311
 * HInt:: List<Integer> i1=new ArrayList<Integer>();
 * */

import java.util.*;

public class palindrome {
	static List<Integer> l1=new ArrayList<Integer>();
	public static boolean isPalindrome(int t)
	{
		int rem,sum=0;
		int p=t;
		while(p>0)
		{
			rem=p%10;
			sum=(sum*10)+rem;
			p=p/10;
		}
		if(sum==t) 
		return true;
		return false;
		
		
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int sum=0;
		for(int i=a;i<b;i++)
		{
			if(isPalindrome(i))
			{
				l1.add(i);
				sum=sum+i;
			}
		}
		System.out.println(l1);
		System.out.println(sum);
	}
}
		
