package TP1;

import java.awt.Graphics;

public class FormeAnimer implements IObjectAnnimable {
	 private Etoile forme;
	    private IFormeAnimable animateur;

	    public FormeAnimer (Etoile etoile, IFormeAnimable mvtCirculaire){
	        this.forme = etoile;
	        this.animateur = mvtCirculaire;
	    }

	    
		@Override
	    public void deplacer() {
	        this.animateur.deplacer(forme);
	    }

	    @Override
	    public void dessiner(Graphics g) {
	        this.forme.dessiner(g);
	    }
	    

}
