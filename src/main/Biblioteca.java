package main;

import java.util.Scanner;

import classes.Libro;
import classes.Lista;

public class Biblioteca {

	public static void main(String[] args) {
		
		Lista libros= new Lista();
		int option;
		Scanner entrada = new Scanner(System.in);
		
		do {
			showMenu();
			option=entrada.nextInt();
			
			switch(option) {
			case 0:System.out.println("Bye!!");
				break;				
			case 1:addBook(libros);
				break;
			case 2:deleteBook(libros);
				break;
			case 3:showBook(libros);
				break;
			case 4:showBooks(libros);
				break;
			default:System.out.println("Opcion no valida");
					break;
			}			
			
		}while(option!=0);
	}
	
	private static void showBooks(Lista libros) {
		
		System.out.println(libros);
		
	}

	private static void showBook(Lista libros) {
		// TODO Auto-generated method stub
		
	}

	private static void deleteBook(Lista libros) {
		// TODO Auto-generated method stub
		
	}

	private static void addBook(Lista libros) {
		
		Scanner entrada = new Scanner(System.in);
		Libro libro;
		String titulo,autor;
		
		System.out.println("Dame el titulo:");
		titulo=entrada.nextLine();
		System.out.println("Dame el autor:");
		autor=entrada.nextLine();
		
		libro=new Libro(titulo,autor);
		
		libros.addElementHead(libro);
		System.out.println("Libro añadido.");
	}

	public static void showMenu() {
		
		System.out.println("1. Introducir Libro");
		System.out.println("2. Eliminar Libro");
		System.out.println("3. Buscar Libro");
		System.out.println("4. Mostrar Libros");
		System.out.println("-------------------");
		System.out.println("0. Salir");
		System.out.println("-------------------");
		System.out.println();
		System.out.println("Introduzca opcion:");
	}

}
