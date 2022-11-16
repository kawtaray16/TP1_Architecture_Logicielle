
package TP1;
import java.awt.Graphics;

/**
 */

public class AnimationForme implements IFormeAnimable{
	  private Forme forme;
	    private IFormeAnimable formeAnimable;

	    public AnimationForme(Forme forme, IFormeAnimable formeAnimable) {
	        this.forme = forme;
	        this.formeAnimable = formeAnimable;
	    }

	    @Override
	    public void deplacer() {
	        this.formeAnimable.deplacer();
	    }

	    @Override
	    public void dessiner(Graphics g) {
	        this.forme.dessiner(g);
	    }
	    

}
