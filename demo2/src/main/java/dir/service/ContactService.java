package dir.service;

import java.util.List;

import org.springframework.data.jpa.repository.Query;

import dir.entity.Contact;

public interface ContactService {
	
	
	public List<Contact> findAll();

	public List<Contact> findById(int theId);
	
}
