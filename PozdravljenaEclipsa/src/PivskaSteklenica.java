//definiramo razred, ki razširi razred Steklenica
public class PivskaSteklenica extends Steklenica {
	
	//vse lastnosti, deklarirane v nadrazredu se prenesejo
	//deklariramo samo nove
	private boolean jePovratna;
	private String znamka;
	private int odstotekAlkohola;
	
	//deklariramo konstruktor
	//vhod: stopnja alko, znamka piva
	
	/**
	 * @param a Stopnja alkohola
	 * @param z znamka piva
	 */
	public PivskaSteklenica(int a,String z) {
		
		//pred super ne sme biti nič drugega
		//pokličemo konstruktor nadrazreda
		super(526, "LaskoPivo");
		
		//določimo ostale lastnosti
		jePovratna = true;
		znamka = z;
		odstotekAlkohola = a;
	}
	
	//deklariramo nov konstruktor
	//vhod: stopnja alko, znamka piva, kapaciteta, je povratna
	public PivskaSteklenica(int a, String z, int k, boolean p) {
		
		
		//pokličemo konstruktor nadrazreda
		super(k, "LaskoPivo");
		
		//določimo ostale lastnosti
		jePovratna = p;
		znamka = z;
		odstotekAlkohola = a;
	}

	/**
	 * @return znamka piva v steklenici
	 */
	public String getZnamka() {
		return znamka;
	}
	
	/**
	 * @return znamka piva ki naj bo v steklenici
	 */
	public void setZnamka(String znamka) {
		this.znamka = znamka;
	}
	
	
	
}