package ru.bobretsoff.currencyconverterbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.bobretsoff.currencyconverterbackend.model.Currency;

@Repository
public interface CurrencyRepository  extends JpaRepository<Currency, Long> {

}
