package personnages;

public class Commercant extends Humain {

	public Commercant(String nom, int argent) {
		super(nom, argent,"thé" );
	}
	
	public int seFaireExtorquer() {
		int perte = getArgent();
		perdreArgent(perte);
		parler("Trop relou...... je me suis fait raquetter ");
		return perte;
	}
	
	public void recevoir(int argent) {
		gagnerArgent(argent);
		parler(argent + "e ! Je te remercie genereux donateur ");
		
	}
}
