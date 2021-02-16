package com.amfam.tpi.dao;

import java.io.IOException;

import javax.xml.bind.JAXBException;

public class JosephumSolution {

	public static void main(String[] args) throws IOException, JAXBException {
		System.out.println(lastRemaining(9));
		System.out.println(josephus(15,3));	
		int a[]= {1,4,4,4,5,5,6,6,11,12,12,12,12,15,17,20,21,21};
		System.out.println(findmagicIndex(a));
	}
	private static int findmagicIndex(int[] a) {
		return find(a,0,a.length-1);
	}
	private static int find(int[] a, int i, int j) {
		if(i > j)
			return -1;
		int mid=(i+j)/2;
		if(a[mid]==mid)
			return mid;
		int left=find(a,i,Math.min(mid-1,a[mid]));
		if(left >=0)
			return left;
		return find(a,Math.max(mid,a[mid]),j);
		
	}
	public static int josephus(int n,int k)
	{
		if(n==0)return 0;
		else
		return (josephus(n - 1, k) + k ) % n; 
		
	}
	    public static int lastRemaining(int n) {
	    	boolean left=true;
	    	int steps=1;	    	
	    	int remaining=n;
	    	int firstnum=1;
	    	while(remaining>1)
	    	{
	    		if(left || remaining%n == 1)
	    		{
	    			firstnum=firstnum+steps;	    			
	    		}
	    		remaining=remaining/2;
	    		steps=steps*2;
	    		left= !left;
	    	}
			return firstnum;
	    }
	    
	}

