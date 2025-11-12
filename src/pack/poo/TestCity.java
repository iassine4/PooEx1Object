package pack.poo;

public class TestCity {

	public static void main(String[] args) {

		City toulouse = new City("France","Toulouse", 20000);
		
		System.out.println("nom de la ville : " + toulouse.name + "\t" + 
							"pays : " + toulouse.country + "\t" + 
							"Nombre d'habitants : " + toulouse.nbInhabitants);
	}

}
