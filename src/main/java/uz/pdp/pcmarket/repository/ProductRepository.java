package uz.pdp.pcmarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.pcmarket.entity.Product;

import java.util.List;

@RepositoryRestResource(path = "product")
public interface ProductRepository extends JpaRepository<Product, Integer> {


    @Query(value = "select * from product p join character ch on p.id=ch.product_id join property pr on ch.id=pr.character_id where pr.id in(properties) ",
            nativeQuery = true)

    List<Product> getProductsByProperty(List<Integer> properties);

}
