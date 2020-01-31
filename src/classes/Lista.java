package classes;

public class Lista {

	private int size;
	private Node head;

	public Lista() {
		size = 0;
		head = null;
	}

	public void addElementHead(Libro libro) {
		Node n = new Node(libro);
		n.setSiguiente(head);
		head = n;
		size++;
	}

	public void addElementTail(Libro libro) {
		Node n = new Node(libro), aux;

		if (head == null) {
			head = n;
		} else {
			aux = head;
			while (aux.getSiguiente() != null) {
				aux = aux.getSiguiente();
			}
			aux.setSiguiente(n);
		}
		size++;
	}

	public boolean contains(Libro libro) {
		boolean encontrado = false;

		Node aux = head;

		while (aux != null && !encontrado) {
			if (aux.getInfo().compareTo(libro)==0)
				encontrado = true;
			else
				aux = aux.getSiguiente();

		}

		return encontrado;
	}

	public Libro getHead() {
		if (head == null)
			return null;
		else {
			Libro libro = head.getInfo();
			head = head.getSiguiente();
			size--;
			return libro;
		}
	}

	public Libro getTail() {
		Libro libro = null;
		Node aux;

		if (head == null)
			return null;
		else if (head.getSiguiente() == null) {
			libro = head.getInfo();
			head = null;
			size--;
			return libro;
		} else {
			aux = head;
			while (aux.getSiguiente().getSiguiente() != null) {
				aux = aux.getSiguiente();
			}
			libro = aux.getSiguiente().getInfo();
			aux.setSiguiente(null);
			size--;
			return libro;
		}
	}

	public boolean delete(Libro libro) {
		
		Node aux;
		
		if(head==null)
			return false;
		else if (head.getSiguiente()==null) {
			if(head.getInfo().compareTo(libro)==0) {
				head = null;
				size--;
				return true;
			}else {
				return false;
			}				
		}else {
			if(head.getInfo()==libro) {
				head=head.getSiguiente();
				size--;
				return true;
			}else {
				aux=head;
				while(aux.getSiguiente()!=null && aux.getSiguiente().getInfo().compareTo(libro)!=0) {					aux=aux.getSiguiente();
				}
				if(aux.getSiguiente()==null) {
					return false;
				}else {
					aux.setSiguiente(aux.getSiguiente().getSiguiente());
					size--;
					return true;
				}
			}			
		}
	}

	public String toString() {
		String salida = "Size = " + size + "\n";

		Node aux = head;

		while (aux != null) {
			salida += aux + "\n";
			aux = aux.getSiguiente();
		}

		return salida;
	}

}
