
import java.util.Scanner; //Importamos la clase Scanner para obtener datos del usuario

public class Principal {

	private static Scanner teclado = new Scanner (System.in); 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double centigrados, fahrenheit;
		
		System.out.println("Introduce los grqdos centígrados:"); 
		
		centigrados = teclado.nextDouble();
		
		fahrenheit = centigrados * (9/5) + 32;
		
		System.out.print("Entonces "+centigrados+" grados centigrados son "+ fahrenheit + " grados fahrenheit");
		
		
	}

}
