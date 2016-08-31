package seedu.addressbook.data.person;

import seedu.addressbook.data.exception.IllegalValueException;

public class Block {
	private String blockNumber;
    public static final String BLOCK_VALIDATION_REGEX = "d{1,3}";
    public static final String MESSAGE_BLOCK_CONSTRAINTS = "Person's block number can only be value from 0 to 999";


	public Block(String blockNumber) throws IllegalValueException {
		if (ifValidBlock(blockNumber)) {
			this.blockNumber = blockNumber;
		}
		else {
			throw new IllegalValueException(MESSAGE_BLOCK_CONSTRAINTS);
		}
	}
	
	public String getBlock() {
		return blockNumber;
	}
    
	public static boolean ifValidBlock(String test) {
		return test.matches(BLOCK_VALIDATION_REGEX);
	}
}
