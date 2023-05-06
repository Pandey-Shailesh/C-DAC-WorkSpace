package org.in.graph;

import java.util.ArrayList;

public class Graph {
	ArrayList<GraphNode> nodeList = new ArrayList<GraphNode>();
	

	public Graph(ArrayList<GraphNode> nodeList) {
		this.nodeList = nodeList;
		// If we give size of nodeList is 5 then it will create 5X5 matrix.
		
	}

	public void addEdge(int i, int j) {
		//get the first node value
		GraphNode first = nodeList.get(i);
		//get the second node value
		GraphNode second = nodeList.get(i);
		//going to create the connection between first node and Second node
		//adding first node as neighbors of second node
		first.neighbours.add(second);
		second.neighbours.add(first);
	}
	
	//print graph on the Screen 
	public String toString() {
		StringBuilder objStringBuilder = new StringBuilder();
		for (int iTemp = 0; iTemp < nodeList.size(); iTemp++) {
			objStringBuilder.append(nodeList.get(iTemp).name+":");	
			
			for (int j =0; j< nodeList.get(iTemp).neighbours.size();j++) {
				if (j==nodeList.get(iTemp).neighbours.size()-1) {
					objStringBuilder.append(nodeList.get(iTemp).neighbours.get(j).name);
				} else {
					objStringBuilder.append(nodeList.get(iTemp).neighbours.get(j).name+"-->");
				}
			}
			objStringBuilder.append("\n");
		}
		return objStringBuilder.toString();
	}
	
	
}
