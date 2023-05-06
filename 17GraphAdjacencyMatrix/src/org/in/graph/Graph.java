package org.in.graph;

import java.util.ArrayList;

public class Graph {
	ArrayList<GraphNode> nodeList = new ArrayList<GraphNode>();
	int[][] adjacencyMatrix;

	public Graph(ArrayList<GraphNode> nodeList) {
		this.nodeList = nodeList;
		// If we give size of nodeList is 5 then it will create 5X5 matrix.
		this.adjacencyMatrix = new int[nodeList.size()][nodeList.size()];
	}

	public void addEdge(int i, int j) {
        //creating an edge from i to j and j to i
		// means from A to B and B to A
		adjacencyMatrix[i][j] = 1;
		adjacencyMatrix[j][i] = 1;
	}
	
	//print graph on the Screen 
	public String toString() {
		StringBuilder objStringBuilder = new StringBuilder();
		objStringBuilder.append("  ");
		for (int iTemp = 0; iTemp < nodeList.size(); iTemp++) {
			objStringBuilder.append(nodeList.get(iTemp).name+" ");	
			}
		objStringBuilder.append("\n");
		for (int iTemp = 0; iTemp < nodeList.size(); iTemp++) {
			objStringBuilder.append(nodeList.get(iTemp).name+":");	
			for (int j : adjacencyMatrix[iTemp]) {
				objStringBuilder.append(j+" ");
			}
			objStringBuilder.append("\n");
			}
		return objStringBuilder.toString();
	}
	
	
}
