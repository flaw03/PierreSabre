package personnages;

public class Ronin extends Humain {
	
	private int honneur = 1 ;  

	public Ronin(String nom, int argent, String boisson) {
		super(nom, argent, boisson);
	} 
	
	public void donner(Commercant beneficiaire) {
		int don = argent / 10;
		perdreArgent(don);
		parler(beneficiaire.getNom() + " prend les " + don +"e");
		beneficiaire.recevoir(don);	
	}
}
