package TP1;

import java.awt.Graphics;

public interface IFormeAnimable {
	 /**
     * fait faire un déplacement élémentaire à une forme.
     *
     * @param f la forme à déplacer
     */
    public void deplacer(Forme f);

	void deplacer();

	void dessiner(Graphics g);
    
}
