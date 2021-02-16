package com.amfam.tpi.dao;

public class RainWater {
	
	    public static int trap(int[] height) {
	    	int totalwater=0;
	    	for(int j=1;j<height.length-1;j++) {
	    	   int right=height[j];
	    	   for(int i=0;i<j;i++)
		        {
		            right=Math.max(right, height[i]);
		        }
	    	   int left=height[j];
		        for(int i=j+1;i<height.length;i++)
		        {
		        	 left = Math.max(left, height[i]);
		        }
		        
		        
		        	
		            totalwater=totalwater+Math.abs(Math.min(right,left)-height[j]);
		        
	       }
	        
	        return totalwater;
	    }
	    public static void main(String[] args) {
	    	//int [] height= {2,0,2};
	    	//int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
	    	int[] height = {4,2,0,3,2,5};
	    	//		Output: 6
	        if (trap(height)==9) {
	          System.out.println("All tests pass");
	        } else {
	          System.out.println("Tests fail.");
	        }
	      }
}
