package com.amfam.tpi.dao;

class TreeLinkedParent {
	int value;
	TreeLinkedParent left;
	TreeLinkedParent right;
	TreeLinkedParent() {
	}

	TreeLinkedParent(int val) {
		this.value = val;
	}

	TreeLinkedParent(int val, TreeLinkedParent left, TreeLinkedParent right) {
        this.value = val;
        this.left = left;
        this.right = right;
	}
}

 class BalancedBST3 {

	 // Driver Code 
    public static void main(String[] args) 
    {
    	int pre[] = {10, 5, 1, 7, 40, 50}; 
    	TreeLinkedParent linkedParent = null;
    	for(int p:pre) {
    		linkedParent=createTree(linkedParent,p);
    	}
    	for(int p=0;p<pre.length-1;p++) {
    		System.out.println(pre[p]+" -- "+successor(linkedParent, null,pre[p]).value);
    	}
    	
    	//int y=successor(n,40);
    	//System.out.println(y);
    }

	private static TreeLinkedParent successor(TreeLinkedParent linkedParent,TreeLinkedParent succ, int p) {
		if(linkedParent == null) return null;
		if(linkedParent.value == p)
		{
			if(linkedParent.right != null)
			{
				return findMinimum(linkedParent.right);
			}
		}
		else if( p < linkedParent.value)
		{
			succ=linkedParent;
			return successor(linkedParent.left,succ, p);
		}
		else
		{
			return successor(linkedParent.right,succ, p);
		}
		return succ;		
	}

	/*private static int successor(TreeLinkedParent root, TreeLinkedParent n) {
		
		Queue<TreeLinkedParent> queue=new ArrayDeque<>();
		queue.add(n);
		int root=n.value;
		while(!queue.isEmpty())
		{
			if(n.value==i)
			{
				TreeLinkedParent tree= n.right;
				return tree.value;
			}
			 if(n.left != null && n.left.value == i)
			{
				return n.value;			
			}
			 else
			 {
				 queue.add(n.left);
			 }
			 if(n.right == null && n.right.value == i)
			 {
				 TreeLinkedParent node=n.left;
				 if(node.left == null) return node.right.value;
				 if(node.right == null) return node.left.value;
			 }
			 else
			 {
				 queue.add(n.right);
			 }
		}
		return i;		
	}*/

	private static TreeLinkedParent findMinimum(TreeLinkedParent right) {
		TreeLinkedParent left=right;
		while(left.left != null)
		{
			left=left.left;
		}
		return left;
	}

	private static TreeLinkedParent createTree(TreeLinkedParent p,int key) {
		if(p==null) return new TreeLinkedParent(key);
		if(p.value > key) p.left=createTree(p.left,key);
		if(p.value < key)p.right=createTree(p.right, key);
		return p;
	}
	
}
