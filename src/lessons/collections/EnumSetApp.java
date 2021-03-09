package lessons.collections;

import java.util.EnumSet;

public class EnumSetApp {

	public static enum Gender {
		MALE, FEMALE, NOT_MENTION
	}

	public static void main(String[] args) {
		EnumSet<Gender> genders = EnumSet.of(Gender.MALE, Gender.FEMALE, Gender.NOT_MENTION);

		for (var gender : genders) {
			System.out.println(gender);
		}
	}
}
