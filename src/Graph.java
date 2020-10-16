import java.util.ArrayList;
import java.util.Iterator;

public class Graph implements GraphADT {
	/*
	 * Instance variables for the adjacency matrix storing edges, an array storing
	 * nodes, and the number of nodes
	 */
	private Edge[][] adjMatrix;
	private Node[] nodes;
	private int numNodes;

	/*
	 * constructor method
	 */
	public Graph(int n) {
		numNodes = n;
		// create a matrix big enough to store all the edges
		this.adjMatrix = new Edge[numNodes][numNodes];

		// create an array to store all the nodes and set their names
		this.nodes = new Node[numNodes];
		for (int i = 0; i < n; i++) {
			nodes[i] = new Node(i);
		}
	}

	/*
	 * method to get a node from the graph
	 */
	public Node getNode(int name) throws GraphException {
		// make sure the node is in the array, otherwise throw exception
		if (name >= nodes.length || name < 0) {
			throw new GraphException();
		}
		// return the correct node from the array
		return nodes[name];
	}

	/*
	 * method to insert an edge into the matrix
	 */
	public void insertEdge(Node u, Node v, int edgeType) throws GraphException {
		// make sure both end point nodes are in the array, else throw exception
		if (u.getName() >= nodes.length || u.getName() < 0 || v.getName() >= nodes.length || v.getName() < 0) {
			throw new GraphException();
		} else {
			// insert the edge into the matrix
			adjMatrix[u.getName()][v.getName()] = new Edge(u, v, edgeType);
			adjMatrix[v.getName()][u.getName()] = new Edge(v, u, edgeType);
		}
	}

	/*
	 * method to return an iterator of all the edges incident to a node
	 */
	public Iterator incidentEdges(Node u) throws GraphException {
		// create a list of edges
		ArrayList<Edge> list = new ArrayList<Edge>();
		// make sure the node is in the array, else throw exception
		if (u.getName() >= nodes.length || u.getName() < 0) {
			throw new GraphException();
		}

		// check the matrix to find all the nodes incident on the relevant node and add
		// to the list
		for (int i = 0; i < this.numNodes; i++) {
			if (adjMatrix[u.getName()][i] != null)
				list.add(adjMatrix[u.getName()][i]);
		}
		// return the iterator
		return list.iterator();
	}

	/*
	 * method to get an edge connecting two nodes
	 */
	public Edge getEdge(Node u, Node v) throws GraphException {
		// make sure the nodes are in the array, else throw exception
		if (u.getName() >= nodes.length || u.getName() < 0 || v.getName() >= nodes.length || v.getName() < 0) {
			throw new GraphException();
			// return the edge with the two nodes as its end points
		} else
			return adjMatrix[u.getName()][v.getName()];

	}

	/*
	 * method to check if two nodes are adjacent
	 */
	public boolean areAdjacent(Node u, Node v) throws GraphException {
		// make sure the nodes are in the array, else throw exception
		if (u.getName() >= nodes.length || u.getName() < 0 || v.getName() >= nodes.length || v.getName() < 0) {
			throw new GraphException();
		}
		if (adjMatrix[u.getName()][v.getName()] != null)
			return true;
		else
			return false;

	}

}
