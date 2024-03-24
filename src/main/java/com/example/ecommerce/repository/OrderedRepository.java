package com.example.ecommerce.repository;

import org.springframework.stereotype.Repository;


import com.example.ecommerce.model.Ordered;
import org.springframework.data.jpa.repository.JpaRepository;


@Repository
public interface OrderedRepository extends JpaRepository<Ordered,Integer> {
}
