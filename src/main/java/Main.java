public class Main {

    public static void main(String[] args) {
        PhoneIndex phoneIndex = new PhoneIndex();

        // ----- ADD CONTACT ------

        // use a scanner to read a new contact from the user
        // firstName
        // lastName
        // phoneNumber

        // create a new contact object and save details
        Contact contact = new Contact();
        contact.setFirstName("first name from scanner");
        contact.setLastName("last name from scanner");
        contact.addNumber("+49 1578 9872305");

        // add the contact to the index
        phoneIndex.addContact(contact);
        System.out.println("Contact saved successfully. Details: " + contact);

        // print all contacts
        phoneIndex.printAllContacts();

        // ----- DELETE CONTACT -----

        // use a scanner to read an existing contact (full name) from the user to delete it
        // fullName

        // remove a contact from contacts by the person's full name (firstName + lastName)
        phoneIndex.removeContact(fullName);

        // print all contacts
        phoneIndex.printAllContacts();
    }

}
