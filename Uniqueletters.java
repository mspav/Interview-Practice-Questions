package com.amfam.tpi.dao;

import java.util.HashSet;
import java.util.Set;

public class Uniqueletters {

	public static void main(String[] args) {
		int[] a= {14,51,7,14,14,51,51,7,7,6};
		int sets=printSubSets(a);
		System.out.println(sets);
	}

	private static int printSubSets(int[] a) {
		int result=0;
		for(int i=0;i<65000;i++)
		{
			
			int sumbits=0;
			int temp=1<<i;
			for(int j=0;j<a.length;j++)
			{
				
				if((a[j] & temp) == 0)
				{
					sumbits++;
				}
			}
			if(sumbits % 3 == 0)
			{
				result=result|temp;
			}
		}
		return result;
	}

}
