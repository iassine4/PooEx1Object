package pack.poo;

public class TestPerson {

	public static void main(String[] args) {
		
		Person manu = new Person("Emmanuel", "Macron", 45, "Elysée à Paris", new City("Amiens","France"));
		Person poutine = new Person("Poutine", "Vladimir", 68);
		Person trump = new Person("Donald", "Trump");
		
		System.out.println(manu + "\n");
		System.out.println(poutine + "\n");
		System.out.println(trump + "\n");
	}

}
