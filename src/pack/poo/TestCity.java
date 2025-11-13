package pack.poo;

public class TestCity {

	public static void main(String[] args) {
		
/*===== Exercice 1.2 =====
		City toulouse = new City("France","Toulouse", 450000);
		City paris = new City("Paris", "France", -500000);
		City rabat = new City("Maroc","Rabat", 500000);
		
		System.out.println(toulouse + "\n");
		
		toulouse.setNbInhabitants(-500);
		System.out.println(toulouse + "\n");
		System.out.println(paris + "\n");
*/
		
		//affichage
/*		toulouse.display();    */
//===== Exercice 1.3 =====
		City rabat = new City("Rabat", 500000);
		System.out.println("Nom de la ville :  " + rabat.getName() +
							" Pays :  " + rabat.getCountry() +
							" Nombre d'habitants " + rabat.getNbInhabitants());
		
		rabat.setCountry("Maroc");
		System.out.println(rabat + "\n");
		
//===== Exercice 1.3 =====		
		City toulouse = new City("France","Toulouse", 450000);
		//affichage
		toulouse.display();
	}

}
