package uz.pdp.pcmarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.pcmarket.entity.Address;

@RepositoryRestResource(path = "address")
public interface AddressRepository extends JpaRepository<Address, Integer> {
}
