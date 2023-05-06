package org.in.graph;

import java.util.ArrayList;

public class MainClass {

	public static void main(String[] args) {
		ArrayList<GraphNode> nodeList = new ArrayList<GraphNode>();
		//GraphNode gn = new GraphNode("A", 0);
		nodeList.add(new GraphNode("A", 0));
		nodeList.add(new GraphNode("B", 1));
		nodeList.add(new GraphNode("C", 2));
		nodeList.add(new GraphNode("D", 3));
		nodeList.add(new GraphNode("E", 4));
		
		Graph g = new Graph(nodeList);
		g.addEdge(0, 1); // node A is connected with node B
		g.addEdge(0, 2); 
		g.addEdge(0, 3);
		g.addEdge(1, 4);
		g.addEdge(2, 3);
		g.addEdge(3, 4);
		
		
		System.out.println(g.toString());
		
		g.breadthFirstSearch();

	}
}