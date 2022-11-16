package TP1;

import java.awt.Graphics;

public interface IFormeAnimable {
	 /**
     * fait faire un d�placement �l�mentaire � une forme.
     *
     * @param f la forme � d�placer
     */
    public void deplacer(Forme f);

	void deplacer();

	void dessiner(Graphics g);
    
}
