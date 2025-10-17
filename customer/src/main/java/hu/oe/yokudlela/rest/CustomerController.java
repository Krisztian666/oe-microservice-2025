package hu.oe.yokudlela.rest;

import hu.oe.yokudlela.customer.generated.entity.Customer;
import hu.oe.yokudlela.customer.generated.rest.api.DefaultApi;
import hu.oe.yokudlela.customer.generated.rest.model.*;
import hu.oe.yokudlela.rdbms.CustomerRepository;
import org.modelmapper.ModelMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("")
public class CustomerController implements DefaultApi {
    private final CustomerRepository customerRepository;
    private final ModelMapper modelMapper;

    CustomerController(CustomerRepository customerRepository, ModelMapper modelMapper) {
        this.customerRepository = customerRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public ResponseEntity<List<CustomerResponse>> customersGet() {
        return null;
    }

    @Override
    public ResponseEntity<Void> customersIdDelete(String id) {
        return null;
    }

    @Override
    public ResponseEntity<CustomerResponse> customersIdGet(String id) {
        return ResponseEntity.ok(modelMapper.map(customerRepository.getById(UUID.fromString(id)), CustomerResponse.class));
    }

    @Override
    public ResponseEntity<IdModel> customersIdPut(String id, CustomerRequest customerRequest) {
        return null;
    }

    @Override
    public ResponseEntity<IdModel> customersPost(CustomerRequest customerRequest) {
        return ResponseEntity.ok(
                modelMapper.map(
                    customerRepository.save(
                            modelMapper.map(customerRequest, Customer.class)),
                IdModel.class)
        );
    }
}
