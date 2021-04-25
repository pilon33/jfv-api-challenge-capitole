package jfv.challenge.price.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import jfv.challenge.price.entity.Price;

public interface PriceRepository extends JpaRepository<Price, Long> {


}