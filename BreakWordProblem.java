package com.amfam.tpi.dao;

import java.util.ArrayList;
import java.util.List;

public class BreakWordProblem {
	
	public static void main(String[] args) {
		String string="th isisaf amou   sproblem";
		String[] doctionary= {"this","is","a","famous","problem"};
		List<String> result=new ArrayList<>();
		String str="";
		for(int i=0;i<string.length();i++)
		{
			if(string.charAt(i) != ' ')
			str=str+string.charAt(i);
			for(String dic:doctionary) {
				if(dic.equals(str))
				{
					result.add(dic);
					str="";
				}
			}
		}
		StringBuilder builder=new StringBuilder();
		for(String s:result)
		builder.append(s+" ");
		System.out.println(builder.toString());
	}

}
