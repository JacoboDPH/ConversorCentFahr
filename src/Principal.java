
import java.util.Scanner; //Importamos la clase Scanner para obtener datos del usuario

public class Principal {

	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Se declaran las varibles que se van a utilizar 
		 
		double centigrados, fahrenheit;
		byte opcion;

		System.out.println(
				
				"Elige una opción \n1-Convertir de centígrados a Fahrenheit\n2-Convertir de Fahrenheit a centígrados");

		opcion = teclado.nextByte();

		if (opcion == 1) {

			System.out.println("Introduce los grqdos centígrados:");

			centigrados = teclado.nextDouble();
		
			fahrenheit = 32+((9*centigrados)/5);

			System.out
					.print("Entonces " + centigrados + " grados centigrados son " + fahrenheit + " grados fahrenheit");

		} else if (opcion == 2) {

			System.out.println("Introduce los grqdos Fehrenheit:");

			fahrenheit = teclado.nextDouble();

			centigrados = 5*((fahrenheit -32 )/9);
			
					
			System.out
					.print("Entonces " + centigrados + " grados centigrados son " + fahrenheit + " grados fahrenheit");
			
		}
		
	}

}
