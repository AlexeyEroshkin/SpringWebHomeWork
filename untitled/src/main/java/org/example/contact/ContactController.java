package org.example.contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/contacts")
public class ContactController {
    private final ContactFacade contactFacade;
    private long contactId;

    @Autowired
    public ContactController(ContactFacade contactFacade) {
        this.contactFacade = contactFacade;
    }
    @PostMapping
    public ContactDto createContact( @RequestParam long contact) {

        return contactFacade.createContact(contact);
    }

    @GetMapping("/{contact}")
    public ContactDto getContact(@PathVariable long contact) {
        return contactFacade.getContact(contact);
    }
    @GetMapping("/{contactsAll}")
    public ContactDto getContactAll(
            @PathVariable long contactId
    ) {
        return contactFacade.getContact(contactId);
    }

}
