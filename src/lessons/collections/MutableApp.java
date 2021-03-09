package lessons.collections;

import lessons.collections.data.Person;

public class MutableApp {

	public static void main(String[] args) {
		
		Person person = new Person("Indra");
		
		person.addHoby("Sex");
		person.addHoby("Orgy");
		person.addHoby("Ok");
		
		for (var hobby : person.getHobbies()) {
			System.out.println(hobby);
		}
	}

}
