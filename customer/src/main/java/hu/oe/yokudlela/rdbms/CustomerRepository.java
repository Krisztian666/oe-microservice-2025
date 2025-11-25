package hu.oe.yokudlela.rdbms;

import hu.oe.yokudlela.customer.generated.entity.Customer;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface CustomerRepository extends CrudRepository<Customer, UUID> {

    boolean existsByName(String pName);

    Customer getById(UUID id);
}
