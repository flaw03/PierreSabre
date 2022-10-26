package personnages;

public class Yakuza extends Humain {
	
	private String clan ;
	private int reputation = 0 ;
	
	public Yakuza(String nom, int argent, String boisson, String clan) {
		super(nom, argent, boisson);
		this.clan = clan;
	}

	
	public void extorquer(Commercant victime) {
		parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?");
		parler( victime.getNom() + "Donne moi ta moula si tu veux pas mourir .");
		int argentVole= victime.getArgent();
		argent += argentVole;
		victime.seFaireExtorquer();
		parler("La pêche était bonne je me suis fait " + argentVole +"gratuit ça me fait " + argent +"." );
		reputation ++;

		
	}





}
