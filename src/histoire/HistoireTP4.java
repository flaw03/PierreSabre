package histoire;

import personnages.*;

public class HistoireTP4 {
	public static void main(String[] args) {
		Humain yoann = new Humain("yohan", 10, "sprint");
		yoann.direBonjour();
		yoann.acheter(" un pc gaming", 3);
		yoann.acheter("un coca cola cherry", 10 );
		
		Commercant adrian = new Commercant("Adrien", 20);
		adrian.direBonjour();
		adrian.seFaireExtorquer();
		adrian.recevoir(15);
		adrian.boire("thé");
		
		
		
			
	}
}
