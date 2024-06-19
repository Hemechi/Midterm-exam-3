package rupp.springmidtermproduct.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import rupp.springmidtermproduct.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
