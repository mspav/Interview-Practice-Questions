package com.amfam.tpi.dao;

public class ClimbStaircase {

	public static void main(String[] args) {
		int n=4;
		int comb=climbStairCase(n);
		System.out.println(comb);
	}

	private static int climbStairCase(int n) {
		if(n<=1)
			return 1;
		else
		{
			return climbStairCase(n-1)+climbStairCase(n-2);
		}
	}

}
