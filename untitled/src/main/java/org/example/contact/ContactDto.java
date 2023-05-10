package org.example.contact;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ContactDto {
    @JsonProperty("contacts")
    private final long contactId;
    @JsonProperty("contactAll")
    private final long contact;

    public ContactDto(long contactId, long contact) {
        this.contactId = contactId;
        this.contact = contact;
    }

    public ContactDto(Contacts contact1, long contactId, long contact) {

        this.contactId = contactId;
        this.contact = contact;
    }


    public long getContactId() {
        return contactId;
    }

    public long getContact() {
        return contact;
    }
}

