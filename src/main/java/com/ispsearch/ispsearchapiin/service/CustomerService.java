package com.ispsearch.ispsearchapiin.service;

import com.ispsearch.ispsearchapiin.model.Customer;
import com.ispsearch.ispsearchapiin.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    @Autowired
    CustomerRepository customerRepository;

    // saves customer info- email, name, pass
    // cityid, stateid, pincodeid are retireved from specific repositories
    public String saveCustomer(Customer customer){
        customerRepository.save(customer);
        return "Customer saved";
    }

    // saves multiple customers
    public String saveCustomers(List<Customer> customerList){
        customerRepository.saveAll(customerList);
        return "Customers saved";
    }

    // returns a list of all customers in the db
    public List<Customer> getCustomers(){
        return customerRepository.findAll();
    }

    // returns a customer based on provided customer id
    public Customer getCustomer(int id){
        return customerRepository.findById(id).orElse(null);
    }

    // return a customer based on emailid
    public Customer getCustomer(String email){
        Customer customer = customerRepository.findByCustomerEmail(email);
        if (customer != null){
            return customer;
        }
        throw new RuntimeException("Customer not found in database");
    }
    //update customer
    public String updateCustomer(Customer newCustomer){
        int customerId = newCustomer.getCustomerId();
        Customer oldCustomer = customerRepository.findById(customerId).orElse(null);
        if(oldCustomer != null){
            if(newCustomer.getCustomerName() != null){
                oldCustomer.setCustomerName(newCustomer.getCustomerName());
            }
            if(newCustomer.getCustomerEmail() != null){
                oldCustomer.setCustomerEmail(newCustomer.getCustomerEmail());
            }
            if(newCustomer.getCustomerStateId() != null){
                oldCustomer.setCustomerStateId(newCustomer.getCustomerStateId());
            }
            if(newCustomer.getCustomerCityId() != null){
                oldCustomer.setCustomerCityId(newCustomer.getCustomerCityId());
            }
            if(newCustomer.getCustomerPincodeId() != null){
                oldCustomer.setCustomerPincodeId(newCustomer.getCustomerPincodeId());
            }
            customerRepository.save(oldCustomer);
            return "Customer information updated";
        }
        throw new RuntimeException("Customer does not exist in database");
    }

    // delete customer from db based on id
    public String deleteCustomer(int id){
        Customer customerToDelete = customerRepository.findById(id).orElse(null);
        if(customerToDelete != null){
            customerRepository.delete(customerToDelete);
        }
        throw new RuntimeException("Customer to delete is not in database");
    }

}
