package org.example.contact;

import org.springframework.beans.factory.annotation.Autowired;

public class ContactFacade {

    private final ContactDao contactDao;
    private final ContactService contactService;
    @Autowired
    public ContactFacade(ContactDao contactDao, ContactService contactService) {
        this.contactDao = contactDao;
        this.contactService = contactService;

    }
    public ContactDto createContact (long contact) {
        var contact1 = contactDao.addContacts(contact);
        return new ContactDto(contact1);
    }

    public ContactDto getContact(long contactId) {
        var contact = contactDao.getContact(contactId);
        return new ContactDto(contact);
    }

}
