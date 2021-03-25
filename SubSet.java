package com.amfam.tpi.dao;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.sun.istack.Builder;

public class SubSet {

	public static void main(String[] args) {
		int[] a= {3,2,7,4,5,1,6,7,9};
		
		//List<List<Integer>> list=printAllSubsets(a,7);
		//System.out.println(list);
		Set<Set<Integer>> list=printAllSubsets(a);
		for(Set<Integer> subset:list)
		{
			int sum=0;
			for(Integer sub:subset)
			{
				sum=sum+sub;
			}
			if(sum==7)
			{
				System.out.println(subset);
			}
		}
		 printAllSubsetsRecursive(a,7);
	}

	private static void printAllSubsetsRecursive(int[] a,int givensum) {
	 int subset[]=new int[a.length];
	 printAllSubsetsRecursive(a, givensum,0, subset,0);
		
	}

	private static void printAllSubsetsRecursive(int[] a, int givensum, int currntsum, int[] subset, int index) {
		
		if(currntsum == givensum)
		{
			StringBuilder builder=new StringBuilder();
			for(int i=0;i<subset.length;i++)
			{
				if(subset[i] == 1)
				{						
					builder.append(a[i]+",");
				}
			}
			System.out.println("Found=["+builder.toString()+"]");
		}
		else if(index != a.length)
		{
			subset[index]=1;
			currntsum=currntsum+a[index];
			printAllSubsetsRecursive(a, givensum, currntsum, subset, index+1);
			subset[index]=0;
			currntsum=currntsum-a[index];
			printAllSubsetsRecursive(a, givensum, currntsum, subset, index+1);
		}
	}

	private static Set<Set<Integer>> printAllSubsets(int[] a) {
		Set<Set<Integer>> list=new HashSet<>();
		for(int i=0;i<a.length;i++) {
			Set<Integer> integers=new HashSet<Integer>();
			integers.add(a[i]);
			list.add(integers);
		}
		for(int i=0;i<a.length;i++) {	
			
			Set<Set<Integer>> list1=new HashSet<>();
			for(int j=i+1;j<a.length;j++)
			{					
					for(Set<Integer> s4:list) {						
					Set<Integer> integers=new HashSet<Integer>();		
					 integers.addAll(s4);
					 integers.add(a[j]);
					 list1.add(integers);				 
					}
					
			}
			list.addAll(list1);
		}
		return list;			
	}		
		

	

	private static List<List<Integer>> printAllSubsets(int[] a,int n) {
		List<List<Integer>> mainList= new ArrayList<>();
		for(int i=0;i<n;i++) {
			List<Integer> list= new ArrayList<>();	
			int tempsum=n-a[i];
			list.add(a[i]);
			if(tempsum == 0)
			{
				mainList.add(list);
				continue;
			}
			for(int j=0;j<n && i != j;j++)
			{				
				tempsum=tempsum-a[j];
				if(tempsum == 0)
				{
					list.add(a[j]);
					mainList.add(list);								
				}
				else if( tempsum < 0)
				{
					tempsum=tempsum+a[j];
				}
				else if(tempsum > 0)
				{
					list.add(a[j]);					
				}
			}			
		}
		return mainList;		
	}

}
