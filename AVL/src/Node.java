
public class Node <E>{
	protected E data;
	protected Node left, right;
	protected int Fe ; 
	
	public E getData() {
		return data;
	}
	public void setData(E data) {
		this.data = data;
	}
	public Node getLeft() {
		return left;
	}
	public void setLeft(Node left) {
		this.left = left;
	}
	public Node getRight() {
		return right;
	}
	public void setRight(Node right) {
		this.right = right;
	}
	public Node(E data, Node left, Node right) {
		this.data = data;
		this.left = left;
		this.right = right;
		this.Fe = 0 ; 
	}
	public Node(E data) {
		this (data,null,null);
	}
	public int getFe() {
		return Fe;
	}
	public void setFe(int fe) {
		Fe = fe;
	}
	
}

