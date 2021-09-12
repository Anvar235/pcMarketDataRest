package uz.pdp.pcmarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.pcmarket.entity.Property;

@RepositoryRestResource(path = "property")
public interface PropertyRepository extends JpaRepository<Property, Integer> {
}
