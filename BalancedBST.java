package com.amfam.tpi.dao;

import java.util.ArrayDeque;
import java.util.Queue;

class TreeNod {
	int value;
	TreeNod left;
	TreeNod right;
	TreeNod() {
	}

	TreeNod(int val) {
		this.value = val;
	}

	TreeNod(int val, TreeNod left, TreeNod right) {
        this.value = val;
        this.left = left;
        this.right = right;
	}
}

 class BalancedBST {

	 // Driver Code 
    public static void main(String[] args) 
    {
    	int[] s= {10,20,30,40,50};
    	TreeNod n=createTree(s,0,s.length-1);
    	
    }

	
	private static TreeNod createTree(int[] s,int low,int high) {
		if(low> high) return null;
		int mid=(low+high)/2;
		
		TreeNod node=new TreeNod();
		node.value=s[mid];
		node.left=createTree(s,low,mid-1);
		node.right=createTree(s, mid+1, high);
		return node;
	}
	
}
