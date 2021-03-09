package lessons.collections;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ImmutableSetApp {

	public static void main(String[] args) {
		
		Set<String> empty = Collections.emptySet();
		Set<String> one = Collections.singleton("Indra");
		
		Set<String> mutable = new HashSet<>();
		mutable.add("Zara");
		mutable.add("Naresha");
		Set<String> immutable = Collections.unmodifiableSet(mutable);
		
		Set<String> set = Set.of("Zara3", "Zara1", "Naresha");
	
	}
}
