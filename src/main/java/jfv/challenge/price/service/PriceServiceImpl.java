package jfv.challenge.price.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import jfv.challenge.price.repository.PriceRepository;

@Service
public class PriceServiceImpl implements PriceService {

    @Autowired
    PriceRepository repository;

   

}
