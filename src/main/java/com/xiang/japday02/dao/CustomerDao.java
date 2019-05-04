package com.xiang.japday02.dao;

import com.xiang.japday02.damain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

public interface CustomerDao extends JpaRepository<Customer,Long>, JpaSpecificationExecutor<Customer> {
    @Query("from Customer where custName = ？")
    public Customer findJpaName(String custName );
}
