package seedu.addressbook.data.tag;

import seedu.addressbook.data.person.Person;
import seedu.addressbook.data.tag.UniqueTagList.DuplicateTagException;
import seedu.addressbook.data.tag.UniqueTagList.TagNotFoundException;
import seedu.addressbook.ui.*;

public class Tagging {
    private TextUi ui;
    
    public void removePersonTag(Person target, Tag toRemove) {
        UniqueTagList personTagList = target.getTags();
        try {
            personTagList.remove(toRemove);
        } catch (TagNotFoundException e) {
            ui.showToUser("Cannot find tag");
        }
        target.setTags(personTagList);
    }
    
    public void addPersonTag(Person target, Tag toAdd) {
        UniqueTagList personTagList = target.getTags();
        try {
            personTagList.add(toAdd);
        } catch (DuplicateTagException e) {
            ui.showToUser("Already have that tag bro");
        }
    }
    
    
}
