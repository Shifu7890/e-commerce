package com.example.ecommerce.repository;

import com.example.ecommerce.model.Card;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CardRespository extends JpaRepository<Card,Integer> {

    Card findByCardNo(String cardNo);
}
