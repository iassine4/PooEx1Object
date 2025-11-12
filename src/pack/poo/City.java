package pack.poo;

public class City {

	public String country;
	public String name;
	public int nbInhabitants;

	//constructeurs
	public City(String country, String name, int nbInhabitants) {
		this.country = country;
		this.name = name;
		this.nbInhabitants = nbInhabitants;
	}	
/*
	//méthodes d'affichages
	public void display() {
		System.out.println("Nom de la ville : " + this.name + "\t" +
						   "Pays : " + this.country + "\t" +
						   "Nombre d'habitants : " + this.nbInhabitants);
	}
*/
	
	//méthodes d'affichages
	public String toString() {
		return "Nom de la ville : " + getName() + "\t" +
						   "Pays : " + getCountry() + "\t" +
						   "Nombre d'habitants : " + getNbInhabitants();
	}
	
	//accesseurs/getters 
	public String getCountry() {
		return country;
	}
	//Mutateurs/setters
	public void setCountry(String country) {
		this.country = country;
	}
	
	//accesseurs/getters 
	public String getName() {
		return name;
	}
	//Mutateurs/setters
	public void setName(String name) {
		this.name = name;
	}
	
	//accesseurs/getters
	public int getNbInhabitants() {
		return nbInhabitants;
	}

	//Mutateurs/setters
	public void setNbInhabitants(int nbInhabitants) {
		this.nbInhabitants = nbInhabitants;
	}
	
	
}
