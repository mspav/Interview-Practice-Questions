package com.amfam.tpi.dao;

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode() {
	}

	TreeNode(int val) {
		this.val = val;
	}

	TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
	}
}
class BinaryTree{

	public TreeNode constructTree(int[] pre, int size) {
		if(size==1)
			return new TreeNode(pre[0]);
		return constructTreeUtil(pre,0,size-1);
	}

	private TreeNode constructTreeUtil(int[] pre, int i, int j) {
		if(i> j)
		{
			return null;
		}
		TreeNode node=new TreeNode(pre[i]);
		int l=i;
		for(l=i+1;l<j+1;l++)
		{
			if(pre[l]>=pre[i])break;
		}
		node.left=constructTreeUtil(pre,i+1,l-1);
		node.right=constructTreeUtil(pre, l, j);
		return node;
	}

	public void printInorder(TreeNode root) {
		if(root ==null)
		{
			return;
		}
		printInorder(root.left); 
		System.out.print(root.val + " "); 
		printInorder(root.right);
	}
	
}
public class BinaryTreefromPreOrder {
	
	// Driver program to test above functions 
		public static void main(String[] args) { 
			BinaryTree tree = new BinaryTree(); 
			int pre[] = new int[]{10, 5, 1, 7, 40, 50}; 
			int size = pre.length; 
			TreeNode root = tree.constructTree(pre, size); 
			System.out.println("Inorder traversal of the constructed tree is "); 
			tree.printInorder(root); 
		}

}
