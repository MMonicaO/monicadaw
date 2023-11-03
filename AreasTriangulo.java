import java.util.Scanner;

public class AreasTriangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Hallar areas de un triangulo
		
		int base=0;
		int altura=0;
		double area=0;
		
		Scanner teclado=new Scanner(System.in);
		
		System.out.println("Introduzca la base");
		
		base = teclado.nextInt();
		
		System.out.println("Introduzca la altura");
		
		altura = teclado.nextInt();
		
		area=(base*altura/2);
		
		System.out.println("El area es: " +area);
		
		
		
		
	}

}
