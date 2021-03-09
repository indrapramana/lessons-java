package lessons.collections.data;

import java.util.List;

public class Person {

	private String name;

	private List<String> hobbies;

	public Person(String name) {
		this.name = name;
		this.hobbies = hobbies;
	}

	public void addHoby(String hobby) {
		hobbies.add(hobby);
	}

	public List<String> getHobbies() {
		return hobbies;
	}

	public String getName() {
		return name;
	}

}
