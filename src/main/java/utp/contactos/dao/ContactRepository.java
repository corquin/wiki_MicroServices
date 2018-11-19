package utp.contactos.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import utp.contactos.dto.Contact;

public interface ContactRepository extends JpaRepository<Contact, Long> {

}
