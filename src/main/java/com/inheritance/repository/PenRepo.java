package com.inheritance.repository;

import com.inheritance.entity.Pen;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PenRepo extends JpaRepository<Pen,Long> {
}
