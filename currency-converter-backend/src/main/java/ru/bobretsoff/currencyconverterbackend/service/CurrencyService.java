package ru.bobretsoff.currencyconverterbackend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.bobretsoff.currencyconverterbackend.model.Currency;

import java.util.List;

@Service
public interface CurrencyService {

    /** сохрание результат парсинга в таблицу Currency. */
    void save(Currency currency);
    /** получение списка компаний. */
    List<Currency> getAllCurrencies();


    void delete();

//    /** получение истории цен по тикеру. */
//    List<CompanyProjection> getByTicker(String ticker);

}
