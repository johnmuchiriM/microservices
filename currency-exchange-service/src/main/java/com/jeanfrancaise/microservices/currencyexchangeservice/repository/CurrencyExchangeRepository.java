package com.jeanfrancaise.microservices.currencyexchangeservice.repository;

import com.jeanfrancaise.microservices.currencyexchangeservice.entity.CurrencyExchange;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CurrencyExchangeRepository extends JpaRepository<CurrencyExchange,Long> {
    CurrencyExchange findByFromAndTo(String from, String to);
}
