package pack.poo;

public class Person {

	public String name;
	public String firstName;
	public int age;
	public String address;
	public City bornCity;
	/**
	 * @param name
	 * @param firstName
	 * @param age
	 * @param address
	 */
	
	// === Constructeurs ===
	public Person(String name, String firstName, int age, String address, City bornCity) {
		/*this.name = name;
		this.firstName = firstName;
		this.age = age;
		this.address = address;*/
		setName(name);
		setFirstName(firstName);
		setAge(age);
		setAddress(address);
		setBornCity(bornCity);
		
	}
	
	// Constructeur de copie
	public Person(Person person) {
		setName(person.getName());
		setFirstName(person.getFirstName());
		setAge(person.getAge());
		setAddress(person.getAddress());
		setBornCity(person.getBornCity());
	}
	
	// Constructeur avec 4 paramètres (sans ville de naissance)
	public Person(String name, String firstName, int age, String address) {
		this(name,firstName,age,address,null);
	}
	
	// Constructeur avec 3 paramètres (sans adresse ni ville)
	public Person(String name, String firstName, int age) {
		this.name = name;
		this.firstName = firstName;
		this.age = age;
		this.address = "UnknownAddress";
		
	}
	// Constructeur avec 2 paramètres (nom et prénom uniquement)
		public Person(String name, String firstName) {
			this(name, firstName, 0, "UnknownAddress", null);
		}
	
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the lastName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		if (age > 0) {
            this.age = age;
        } else {
            System.out.println("L'âge doit être positif !");
        }
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param adress the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	
	/**
	 * @return the bornCity
	 */
	public City getBornCity() {
		return bornCity;
	}

	/**
	 * @param bornCity the bornCity to set
	 */
	public void setBornCity(City bornCity) {
		this.bornCity = bornCity;
	}

	
	 // Méthode d'affichage
    public void display() {
        
		System.out.println(firstName + ", " + name + " " + 
							age + " ans, habitant à " + address);
    }

    // Méthode toString
    @Override
    public String toString() {
    	String text = firstName + " " + name;

		if (age > 0) text += ", " + age + " ans";
		if (address != null) text += ", habitant à " + address;
		if (bornCity != null) text += ", né à " + bornCity;

		return text;
	}

}
