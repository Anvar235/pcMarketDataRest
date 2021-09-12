package uz.pdp.pcmarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.pcmarket.entity.Sale;

@RepositoryRestResource(path = "sale")
public interface SaleRepository extends JpaRepository<Sale, Integer> {
}
