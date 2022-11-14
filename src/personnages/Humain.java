package personnages;

public class Humain {
	private String nom;
	private int argent;
	private String boisson;
	private int taille = 4;
	protected Humain[] memoire = new Humain[taille];
	protected int nbConnaissance = 0 ;

	
	
	public Humain(String nom, int argent, String boisson) {
		this.nom = nom;
		this.argent = argent;
		this.boisson = boisson;
	
	}
	

	public int getArgent() {
		return argent;
	}
	
	public String getNom() {
		return nom;
	}
	
	
	protected void parler(String texte) {
		System.out.println( nom + " :" + texte);
		
	}
	
	public void direBonjour() {
		parler("Bonjour Je m’appelle " + nom + " et j’aime boire du " + boisson);
	}
	
	public void boire(String boisson) {
		parler("Mmmm, un bon verre de " + boisson + " ! GLOUPS !");
	}
	
	public void acheter( String bien ,int prix) {
		if (prix < argent) {
			parler("J'ai assez d'argent pour m'acheter " + bien +" à " + prix + "e.");
			perdreArgent(prix);
		}
		else {
			parler("J'ai que " + argent + "je ne peux pas m'acheter " + bien + " à " + prix +"e");
		}
	}
	
	protected void gagnerArgent(int gain) {
		argent += gain;
	}
	
	protected void perdreArgent(int perte) {
		argent -= perte;
	}
	
	
	public void faireConnaissanceAvec(Humain humain) {
		memoriser(humain);
		humain.memoriser(this);
		repondre(humain);
			
	}
	
	private void memoriser(Humain humain) {
		if (nbConnaissance < taille){
			memoire[nbConnaissance]=humain;
			nbConnaissance++;
		}
		else {
			int i = 0;
			for (i=0; i < (taille - 1);i++){
				memoire[i]=memoire[i+1];
			}
			memoire[(taille - 1)]=humain;
			}
			
		}
	
	private void repondre(Humain humain) {
		direBonjour();
		humain.direBonjour();
	}
	
	public void lister() {
		if (nbConnaissance == 0) {
			parler("je ne connais personne snifff");
		}
		else {
			String mesPote = "" ;
			for (int i = 0; i<nbConnaissance;i++) {
				mesPote += memoire[i].getNom() + "," ;
			}
			parler("Mes copains sont "+mesPote.substring(0,mesPote.length()-1) + ".");
		}
	}
	
	
}
