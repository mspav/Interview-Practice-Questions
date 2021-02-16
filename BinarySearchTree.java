package com.amfam.tpi.dao;

import java.util.ArrayDeque;
import java.util.Queue;

class Node
{
	int value;
	Node left;
	Node right;
}

public class BinarySearchTree {

	public static void main(String[] args) {
		//int[] a= {10,5,9,70,60,30};
		int[] a={10, 5, 3,1,0, 7,8,9, 40, 50,30,60};
		Node n=constructTree(a);
		int heigh=height(n.left);
		System.out.println(heigh);
		System.out.println(height(n.right));
		System.out.println(heightR(n.left));
		System.out.println(heightR(n.right));
		printInorder(n);
		printpreorder(n);
		printpostorder(n);
	}
	private static  int heightR(Node node) {
		if(node==null)
			return 0;
		return 1+Math.max(heightR(node.left), heightR(node.right));
		
	}
	
	
	private static  int height(Node node) {
			// create an empty queue and enqueue root node
				Queue<Node> queue = new ArrayDeque<>();
				queue.add(node);

				Node front = null;
				int height = 0;

				// loop till queue is empty
				while (!queue.isEmpty())
				{
					// calculate number of nodes in current level
					int size = queue.size();

					// process each node of current level and enqueue their
					// non-empty left and right child to queue
					while (size-- > 0) {
						front = queue.poll();
						System.out.println("popped"+front.value);
						if (front.left != null) {
							queue.add(front.left);
						}

						if (front.right != null) {
							queue.add(front.right);
						}
					}

					// increment height by 1 for each level
					height++;
				}

				return height;
			}
		
	

	private static void printpostorder(Node n) {
		if(n == null)
			return;	
		printpostorder(n.left);
		printpostorder(n.right);
		System.out.println(n.value);
	}

	private static void printpreorder(Node n) {
		if(n == null)
			return;
		
		System.out.println(n.value);
		printpreorder(n.left);
		printpreorder(n.right);
		
	}

	private static void printInorder(Node n) {
		if(n == null)
			return;
		printInorder(n.left);
		System.out.println(n.value);
		printInorder(n.right);
	}

	private static Node constructTree(int[] a) {
		int total=a.length;
		Node node=new Node();
		node.value=a[0];
		if(total == 1)
		{			
			return node;
		}
		else
		{
			return addNode(a,node);
		}
	}

	private static Node addNode(int[] a, Node node) {
		int i=1;
		while(i<a.length)
		{
			addNode(a[i],node);
			i++;
		}
		return node;		
	}

	private static void addNode(int i, Node node) {
		Node lnode=new Node();
		lnode.value=i;
		boolean isNode=true;
		while(isNode)
		{
			if(node.value > i) {
				if(node.left== null) {
				node.left=lnode;
				isNode=false;
				}
				else
				{
					node=node.left;
				}
			
			}
			else if(node.value < i)
			{				
				if(node.right== null) {
					node.right=lnode;
					isNode=false;
					}
					else
					{
						node=node.right;
					}
			}
			
		}
		
	}

}
