package com.inheritance.repository;

import com.inheritance.entity.Myproduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MyProductRepo extends JpaRepository<Myproduct,Long> {
}
