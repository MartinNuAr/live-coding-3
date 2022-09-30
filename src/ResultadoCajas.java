import java.util.Scanner;

public class ResultadoCajas {

	public static void main(String[] args) {
		
		// Se abre el scanner para ingresar los datos con el teclado
		Scanner sc = new Scanner(System.in);
		
		// En la consola manda mensaje y pide ingresar las cantidades
		// de mangos y naranjas
		
		System.out.println("Ingresa el número de mangos: ");
	    int mangos = sc.nextInt();
	     
	    System.out.println("Ingresa el número de naranjas");
	    int naranjas = sc.nextInt();
	    
	    // Crea una nueva clase con los datos ingresados

	    MangosNaranjas mangosNaranjas = new MangosNaranjas(mangos, naranjas);
	    
	    // Imprime el número máximo de cajas
		mangosNaranjas.resultadoMaxCajas(mangos, naranjas);
		
		// Imprime la cantidad de mangos y naranjas por caja
		
		mangosNaranjas.reparto(mangos, naranjas);
		
	}

} // ResultadoCajas
