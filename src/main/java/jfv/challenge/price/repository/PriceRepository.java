package jfv.challenge.price.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import jfv.challenge.price.entity.Price;
import java.time.LocalDateTime;

public interface PriceRepository extends JpaRepository<Price, Long> {

	Price findDistinctTop1ByBrandIdAndProductIdAndStartDateLessThanEqualAndEndDateGreaterThanOrderByPriorityDesc(
			Integer brandId, Long productId, LocalDateTime apply1, LocalDateTime apply2);

}