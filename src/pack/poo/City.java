package pack.poo;

public class City {

	public String country;
	public String name;
	public int nbInhabitants;

	public City(String country, String name, int nbInhabitants) {
		this.country = country;
		this.name = name;
		this.nbInhabitants = nbInhabitants;
	}	
	
	public void display() {
		System.out.println("Nom de la ville : " + this.name + "\t" +
						   "Pays : " + this.country + "\t" +
						   "Nombre d'habitants : " + this.nbInhabitants);
	}
}
