package dir.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import dir.entity.Contact;

public interface ContactRepository extends JpaRepository<Contact,Integer> {

}
