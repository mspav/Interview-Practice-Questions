package com.amfam.tpi.dao;

import java.util.ArrayList;
import java.util.List;

public class Curlybraces {

	public static void main(String[] args) {
		int n=3;
		List<String> combs=printCombinations(n);
		for(String s:combs)
		{
			if(s.length()==(2*n))
			System.out.println(s);
		}
	}

	private static List<String> printCombinations(int n) {
		List<String> result=new ArrayList<>();
		String brace="{}";
		if(n==1) {
			result.add(brace);
			return result;
		}
		result.add(brace);
		for(int j=0;j<n;j++) {
			List<String> set=new ArrayList<>();
		int i=0;
		while(i<n)
		{
			for(String s:result) {
			String temp=insert(i,s,brace);
			i++;			
			set.add(temp);
			}
		}
		result.addAll(set);
	}
	return result;
		
		
	}

	private static String insert(int pos, String brace,String curly) {
		String newString="";
		for(int i=0;i<brace.length();i++)
		{
			if(i==pos)
			{
				newString+=curly;
			}
			newString+=brace.charAt(i);
		}
		return newString;
	}

}
