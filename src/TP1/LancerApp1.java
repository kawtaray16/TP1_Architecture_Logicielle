package TP1;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class LancerApp1 {
public static void main(String[] args) throws IOException {
		
		BufferedImage imgVador= ImageIO.read(new File("C:/Users/ISSER TECH/Desktop/1664737199249.jpg"));
		BufferedImage imgLeila= ImageIO.read(new File("C:/Users/ISSER TECH/Desktop/1664737199249.jpg"));
		
		// création de la fenêtre de l'application
		JFrame laFenetre= new JFrame("Animation Train, etc.");
		laFenetre.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		laFenetre.setSize(512, 512);
		
		// création de la zône de dessin dans la fenêtre
		Dessin d = new Dessin();
		laFenetre.getContentPane().add(d);
		
		// affiche la fenêtre
		laFenetre.setVisible(true);
		
		// les trains de cercles avec image et en couleur
		TrainCercle[] lesTrains= new TrainCercle[10];
		lesTrains[0] = new TrainCercleImage(d, 10, imgVador); d.ajouterObjet(lesTrains[0]);
		lesTrains[1] = new TrainCercleImage(d, 10, imgLeila); d.ajouterObjet(lesTrains[1]);
		for (int i = 2; i < 10; i++) {
			lesTrains[i] = new TrainCercleCouleur(new Color((float) Math.random(), (float) Math.random(),
		(float) Math.random()), d, 10, 10);
		d.ajouterObjet(lesTrains[i]);
		}
		//Permet de créer le visage qui tourne
		Visage v = new Visage(d);
		d.ajouterObjet(v);
		
		//Question 15 permet d'ajouter des formes dans l'application
	
		
		//Creer le première fome Etoile verte fixe
		Forme f1= new Etoile(350, 100, 50, 8.f, Color.GREEN, Color.GREEN);
		d.ajouterObjet(f1);
		//Creer la deuxieme forme le polygone noire fix
		Forme f2=new PolygoneRegulier (5, 240, 40, 10, 4.0f, Color.DARK_GRAY, null);
		d.ajouterObjet(f2);
		//Crrer une forme étoile de couleur jaune qui circule 
		//Forme f3= new Etoile(350, 100, 50, 8.f, Color.YELLOW, Color.YELLOW);
		//MvtCirculaire mvtCirculaire = new MvtCirculaire(100, 100, 200, 0, -10); 
		
		  d.ajouterObjet(
	                new FormeAnimer(
	                        new Etoile(400, 400, 40, 10.0f, Color.YELLOW, Color.YELLOW),
	                        new MvtCirculaire(100, 100, 200, 0, -10)
	                )
	        );
	     
	        

	        d.ajouterObjet(
	                new PolygoneAnimer(
	                        new PolygoneRegulier(5, 240, 40, 10, 4.0f, Color.GRAY, null),
	                        new MvtCirculaire(100, 100, 200, 0, -10)
	                )
	        );
	        // la boucle d'animation
	        while (true) {

	            // fait réaliser aux objets animables un déplacement élémentaire
	            d.animer();
	            // la zone de dessin se réaffiche
	            d.repaint();

	            // un temps de pause pour avoir le temps de voir le nouveau dessin
	            d.pause(50);
	        }
	        
		
	

		
		

		
		
		
		

	}


}
