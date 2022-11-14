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
		int argentVole= victime.seFaireExtorquer();
		gagnerArgent(argentVole);
		parler("La pêche était bonne je me suis fait " + argentVole +"gratuit ça me fait " + getArgent() +"." );
		reputation ++;
	}
	
	public void perdre() {
		parler("J’ai perdu mon duel et mes "+ getArgent() + "e, snif... J'ai déshonoré le clan de "+ clan +".");
		perdreArgent(getArgent());
		reputation-- ;
	}
	
	public void gagner(int gain) {
		gagner(gain);
		reputation ++ ;
		parler("J'ai la vaincu la vermine de ronine , il vraiment crue vaincre un membre "+ clan +" ?\nJe l'ai depouiller des ses "+ gain+"e.");
	}
	
	@Override
	public void direBonjour() {
		super.direBonjour();
		parler("Mon clan est "+ clan +" aka le meilleur clan du Japon");
		
	}
}
