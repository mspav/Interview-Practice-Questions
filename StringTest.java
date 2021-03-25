package com.amfam.tpi.dao;

public class StringTest {

	public static void main(String[] args) {
		char[] a= {'A','A','A','A','B','B'};
		
		
		/*for(int i=0;i<a.length;i++)
		{			
			boolean isUnique=true;
			for(int j=i+1;j<a.length;j++) {
			if(a[i] == a[j] && isUnique) { isUnique =false;}
			if(!isUnique) {
				if(j==a.length-1)
					a[j]='\0';
				else
				a[j]=a[j+1];
			}			
		}*/
		int tail=1;
		for(int i=0;i<a.length;i++)
		{
			int j=0;
			for(j=0;j<tail;j++) {
				if(a[i] == a[j]) break;
			}			
			if(j == tail)
			{
				a[tail]=a[i];
				tail++;
			}	
		}
		a[tail]=0;
		System.out.println(a);
	}

}
