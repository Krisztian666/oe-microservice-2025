package hu.oe.yokudlela.rest;

import hu.oe.yokudlela.customer.generated.rest.api.DefaultApi;
import hu.oe.yokudlela.customer.generated.rest.model.Customer;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("")
public class CustomerController implements DefaultApi {

    @Override
    public ResponseEntity<List<Customer>> customersGet(){
        return null;
    }

    @Override
    public ResponseEntity<Void> customersIdDelete(Integer id) {
        return null;
    }

    @Override
    public ResponseEntity<Customer> customersIdGet(Integer id) {
        return null;
    }

    @Override
    public ResponseEntity<Customer> customersIdPut(Integer id, Customer customer) {
        return null;
    }

    @Override
    public ResponseEntity<Customer> customersPost(Customer customer) {
        return null;
    }

}
