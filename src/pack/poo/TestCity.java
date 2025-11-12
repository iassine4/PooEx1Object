package pack.poo;

public class TestCity {

	public static void main(String[] args) {

		City toulouse = new City("France","Toulouse", 450000);
		City rabat = new City("Maroc","Rabat", 500000);
		City paris = new City("Paris", "France", -500000);
		
		//affichage
/*		toulouse.display();    */
		
		System.out.println(toulouse + "\n");
		System.out.println(rabat + "\n");
		
		toulouse.setNbInhabitants(-500);
		System.out.println(toulouse + "\n");
		System.out.println(paris + "\n");

	}

}
