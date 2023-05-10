package org.example.contact;

import java.util.Optional;

public interface ContactDao {

    Contacts save(Contacts contacts);
    Contacts addContacts(long contact);
    Optional<Contacts> findContact(long contactId);
    Contacts getContact(long  contactId);
    void setContact(long contactId);
}

