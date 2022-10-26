package histoire;

import personnages.*;

public class HistoireTP4 {
	public static void main(String[] args) {
		Humain yoann = new Humain("yohan", 10, "sprint");
		yoann.direBonjour();
		yoann.acheter(" un pc gaming", 3);
		yoann.acheter("un coca cola cherry", 10 );
		
		Commercant lopez = new Commercant("Lopez", 20);
		lopez.direBonjour();
		lopez.seFaireExtorquer();
		lopez.recevoir(15);
		lopez.boire("thé");
		
		Yakuza adrian = new Yakuza("Adrian",30,"whisky","Warsong");
		adrian.extorquer(lopez);
		
		Ronin roro = new Ronin("Roro", 60, "shochu");
		roro.donner(lopez);
	}
}
