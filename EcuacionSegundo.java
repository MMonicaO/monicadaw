
import java.util.Scanner;

public class EcuacionSegundo {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double a=0;
		double b=0;
		double c=0;
		double d=0;
		double x1=0;
		double x2=0;
		
		Scanner teclado=new Scanner(System.in);
		
		System.out.println("Introduzca el valor de a");
		a=teclado.nextDouble();
		if(a==0) {
			
			System.out.println("Ecucacion de segundo grado inexistente");
			return;
		}
		
			
			System.out.println("Introduzca el valor de b");
			b=teclado.nextDouble();
			System.out.println("Introduzca el valor de c");
			c=teclado.nextDouble();
			
			
			
			d=b*b-4*a*c;
			x1=(-b+sqrt(d))/2;
			x2=(-b-sqrt(d))/2;
			if(d<0) { 
				System.out.println("Ecuacion con solucion compleja");
				return;
			
			}
			System.out.println("La solucion de la ecuacion es" +  x1  +  x2);
		
			teclado.close();
	}

	private static double sqrt(double d) {
		// TODO Auto-generated method stub
		return 0;
	}
		

}
