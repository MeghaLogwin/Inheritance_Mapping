package com.inheritance.repository;

import com.inheritance.entity.MyEmployee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MyemployeeRepo extends JpaRepository<MyEmployee, Long> {
}
