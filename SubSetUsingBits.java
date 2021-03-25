package com.amfam.tpi.dao;

import java.util.HashSet;
import java.util.Set;

public class SubSetUsingBits {

	public static void main(String[] args) {
		int[] a= {1,2,3,4,5,6,7,8};
		Set<Set<Integer>> sets=printSubSets(a);
		System.out.println(sets);
	}

	private static Set<Set<Integer>> printSubSets(int[] a) {
		Set<Set<Integer>> set=new HashSet<>();
		for(int i=0;i<Math.pow(2, a.length);i++)
		{
			Set<Integer> set1=new HashSet<>();
			for(int j=0;j<a.length;j++)
			{
				int temp=1<<j;
				if((i & temp) == 0)
				{
					set1.add(a[j]);
				}
			}
			set.add(set1);
		}
		return set;
	}

}
