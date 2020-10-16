
public class Edge {
	/*
	 * Instance variables for the first and second nodes, and the type
	 */
	private Node u;
	private Node v;
	private int type;

	/*
	 * constructor for edge
	 */
	public Edge(Node u, Node v, int type) {
		this.u = u;
		this.v = v;
		this.type = type;
	}

	/*
	 * method to get the first endpoint node
	 */
	public Node firstEndpoint() {
		return this.u;
	}

	/*
	 * method to get the second endpoint node
	 */
	public Node secondEndpoint() {
		return this.v;
	}

	/*
	 * method to get the type of the edge
	 */
	public int getType() {
		return this.type;
	}

}
