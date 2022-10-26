package personnages;

public class Commercant extends Humain {

	public Commercant(String nom, int argent) {
		super(nom, argent,"thé" );
	}
	
	public void seFaireExtorquer() {
		argent = 0;
		parler("Trop relou...... je me suis fait raquetter ");
	}
	
	public void recevoir(int argent) {
		super.gagnerArgent(argent);
		super.parler(argent + "e ! Je te remercie genereux donateur ");
		
	}
}
