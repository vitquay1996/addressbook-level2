package seedu.addressbook.common;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import seedu.addressbook.common.Utils;

public class UtilsTest {
    Utils utils = new Utils();
    
    @Test
    public void testIsNull() {
        Object nullObject = null;
        Object notNullObject = new Object();
        assertTrue(Utils.isAnyNull(nullObject));
        assertFalse(Utils.isAnyNull(notNullObject));
    }
    
    @Test
    public void testIsUnique() {
        ArrayList<String> stringList = new ArrayList<String>();
        stringList.add("One");
        assertTrue(Utils.elementsAreUnique(stringList));
        stringList.add("One");
        assertFalse(Utils.elementsAreUnique(stringList));
    }

}
