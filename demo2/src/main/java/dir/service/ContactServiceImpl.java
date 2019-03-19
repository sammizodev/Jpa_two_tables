package dir.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dir.dao.ContactRepository;
import dir.entity.Contact;
import dir.service.ContactService;

@Service
public class ContactServiceImpl implements ContactService{


		private ContactRepository contactRepository;
			
			@Autowired
			public ContactServiceImpl(ContactRepository theContactRepository) {
				contactRepository= theContactRepository;
			}
			@Override
			public List<Contact> findAll() {
				
				return contactRepository.findAll();
			}

			@Override
			public List<Contact> findById(int theId) {
				
				Optional<Contact> result=contactRepository.findById(theId);
				
				List<Contact> theContact=null;
				
				if(result.isPresent()) {
					theContact=(List<Contact>) result.get();
				}
				else {
					throw new RuntimeException("DID not find");
				}
				return theContact;
				
			}
	
}
