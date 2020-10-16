
public class Node {
	/*
	 * Instance variables for the node name and mark
	 */
	private int name;
	private boolean mark;

	/*
	 * Constructor for Node set mark to unmarked for all nodes at first
	 */
	public Node(int name) {
		this.name = name;
		this.mark = false;
	}

	/*
	 * Method to set mark
	 */
	public void setMark(boolean mark) {
		this.mark = mark;
	}

	/*
	 * Method to get mark
	 */
	public boolean getMark() {
		return this.mark;
	}

	/*
	 * Method to get name
	 */
	public int getName() {
		return this.name;
	}

}
