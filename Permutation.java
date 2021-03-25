package com.amfam.tpi.dao;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Permutation {

	public static void main(String[] args) {
		String s1 = "abc", s2 = "eidbaooo";
	//	System.out.println(checkInclusion(s1,s2));	
		List<String> strings=new ArrayList<String>();
		recursivePermutations("",s1,strings);
		System.out.println(strings);
	}
	 private static void recursivePermutations(String string, String s1, List<String> strings) {
		int n=s1.length();
		if(n == 0)
		{	
			strings.add(string);
		}
		else
		{
			for(int i=0;i<n;i++)
			{
				 recursivePermutations(string+s1.charAt(i), s1.substring(i+1,n)+s1.substring(0,i), strings);
			}
		}
		
	}
	public static boolean checkInclusion(String s1, String s2) {
		 System.out.println(s1);
		 if(s2.contains(s1))
			 return true;
		 Set<String> s=new HashSet<>();
		 s.add(s1);
		 for(int i=0;i<s1.length();i++)
		 {
			 Set<String> p=new HashSet<>();
			 for(int j=i+1;j<s1.length();j++)
			 {
				 for(String s4:s) {
				 String temp=swap(s4,i,j);
				 p.add(temp);
				 System.out.println(temp);
				 if(s2.contains(temp))
					 return true;
				 }
			 
			 }
			 s.addAll(p);
		 }		 
		return false; 	        
	 }
	private static  String swap(String s1, int i, int j) {		
		char[] ch= s1.toCharArray();
		char temp=ch[i];
		ch[i]=ch[j];
		ch[j]=temp;
		return new String(ch);		
	}
	

}
