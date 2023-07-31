import java.util.Scanner;
public class Nombre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Escribe un nombre: ");
		Scanner sc = new Scanner(System.in);
		String nombre = sc.nextLine();
	    printNameLength(nombre);
	    printNameCharacters(nombre);
	    printName(nombre);
		
	}//main
	
    private static void printNameLength( String name )
    {
      System.out.println("La longitud del nombre es: " + name.length());
    }//longitud

    private static void printNameCharacters( String name )
    {

		int longitud = name.length();

		for (int i = 0; i < longitud; i++) {
			char letra = name.charAt(i);
			System.out.println(letra);
		}
    }
		
		
	    private static void printName( String name )
	    {
	    	System.out.println(name);
	    }
 

}// class Nombre
