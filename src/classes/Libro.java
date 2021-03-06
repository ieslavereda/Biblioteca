package classes;

public class Libro implements Comparable{
	
	private String titulo;
	private String autor;
	
	public Libro(String titulo, String autor) {
		super();
		this.titulo = titulo;
		this.autor = autor;
	}
	public Libro(String titulo) {
		super();
		this.titulo = titulo;
		this.autor = "";
	}

	public String getTitulo() {
		return titulo;
	}

	public String getAutor() {
		return autor;
	}

	@Override
	public String toString() {
		return "Libro [titulo=" + titulo + ", autor=" + autor + "]";
	}

	@Override
	public int compareTo(Object o) {
		Libro l = (Libro)o;
		return titulo.compareToIgnoreCase(l.getTitulo());
	}
	
}
