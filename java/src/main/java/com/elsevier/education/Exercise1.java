package com.elsevier.education;

import java.util.Set;

/**

TODO: Make this class immutable.

/**
 * 
 * @author swapnilkulkarni
 * Make the class as final 
 * Make all field as private & final
 * Initize those fields in default constructor.
 * Remove all set methods
 * return collection<String> so that collection can't be modified.
 */

public final class Exercise1 {

	public static final class Person {
		
		private final Set<String> phoneNumbers;
		private final String firstName;
		private final String lastName;
		
		public Person() {
			phoneNumbers = new HashSet<String>(Arrays.asList("267 844 5443", "234354"));
			firstName = "Swapnil";
			lastName = "Kulkarni";
		}

		public Collection<String> getPhoneNumbers() {
			return Collections.unmodifiableCollection(phoneNumbers);
		}
				
		public String getFirstName() {
			return firstName;
		}
				
		public String getLastName() {
			return lastName;
		}
		
	}
}
