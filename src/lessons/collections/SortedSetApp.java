package lessons.collections;

import java.util.SortedSet;
import java.util.TreeSet;

import lessons.collections.data.Person;
import lessons.collections.data.PersonComparator;

public class SortedSetApp {

	public static void main(String[] args) {
		SortedSet<Person> people = new TreeSet<>(new PersonComparator());
		
	}

}
