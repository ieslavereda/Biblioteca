package classes;

public class Node {
	
	private Libro info;
	private Node siguiente;
	
	public Node(Libro libro) {
		this.info=libro;
		this.siguiente=null;
	}
	
	public Libro getInfo() {
		return info;
	}
	
	public Node getSiguiente() {
		return siguiente;
	}
	
	public void setSiguiente(Node siguiente) {
		this.siguiente=siguiente;
	}

	@Override
	public String toString() {
		return info.toString();
	}
	
}
