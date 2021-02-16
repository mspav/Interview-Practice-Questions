package com.amfam.tpi.dao;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class BFS {

	// A utility function to add an edge in an 
    // undirected graph 
    static void addEdge(ArrayList<ArrayList<Integer> > adj, 
                        int u, int v) 
    { 
        adj.get(u).add(v); 
        adj.get(v).add(u); 
    } 
  
    // A utility function to print the adjacency list 
    // representation of graph 
    static void printGraph(ArrayList<ArrayList<Integer> > adj) 
    { 
        for (int i = 0; i < adj.size(); i++) { 
            System.out.println("\nAdjacency list of vertex" + i); 
            System.out.print("head"); 
            for (int j = 0; j < adj.get(i).size(); j++) { 
                System.out.print(" -> "+adj.get(i).get(j)); 
            } 
            System.out.println(); 
        } 
    } 
  
    // Driver Code 
    public static void main(String[] args) 
    { 
        // Creating a graph with 5 vertices 
        int V = 5; 
        ArrayList<ArrayList<Integer> > adj  
                    = new ArrayList<ArrayList<Integer> >(V); 
          
        for (int i = 0; i < V; i++) 
            adj.add(new ArrayList<Integer>()); 
  
        // Adding edges one by one 
        addEdge(adj, 0, 1); 
        addEdge(adj, 0, 4); 
        addEdge(adj, 1, 2); 
        addEdge(adj, 1, 3); 
        addEdge(adj, 1, 4); 
        addEdge(adj, 2, 3); 
        addEdge(adj, 3, 4); 
          
        printGraph(adj); 
        boolean isPath=BFS(adj,4,0);
        if(isPath)
        {
        	System.out.println("Found");
        }
        else
        {
        	System.out.println("Not found");
        }
    }

	private static boolean BFS(ArrayList<ArrayList<Integer>> adj, int i, int j) {
		List<Integer> visited=new ArrayList<>();
		Queue<Integer> queue=new ArrayDeque<Integer>();
		
		queue.add(i);
		
		while(!queue.isEmpty())
		{
			int x=queue.poll();
			
			for(int k=0;k<adj.get(x).size();k++)
			{
				if(!visited.contains(adj.get(x).get(k))) {
				queue.add(adj.get(x).get(k));
				visited.add(adj.get(x).get(k));
				}
				if(j==adj.get(x).get(k)) {
					return true;
				}
			}
		}
		return false;
	} 
	
}
