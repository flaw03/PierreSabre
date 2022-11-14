package personnages;

import java.util.Random;

public class Traitre extends Samourai {

	private int niveauTraitrise = 0 ; 
	
	public Traitre(String seigneur ,String nom, String boisson,int argent) {
		super(seigneur,nom, boisson, argent);
	}

	public void direBonjour() {
		super.direBonjour();
		parler("Mon niveau de traitrise et de " + niveauTraitrise);
	}
	
	public void ranconner(Commercant commercant) {
		if (niveauTraitrise < 3) {
			int argentRanconer = 2*commercant.getArgent()/10;
			commercant.perdreArgent(argentRanconer);
			gagnerArgent(argentRanconer);
			niveauTraitrise++;
			parler("Paye " + argentRanconer +"e sinon je laise les gentilles yukuza te raquetter");
			commercant.parler("je vais te donner ca tout de suite grand " +getNom());
		}
		else{
			parler("Mince je ne peux ranconner un commercant sinon les samourai vont me faire ");
		}
	}

	public void faireLeGentil() {
		if (nbConnaissance<1){
			parler("Je peux faire ami avec personne je suis trop un crevard");
		}
		else{
		Random random = new Random();
		int chanceux = random.nextInt(0, nbConnaissance);
		int don = getArgent()*1/20;
		memoire[chanceux].gagnerArgent(don);
		perdreArgent(don);
		parler("Il faut absolument que je donne de la moula sinon personne va me faire confiance go gratter l'amitier avec "+ memoire[chanceux].getNom());
		parler("Salut "+memoire[chanceux].getNom()+"je vais te faire don de " + don);
		memoire[chanceux].parler("Wooaw t'es vraiment un chouette type merci pour les " +don +"e.");
		}
		if (niveauTraitrise>0){
			niveauTraitrise--;
		}
	}
}
