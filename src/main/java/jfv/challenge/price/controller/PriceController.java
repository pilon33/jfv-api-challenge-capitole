package jfv.challenge.price.controller;

import jfv.challenge.price.dto.PriceDto;
import jfv.challenge.price.entity.Price;
import jfv.challenge.price.service.PriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/api")
public class PriceController {

	@Autowired
	PriceService priceService;

	@GetMapping("/getAllPrices")
	public List<Price> getAllPrices() {
		return priceService.getAllPrices();
	}

	@GetMapping("/getPricesByParameters")
	public PriceDto getPrices(@RequestParam Integer brandId, @RequestParam Long productId,
			@RequestParam String appDate) {
		Price price = priceService.getSearchPrice(brandId, productId, appDate);
		return new PriceDto(price.getPriceId(), price.getProductId(), price.getBrandId(), price.getStartDate(),
				price.getEndDate(), price.getPrice(), price.getCurrency());

	}

}
