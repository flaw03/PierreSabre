package histoire;

import personnages.* ;

public class HistoireTP5 {

	public static void main(String[] args) {
		
		Commercant marco = new Commercant("Marco", 20);
		Ronin roro = new Ronin("Roro", 60, "shochu");
		Yakuza yaku = new Yakuza("Yaku Le Noir",30,"whisky", "Warsong");
		Commercant chonin = new Commercant("Chonin", 40);
		Commercant kumi = new Commercant("Kumi", 10);
		
		System.out.println("Le marchand Marco rencontre le ronin.");
		marco.faireConnaissanceAvec(roro);
		
		System.out.println(" \n Le marchand Marco rencontre le yakuza.");
		marco.faireConnaissanceAvec(yaku);
		
		System.out.println("\nLe marchand Marco rencontre un autre marchand.");
		marco.faireConnaissanceAvec(chonin);
		
		System.out.println("\nLe marchand Marco rencontre un autre marchand.");
		marco.faireConnaissanceAvec(kumi);
		System.out.println("\n");
		marco.lister();
		System.out.println("\n");
		yaku.lister();
		System.out.println("\n");
		Samourai akimoto = new Samourai("Miyamoto", "Akimoto", "saké", 80);
		marco.faireConnaissanceAvec(akimoto);
		System.out.println("\n");
		akimoto.boire("thé");
		marco.lister();

		System.out.println("\n");
		Traitre masako = new Traitre("Miyamoto", "Masako", "whisky",100);
		masako.faireLeGentil();
		masako.ranconner(kumi);
		masako.ranconner(chonin);
		masako.ranconner(marco);
		masako.faireConnaissanceAvec(akimoto);
		masako.ranconner(kumi);
		masako.faireConnaissanceAvec(yaku);
		masako.faireLeGentil();
		masako.faireConnaissanceAvec(roro);



		
		

	}

}
