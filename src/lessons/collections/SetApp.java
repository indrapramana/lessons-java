package lessons.collections;

import java.util.HashSet;
import java.util.Set;

public class SetApp {
	public static void main(String[] args) {

		Set<String> names = new HashSet<>();
		names.add("Indra");
		names.add("Pramana");
		names.add("Dimitri");
		names.add("Indra");
		names.add("Pramana");
		names.add("Dimitri");

		for (String name : names) {
			System.out.println(name);
		}

	}
}
