package seedu.addressbook.data.person;

import seedu.addressbook.data.exception.IllegalValueException;

public class Street {
	private String streetName;
    public static final String STREET_VALIDATION_REGEX = "^[a-zA-Z0-9]*$";
    public static final String MESSAGE_STREET_CONSTRAINTS = "Person's block number can only be value from 0 to 999";


	public Street(String streetName) throws IllegalValueException {
		if (ifValidStreet(streetName)) {
			this.streetName = streetName;
		}
		else {
			throw new IllegalValueException(MESSAGE_STREET_CONSTRAINTS);
		}
	}
	
	public String getStreet() {
		return streetName;
	}
    
	public static boolean ifValidStreet(String test) {
		return test.matches(STREET_VALIDATION_REGEX);
	}
}
