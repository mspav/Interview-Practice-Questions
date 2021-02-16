package com.amfam.tpi.dao;
class SingleNode
{
	int data;
	SingleNode next;
	 SingleNode(int d)
	 {
		 this.data=d;
		 this.next=null;
	 }
}
public class LinkedList {
	 public static void main(String[] args) 
	    {
		  int[] a= {12,14,15,16,14,16,16};
		  SingleNode node=createLinkedList(a);
		  node=removeDuplicates(node);
		  printList(node);
	    }

	private static SingleNode removeDuplicates(SingleNode node) {
	
		if(node== null) return null;
		SingleNode previous=node;
		SingleNode current=previous.next;		
		while(current.next != null)
		{
			SingleNode runner=node;
			while(runner != current)
			{
				if(runner.data == current.data)
				{	
					SingleNode temp=current.next;
					previous.next=temp;
					current=temp;
					break;
				}				
				runner=runner.next;
			}
			if(runner == current)
			{
				previous=current;
				current=current.next;
			}			
		}		
		return node;		
	}

	private static SingleNode createLinkedList(int[] a) {
		SingleNode singleNode=null;
		for(int i=0;i<a.length;i++)
		{
			singleNode=appendtoList(a[i],singleNode);
		}
		return singleNode;
	}

	private static void printList(SingleNode singleNode) {
		System.out.println(singleNode.data);
		if(singleNode.next == null)
		{
			return;
		}		
		printList(singleNode.next);	
	}

	private static SingleNode delete(int i, SingleNode singleNode)
	{
		SingleNode single=singleNode;
		if(singleNode.data==i)
		{
			return singleNode.next;
		}
		while(single.next != null)
		{			
			if(i==single.next.data)
			{
				single.next=single.next.next;
				break;
			}
			single=single.next;			
		}
		return single;
		
	}
	
	

	private static SingleNode appendtoList(int i,SingleNode node) {
		SingleNode snode=new SingleNode(i);
		if(node == null) {
			node=snode;
			return node;
		}
		SingleNode temp=node;
		while(temp.next != null)
		{
			temp=temp.next;
		}
		 temp.next=snode;
		 return node;
	}

}
