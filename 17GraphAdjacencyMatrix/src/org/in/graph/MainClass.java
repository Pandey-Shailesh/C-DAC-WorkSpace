package org.in.graph;
import java.util.ArrayList;
public class MainClass {
public static void main(String[] args) {
	ArrayList<GraphNode> nodeList = new ArrayList<GraphNode>();
	nodeList.add(new GraphNode("A",0));
	nodeList.add(new GraphNode("B",1));
	nodeList.add(new GraphNode("C",2));
	nodeList.add(new GraphNode("D",3));
	nodeList.add(new GraphNode("E",4));
	
	Graph objGraph = new Graph(nodeList);
	objGraph.addEdge(0, 1);// node A is connected with node B
	objGraph.addEdge(0, 2);
	objGraph.addEdge(0, 3);
	objGraph.addEdge(1, 0);
	objGraph.addEdge(1, 4);
	objGraph.addEdge(2, 0);
	objGraph.addEdge(2, 3);
	objGraph.addEdge(3, 0);
	objGraph.addEdge(3, 1);
	objGraph.addEdge(3, 2);
	objGraph.addEdge(3, 4);
	objGraph.addEdge(4, 1);
	objGraph.addEdge(4, 3);
	
	System.out.println(objGraph.toString());
	
	
	
}
}
