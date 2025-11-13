package pack.poo;

public class City {
	//Les attributs privés empêchent l’accès direct.
	private String country;
	private String name;
	private int nbInhabitants;

	//constructeurs 1
	public City(String country, String name, int nbInhabitants) {
		this.country = country;
		this.name = name;
/*		this.nbInhabitants = nbInhabitants;  */
		//contrôle au moment de l'instantiation d'une new city
		if(nbInhabitants < 0 ) {
			System.out.println("Erreur : le nombre d'habitants ne peut être négatif. Valeur mise à 0 par défaut.");
			this.nbInhabitants = 0;
		}else {
			this.nbInhabitants = nbInhabitants;
		}
	}	

	//constructeurs 2
		public City(String name, int nbInhabitants){
			this.country = "Unknown";
			this.name = name;
	/*		this.nbInhabitants = nbInhabitants;  */
			//contrôle au moment de l'instantiation d'une new city
			if(nbInhabitants < 0 ) {
				System.out.println("Erreur : le nombre d'habitants ne peut être négatif. Valeur mise à 0 par défaut.");
				this.nbInhabitants = 0;
			}else {
				this.nbInhabitants = nbInhabitants;
			}
			
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
/*		this.nbInhabitants = nbInhabitants;  */
		if(nbInhabitants < 0 ) {
			System.out.println("la population ne peut pas être négative !");
		}else if (nbInhabitants < this.nbInhabitants){
			System.out.println("Attention : vous réduisez la population de " + this.name + " !");
			this.nbInhabitants = nbInhabitants;
		}else {
			this.nbInhabitants = nbInhabitants;
		}
	}
	
	public void display() {
        System.out.println("Ville de " + name + " en " + country + " ayant " + nbInhabitants + " habitants");
    }
	
}
