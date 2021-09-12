package uz.pdp.pcmarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.pcmarket.entity.Contact;

@RepositoryRestResource(path = "contact")
public interface ContactRepository extends JpaRepository<Contact, Integer> {
}
