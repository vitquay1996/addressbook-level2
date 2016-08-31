package seedu.addressbook.data.person;

import seedu.addressbook.data.exception.IllegalValueException;

/**
 * Represents a Person's address in the address book.
 * Guarantees: immutable; is valid as declared in {@link #isValidAddress(String)}
 */
public class Address {

    public static final String EXAMPLE = "123, some street";
    public static final String MESSAGE_ADDRESS_CONSTRAINTS = "Person addresses can be in any format";
    public static final String ADDRESS_VALIDATION_REGEX = ".+";
    public static final int BLOCK_INDEX = 0;
    public static final int STREET_INDEX = 1;
    public static final int UNIT_INDEX = 2;
    public static final int POSTAL_INDEX = 3;



    public final String value;
    private boolean isPrivate;
    private String[] addressElements;
    private Block block;
    private Street street;
    private Unit unit;
    private PostalCode postalCode;
    

    /**
     * Validates given address.
     *
     * @throws IllegalValueException if given address string is invalid.
     */
    public Address(String address, boolean isPrivate) throws IllegalValueException {
        this.isPrivate = isPrivate;
        addressElements = address.split(",");
        for (int i=0; i<addressElements.length; i++) {
        	addressElements[i] = addressElements[i].replaceAll("\\s+", "");
        }
        this.block = new Block(addressElements[BLOCK_INDEX]);
        this.street = new Street(addressElements[STREET_INDEX]);
        this.unit = new Unit(addressElements[UNIT_INDEX]);
        this.postalCode = new PostalCode(addressElements[POSTAL_INDEX]);

        
        if (!isValidAddress(address)) {
            throw new IllegalValueException(MESSAGE_ADDRESS_CONSTRAINTS);
        }
        this.value = address;
    }

    /**
     * Returns true if a given string is a valid person email. ??? Email?
     */
    public static boolean isValidAddress(String test) {
        return test.matches(ADDRESS_VALIDATION_REGEX);
    }
    
    public Block getBlock() {
    	return this.block;
    }
    
    public Street getStreet() {
    	return this.street;
    }
    
    public Unit getUnit() {
    	return this.unit;
    }
    
    public PostalCode getPostalCode() {
    	return this.postalCode;
    }

    @Override
    public String toString() {
        return value;
    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof Address // instanceof handles nulls
                && this.value.equals(((Address) other).value)); // state check
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }

    public boolean isPrivate() {
        return isPrivate;
    }
}