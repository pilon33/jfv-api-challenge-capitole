package jfv.challenge.price.service;

import java.util.List;
import jfv.challenge.price.entity.Price;

public interface PriceService {
	List<Price> getAllPrices();

	Price getSearchPrice(Integer brandId, Long productId, String appDateTime);
}
