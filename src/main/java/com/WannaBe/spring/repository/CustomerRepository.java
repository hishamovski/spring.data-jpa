package com.WannaBe.spring.repository;

import com.WannaBe.spring.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {

}
