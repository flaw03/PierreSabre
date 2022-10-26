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
	
	public void provoquer(Yakuza adversaire) {
		int force = 2 * honneur;
		parler("Je t'ai retrouvé vermine, tu vas payer pour ce que tu as fait à ce pauvre marchand!");
		if (force >= adversaire.getReputation()) {
			parler("Je t’ai eu petit yakusa!");
			gagnerArgent(adversaire.getArgent());
			adversaire.perdre();
			honneur ++ ;
		}else {
			parler("J'ai perdu contre ce yakuza, mon honneur et ma bourse ont en pris un coup");
			adversaire.gagner(argent);
			perdreArgent(argent);
			honneur -- ;
		}
		
	}

}
