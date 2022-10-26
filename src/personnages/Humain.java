package personnages;

public class Humain {
	protected String nom;
	protected int argent;
	protected String boisson;
	
	
	
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
	
	
	public void parler(String texte) {
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
			parler("J'ai que " + argent + "je ne peux pas m'acheter " + bien + " à " + prix);
		}
	}
	
	public void gagnerArgent(int gain) {
		argent += gain;
	}
	
	public void perdreArgent(int perte) {
		argent -= perte;
	}
	
	
	
	
}
