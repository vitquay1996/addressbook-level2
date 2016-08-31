package seedu.addressbook.data.person;

import seedu.addressbook.data.exception.IllegalValueException;

public class Unit {
	private String unit;
    public static final String UNIT_VALIDATION_REGEX = ".+";
    public static final String MESSAGE_UNIT_CONSTRAINTS = "Unit can be anything for now";


	public Unit(String unit) throws IllegalValueException {
		if (ifValidUnit(unit)) {
			this.unit = unit;
		}
		else {
			throw new IllegalValueException(MESSAGE_UNIT_CONSTRAINTS);
		}
	}
	
	public String getUnit() {
		return unit;
	}
    
	public static boolean ifValidUnit(String test) {
		return test.matches(UNIT_VALIDATION_REGEX);
	}
}
