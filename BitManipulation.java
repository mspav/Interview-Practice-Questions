package com.amfam.tpi.dao;

public class BitManipulation {

	public static void main(String[] args) {
		int n=423;
		System.out.println(convertIntegerToBinary(n));
		int res =getBitValue(n, 4);
		System.out.println(res);
		int y=setBit1(n,4);
		System.out.println(convertIntegerToBinary(y));
		 y=setBit0s(n,5);
		System.out.println(convertIntegerToBinary(y));
		
		y=clear(n,5);
		System.out.println(convertIntegerToBinary(y));
	}
	private static int setBit0s(int n, int k) {
		return n&~(1<<k);
	}
	private static int setBit1(int n,int k) {
		return n|(1<<k);
	}
	public static int getBitValue(int n,int k)
	{
		//int res1=n & (1<<7);also works.
		return (n >> k) & 1;
	}
	public static int clear(int n,int k)
	{
		return n & ~((1<<7)-1);
	}
	public static String convertIntegerToBinary(int n) {
	    if (n == 0) {
	        return "0";
	    }
	    StringBuilder binaryNumber = new StringBuilder();
	    while (n > 0) {
	        int remainder = n % 2;
	        binaryNumber.append(remainder);
	        n /= 2;
	    }
	    binaryNumber = binaryNumber.reverse();
	    return binaryNumber.toString();
	}
}
