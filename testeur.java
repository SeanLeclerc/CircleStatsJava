//=====================================
//Programmeur : Sean Leclerc
//Fichier : testeur.java
//Date : Oct 4, 2016activeTaskKey
//Description : activeTaskKey
//======================================
public class testeur {

	public static void main(String[] args) {
		Cercle c1 = new Cercle();
		Cercle c2 = new Cercle( 3.4 );
		System.out.println( c1.getRayon() );
		System.out.println( c1.getDiametre());
		System.out.println( c1);
		System.out.println(c1.getCirconference());
		System.out.println(c1.getAire());
		System.out.println(c2.getAire());
		c2.doublerAire();
		System.out.println( c2 );
		System.out.println( c2.getAire());
		

	}

}
