package ru.bobretsoff.currencyconverterbackend.service;

import org.springframework.stereotype.Service;
import ru.bobretsoff.currencyconverterbackend.model.CurrencyConverterHistory;

import java.util.List;

@Service
public interface CurrencyConverterHistoryService{


    CurrencyConverterHistory create(CurrencyConverterHistory currencyConverterHistory);

    void delete(long id);

    List<CurrencyConverterHistory> getAllCurrencyConverterHistories();
}
