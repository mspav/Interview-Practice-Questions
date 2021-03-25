package com.amfam.tpi.dao;
import java.util.ArrayList;
import java.util.List; 

class GFG 
{ 
	// Function that print all combinations of 
	// balanced parentheses 
	// open store the count of opening parenthesis 
	// close store the count of closing parenthesis 
	static void _printParenthesis(char str[], int pos, int n, int open, int close, List<String> parenthesis) 
	{ 
		
		/*if(close == n) 
		{ 
			// print the possible combinations 
			for(int i=0;i<str.length;i++) 
				System.out.print(str[i]); 
			System.out.println(); 
			return; 
		} 
		else
		{ 
			if(open > close) { 
				str[pos] = '}'; 
				_printParenthesis(str, pos+1, n, open, close+1); 
			} 
			if(open < n) { 
				str[pos] = '{'; 
				_printParenthesis(str, pos+1, n, open+1, close); 
			} 
		} */
		if(open > close || open <0)
		{
			return;
		}
		if(open==0 && close == 0)
		{
			parenthesis.add(new String(str));
		}
		else {
			str[pos]='{';
			_printParenthesis(str, pos+1, n, open-1,close , parenthesis);
			str[pos]='}';
			_printParenthesis(str, pos+1, n, open,close-1 , parenthesis);	
		}
	} 
	
	// Wrapper over _printParenthesis() 
	static List<String> printParenthesis(char str[], int n) 
	{ 
		List<String> parenthesis=new ArrayList<>();
		if(n > 0) 
		_printParenthesis(str, 0, n, n, n,parenthesis); 
		return parenthesis; 
	} 
	
	// driver program 
	public static void main (String[] args) 
	{ 
		
		int n = 5; 
		char[] str = new char[2 * n]; 
		List<String> paList=printParenthesis(str, n);
		System.out.println(paList);
	} 
} 

// Contributed by Pramod Kumar 
