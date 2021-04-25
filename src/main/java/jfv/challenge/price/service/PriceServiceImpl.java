package jfv.challenge.price.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import jfv.challenge.price.entity.Price;
import jfv.challenge.price.repository.PriceRepository;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class PriceServiceImpl implements PriceService {

	@Autowired
	PriceRepository repository;

	@Override
	public List<Price> getAllPrices() {
		return repository.findAll();
	}

	@Override
	public Price getSearchPrice(Integer brandId, Long productId, String appDateToSearch) {

		LocalDateTime appDateTime = LocalDateTime.parse(appDateToSearch);
		LocalDateTime startDate = appDateTime;
		LocalDateTime endDate = startDate.plusSeconds(1);
		Price price = repository
				.findDistinctTop1ByBrandIdAndProductIdAndStartDateLessThanEqualAndEndDateGreaterThanOrderByPriorityDesc(
						brandId, productId, startDate, endDate);

		return price;

	}

}
