package personnages;

public class Commercant extends Humain {

	public Commercant(String nom, int argent) {
		super(nom, argent,"thé" );
	}
	
	public void seFaireExtorquer() {
		perdreArgent(argent);
		parler("Trop relou...... je me suis fait raquetter ");
	}
	
	public void recevoir(int argent) {
		gagnerArgent(argent);
		parler(argent + "e ! Je te remercie genereux donateur ");
		
	}
}
