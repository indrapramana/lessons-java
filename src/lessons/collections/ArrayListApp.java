package lessons.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ArrayListApp {

	public static void main(String[] args) {
		Collection<String> collections = new ArrayList<>();
		collections.add("Indra");
		collections.add("Pramana");
		collections.addAll(List.of("Dasya", "Zara"));

		for (String coll : collections) {
			System.out.println(coll);
		}
	}

}
