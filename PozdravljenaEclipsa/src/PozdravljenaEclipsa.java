/**
 * 
 */

/**
 * @author user
 *
 */
public class PozdravljenaEclipsa {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Izpišemo Pozdravljen svet
		System.out.println("Pozdravljena Eclipsa!");
		
		//ustvarimo pivsko steklenico
		PivskaSteklenica ps = new PivskaSteklenica(4, "Lasko");
		
		//odpremo steklenico
		ps.odpri();
		
		//izpraznimo steklenico
		try {
			ps.izprazni(100);
			System.out.println("Iz steklenice " + ps.getZnamka() + " sem izpraznil 100ml piva.");
			System.out.println("Ostane se " + ps.getkolicinaVsebine() + "ml piva.");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Prislo je do napake pri praznenju steklenice.");
		}
	
	}

}
