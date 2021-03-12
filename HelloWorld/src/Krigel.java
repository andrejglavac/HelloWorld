


// deklariramo javni razred Krigel, ki razširja razred Kozarec
public class Krigel extends Kozarec {
	
	// deklariramo lastnosti, ki so značilne samo za Krigle, ne pa tudi za Kozarce
	private String material;
	private String oblikaRocaja;
	private boolean imaPokrov;
	private boolean pokrovOdprt;
	
	// deklariramo nov konstruktor
	public Krigel (int k, String m, String or, boolean ip) {
		
		// kličemo konsturktor nadrazreda
		super (k);
		
		// inicializiramo lastnosti
		material = m;
		oblikaRocaja = or;
		imaPokrov = ip;
		pokrovOdprt = false;
		
	}
	
	// deklariramo novo metodo
	public void odpriPokrov() throws Exception {
		
		// če krigel nima pokrova, vrže izjemo
		if (!imaPokrov){
			throw new Exception ("Ta krigel nima pokrova");
		}
		
		
		// spremenimo lastnosti
		pokrovOdprt = true;
		
	}
	
		// metoda vrne material
		public String getMaterial () {
			
			return Material;
		}
}