package seedu.addressbook.data.person;

public class Contact {
    private boolean isPrivate;

	public Contact(boolean isPrivate) {
		super();
		this.isPrivate = isPrivate;
	}
	
	public Contact() {
	    super();
	}
    public boolean isPrivate() {
        return isPrivate;
    }

}