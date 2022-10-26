package personnages;

public class Yakuza extends Humain {
	
	private String clan ;
	private int reputation = 0 ;
	
	public Yakuza(String nom, int argent, String boisson, String clan) {
		super(nom, argent, boisson);
		this.clan = clan;
	}

	public int getReputation() {
		return reputation;
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
	
	public void perdre() {
		parler("J’ai perdu mon duel et mes "+ argent + "e, snif... J'ai déshonoré le clan de "+ clan +".");
		argent = 0;
		reputation -=1;
	}
	
	public void gagner(int gain) {
		argent += gain ;
		reputation ++ ;
		parler("J'ai la vaincu la vermine de ronine , il vraiment crue vaincre un membre "+ clan +" ?\nJe l'ai depouiller des ses "+ gain+"e.");
	}





}
