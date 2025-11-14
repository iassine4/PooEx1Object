package pack.poo;

public class City {
	//Les attributs privés empêchent l’accès direct.
	private String country;
	private String name;
	private int nbInhabitants;
	
	private static int cityCount = 0;
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
		cityCount = getCityCount() + 1; // incrémentation du compteur
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
			cityCount = getCityCount() + 1; // incrémentation du compteur
		}
		//constructeur pour TestPerson
		public City(String name, String country) {
			this.name = name;
			this.country = country;
			this.nbInhabitants = 0;
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
	
	public static int getCityCount() {
		return cityCount;
	}
	
	public void display() {
        System.out.println("Ville de " + name + " en " + country + " ayant " + nbInhabitants + " habitants");
    }

	//méthodes d'affichages
	public String toString() {
		String result = name + " , " + country;
	    if(nbInhabitants > 0) {
	        result += " , " + nbInhabitants + " habitants";
	    }
	    return result;
	/*
		if (nbInhabitants > 0)
		return "Nom de la ville : " + getName() + "\t" +
						   "Pays : " + getCountry() + "\t" +
						   "Nombre d'habitants : " + getNbInhabitants();
		else
			return name + ", " + country;
	*/
	}
	
	
}
