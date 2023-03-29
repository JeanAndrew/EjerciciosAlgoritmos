package Contenidos;

public class Main {
 public static void main(String[]args) {
	 paginawebFacade facade = new paginawebFacade();
	 String Contenido=facade.display();
	 System.out.print(Contenido);
 }
}
