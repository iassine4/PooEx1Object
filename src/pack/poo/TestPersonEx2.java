package pack.poo;
import java.util.ArrayList;


public class TestPersonEx2 {

	public static void main(String[] args) {
		
		ArrayList<Person> persons = new ArrayList<>();

		 persons.add(new Person(
	                "Zidane",
	                "Zinedine",
	                45,
	                "Madrid",
	                new City("France", "Marseille", 870000)
	        ));

	        persons.add(new Person(
	                "Macron",
	                "Emmanuel",
	                46,
	                "Paris",
	                new City("France", "Amiens", 133000)
	        ));

	        persons.add(new Person(
	                "Musk",
	                "Elon",
	                50,
	                "Paris",
	                new City("Afrique du Sud", "Pretoria")
	        ));

	        persons.add(new Person(
	                "Ronaldo",
	                "Cristiano",
	                38,
	                "Turin",
	                new City("Portugal", "Funchal", 105000)
	        ));
/*
	        // Test de la liste
	        for (Person person : persons) {
	            System.out.println(person + "\n");
	        }
*/	        
	        System.out.println("\n Personnes nées en France ou habitant Paris \n");

	        for (Person person : persons) {

	            boolean bornInFrance = person.getBornCity()
	                    .getCountry()
	                    .equalsIgnoreCase("France");

	            boolean liveInParis = person.getAddress()
	                    .equalsIgnoreCase("Paris");

	            if (bornInFrance || liveInParis) {
	                System.out.println(person + "\n");
	            }
	        }
	}

}
