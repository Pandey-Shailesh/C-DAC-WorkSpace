package org.in.graph;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class Graph {
	ArrayList<GraphNode> nodeList = new ArrayList<GraphNode>();
	int[][] adjacencyMatrix;
	
	public Graph(ArrayList<GraphNode> nodeList) {
		this.nodeList = nodeList;
		// if we give size of nodeList is 5 then it will create 5X5 matrix
		adjacencyMatrix = new int[nodeList.size()][nodeList.size()];
	}
	
	
	public void addEdge(int i, int j) {
		//creating an edge from i to j and j to i
		// means from A to B and B to A
		adjacencyMatrix[i][j] = 1;
		adjacencyMatrix[j][i] = 1;
	}
	
	// first collect neighbours of all the nodes
	public ArrayList<GraphNode> collectNeighbours(GraphNode node) {
		ArrayList<GraphNode> neighbours = new ArrayList<GraphNode>();
		int nodeIndex = node.index;
		for (int i = 0; i < adjacencyMatrix.length; i++) {
			if(adjacencyMatrix[nodeIndex][i] == 1) {
				neighbours.add(nodeList.get(i));
			}
		}
		return neighbours;
	}
	
	
	// DFS Traversal
	public void dfsTraversal(GraphNode node) {
		Stack<GraphNode> stack = new Stack<>();
		stack.push(node);
		while (!stack.isEmpty()) {
			GraphNode currentNode = stack.pop();
			currentNode.isVisited = true;
			System.out.print(currentNode.name + " ");
			ArrayList<GraphNode> neibhbours = collectNeighbours(currentNode);
			for (GraphNode neighbor: neibhbours) {
				if (!neighbor.isVisited) {
					stack.push(neighbor);
					neighbor.isVisited = true;
				}
			}
		}
	}
	
	public void deepthFirstSearch() {
		// foreach loop 
		for (GraphNode node : nodeList) {
			if(!node.isVisited) {
				dfsTraversal(node);
			}
		}
	}
	
	// print graph on the screen
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("  ");
		for (int i = 0; i < nodeList.size(); i++) {
			sb.append(nodeList.get(i).name+ " ");
		}
		sb.append("\n");
		for (int i = 0; i < nodeList.size(); i++) {
			sb.append(nodeList.get(i).name+ ":");
			for (int j : adjacencyMatrix[i]) {
				sb.append(j + " ");
			}
			sb.append("\n");
		}
		return sb.toString();
	}
	
}