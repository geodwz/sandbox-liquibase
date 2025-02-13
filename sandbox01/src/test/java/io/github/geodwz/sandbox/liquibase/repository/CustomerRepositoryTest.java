package io.github.geodwz.sandbox.liquibase.repository;

import io.github.geodwz.sandbox.liquibase.TestcontainersConfiguration;
import io.github.geodwz.sandbox.liquibase.models.Customer;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;


import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@Import(TestcontainersConfiguration.class)
@SpringBootTest
class CustomerRepositoryTest {
    @Autowired
    private CustomerRepository customerRepository;

    @Test
    void testFindByEmail() {
        // Given
        Customer customer = new Customer();
        customer.setName("John Doe");
        customer.setEmail("john@example.com");
        customerRepository.save(customer);

        // When
        Customer foundCustomer = customerRepository.findByEmail("john@example.com");


        // Then
        assertThat(foundCustomer).isNotNull();
        assertThat(foundCustomer.getName()).isEqualTo("John Doe");
    }

    @Test
    void findExistingCustomerByMail() {
        // Given
        String email = "customer4@example.com";

        // When
        Customer foundCustomer = customerRepository.findByEmail(email);

        // Then
        assertThat(foundCustomer).isNotNull();
        assertThat(foundCustomer.getName()).isEqualTo("Customer 4");
    }
}
