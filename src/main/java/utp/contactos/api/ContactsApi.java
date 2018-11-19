package utp.contactos.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import utp.contactos.dto.Contact;
import utp.contactos.service.ContactService;

@RestController
public class ContactsApi {
	@RequestMapping(value = "/product", method = RequestMethod.GET)
	public Contact getById() {
		return new Contact(1L, "Edisson", "Torres", "+593 985 991 875", "eatorres5@utpl.edu.ec");
	}
	
	@Autowired
	ContactService contactService;
	
	@RequestMapping(value="/contact", method=RequestMethod.POST)
	public Contact updateOrSave(@RequestBody Contact contact){
		return contactService.save(contact);
	}
	
}
