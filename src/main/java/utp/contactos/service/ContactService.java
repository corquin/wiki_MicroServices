package utp.contactos.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import utp.contactos.dao.ContactRepository;
import utp.contactos.dto.Contact;

@Service
public class ContactService {
	
	@Autowired
	ContactRepository dao;
	
	public Contact save(Contact contact) {
		return dao.saveAndFlush(contact);
	}
}
