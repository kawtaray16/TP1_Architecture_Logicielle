package TP1;

import java.awt.Graphics;

public class VisageAnimer implements IObjectAnnimable {
	private Visage forme;
    private IFormeAnimable animateur;

    public VisageAnimer (Visage visage, IFormeAnimable mvtCirculaire){
        this.forme = visage;
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
