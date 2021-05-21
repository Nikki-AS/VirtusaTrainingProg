package Assessments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class StudentMaxMarks {
	static ArrayList<String> a=new ArrayList<String>();
	static Map<String,Integer>hmap = new HashMap<String, Integer>();
	
	static Map<String,Integer> checkMarks()
	{
		for(String str:a) {
		String s1=(String)str;
		s1=s1.replace("#", " ");
		String[] str1=s1.split(" ");
		int marks=Integer.parseInt(str1[1])+Integer.parseInt(str1[2])+
				 Integer.parseInt(str1[3]);
		hmap.put(str1[0], marks);
	}
	return hmap;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		a.add("Niki#12#12#12");
		a.add("Viki#80#90#90");
		System.out.println(checkMarks());
		String str=" ";
		int max=0;
		
	}
}
