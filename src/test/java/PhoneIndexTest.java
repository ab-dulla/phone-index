import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PhoneIndexTest {

    private PhoneIndex phoneIndex;

    @BeforeEach
    void setup() {
        phoneIndex = new PhoneIndex();
    }

    @Test
    void addContact() {
        Contact contact = new Contact();
        // contact.setFirstName(...)
        // contact.setLastName(...)
        //...

        phoneIndex.addContact(contact);

        Assertions.assertEquals(1, phoneIndex.getNumberOfContacts());
    }

    @Test
    void removeContact() {
    }
}