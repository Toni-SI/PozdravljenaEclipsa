//deklariramo javni razred
public class Steklenica {
	
	//deklariramo lastnosti
	private String vrstaVsebine;
	private int kapaciteta;
	private int kolicinaVsebine;
	private boolean jeOdprta;
	
	//deklariramo konstruktor s katerim ustvarimo nov objekt - mora biti enako imenu datoteke in imenu razreda
	//vhod: kapaciteta in vrsta vsebine
	//vrne: nov objekt razreda Steklenica
	public Steklenica(int k, String v) {
		
		//inicializiramo lastnosti
		vrstaVsebine = v;
		kapaciteta = k;
		kolicinaVsebine = k;
		jeOdprta = false;
		
	} //konec konstruktorja
	
	//metoda, ki vrne količino vsebine
	//vhod: /
	//izhod: kolicinaVsebine
	public int getkolicinaVsebine() {
	
		//vrne vrednost lastnosti kolicinaVsebine
		return kolicinaVsebine;
	}
	//metoda za praznenje steklenice
	//vhod: količina, ki jo želimo izprazniti
	//izhod: koliko je še ostalo
	public int izprazni(int kolicina) throws Exception {

		//če je steklenica odprta - ne rabimo pisat == true
		if(jeOdprta) {

			//izpraznimo vsebino
			kolicinaVsebine -= kolicina;
			
			//preverimo, da ni količina v minus
			if(kolicinaVsebine < 0) {
				
				//postavimo količino vsebine na 0
				kolicinaVsebine = 0;
				
				//izpišemo izjemo
				throw new Exception("V steklenici ni bilo dovolj vode");
			}

		}
	
		//če je steklenica zaprta
		else {
			throw new Exception("Steklenica je zaprta.");
				//vrne vrednost lastnosti kolicinaVsebine
		}
		
		return kolicinaVsebine;
	
	}

	
	//javna konstanta metode, ki vrne vrsto vsebine
	//vhod: x
	//izhod: vsebina
	public String getVrstaVsebine() {
		return vrstaVsebine;
	}
	
	
	
	//metoda, ki odpre steklenico
	//vhod: /
	//izhod: vrne uspešnost odpiranja
	public boolean odpri() {
		//spremeni jeOdprta na true
		jeOdprta = true;
		
		//v vsakem primeru vrne true
		return true;
	}


}