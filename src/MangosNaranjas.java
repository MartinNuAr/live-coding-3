
public class MangosNaranjas {
	
	private int mangos;
	private int naranjas;
	public MangosNaranjas(int mangos, int naranjas) {
		this.mangos = mangos;
		this.naranjas = naranjas;
	} // MangosNaranjas
	
	public void reparto(int mangos, int naranjas) {
		int totalPorCaja = (mangos + naranjas) / (maxCajas(mangos, naranjas));
		
		double mangosPorCaja = ((double) mangos/((double) naranjas + (double) mangos)) * totalPorCaja;
		double naranjasPorCaja = ((double)naranjas/((double)naranjas + (double)mangos)) * totalPorCaja;
		
		System.out.println("Los mangos por caja son: " + String.format("%.0f", mangosPorCaja));
		System.out.println("Las naranjas por caja son: " + String.format("%.0f", naranjasPorCaja));
	} // reparto
	
	public int maxCajas(int mangos, int naranjas) {
			 
	        int max = Math.max(mangos, naranjas); // El número más grande de los ingresados
	        int min = Math.min(mangos, naranjas); // El número más pequeño de los ingresados
	 
	        int cajas = 0;
	        do {
	            cajas = min;
	            min = max % min;
	            max = cajas;
	 
	        } while (min != 0);
	        
	        return cajas;
	        
	    } // maxCajas
	
	public void resultadoMaxCajas(int mangos, int naranjas) {
		System.out.println("El número máximo de cajas es: " + maxCajas(mangos, naranjas));
	}
	
} // MangosNaranjas
