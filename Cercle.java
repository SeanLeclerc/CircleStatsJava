//=====================================
//Programmeur : Sean Leclerc
//Fichier : lab03.java
//Date : Oct 4, 2016activeTaskKey
//Description : Cercle
//======================================

public class Cercle {
	//variable
	private double rayon = 0.0;
	//constructeur
	public Cercle() {
	rayon =	Math.random()*100;
	}
	public Cercle( double r ) {
		this.rayon = r;
	}
	
	//Methodes Accesseur
	public double getRayon() {
		return rayon;
	}
	public double getDiametre() {
		return 2*rayon;
	}
	public String toString() {
		return "Ce cercle a un rayon de " + rayon;
	}
	public double getCirconference(){
		return 2*Math.PI*rayon;
		
	}
	public double getAire(){
		return Math.PI*rayon*rayon;
	

	}
	public void doublerRyon(){
		rayon = rayon *=2;
	}
	public void doublerAire() {
	rayon *= Math.sqrt(2);
}
}
	
