package seedu.addressbook.data.person;

import seedu.addressbook.data.exception.IllegalValueException;

public class PostalCode {
	private String postalCode;
    public static final String POSTAL_CODE_VALIDATION_REGEX = "6d";
    public static final String MESSAGE_POSTAL_CODE_CONSTRAINTS = "Poster code can only contain 6 digits";


	public PostalCode(String postalCode) throws IllegalValueException {
		if (ifValidPostalCode(postalCode)) {
			this.postalCode = postalCode;
		}
		else {
			throw new IllegalValueException(MESSAGE_POSTAL_CODE_CONSTRAINTS);
		}
	}
	
	public String getPostalCode() {
		return postalCode;
	}
    
	public static boolean ifValidPostalCode(String test) {
		return test.matches(POSTAL_CODE_VALIDATION_REGEX);
	}
}
