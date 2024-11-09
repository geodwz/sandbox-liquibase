package io.github.geodwz.sandbox.liquibase.repository;

import io.github.geodwz.sandbox.liquibase.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<Customer, Long> {
    Customer findByEmail(String email);
}