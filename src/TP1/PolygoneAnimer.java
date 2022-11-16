package TP1;

import java.awt.Graphics;

public class PolygoneAnimer implements IObjectAnnimable{

	private PolygoneRegulier forme;
    private IFormeAnimable animateur;

    public PolygoneAnimer (PolygoneRegulier polygoneRegulier, IFormeAnimable mvtCirculaire){
        this.forme = polygoneRegulier;
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
