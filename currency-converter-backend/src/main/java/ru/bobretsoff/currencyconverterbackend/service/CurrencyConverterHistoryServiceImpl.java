package ru.bobretsoff.currencyconverterbackend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.bobretsoff.currencyconverterbackend.model.Currency;
import ru.bobretsoff.currencyconverterbackend.model.CurrencyConverterHistory;
import ru.bobretsoff.currencyconverterbackend.repository.CurrencyConverterHistoryRepository;

import java.util.List;

@Service
public class CurrencyConverterHistoryServiceImpl implements CurrencyConverterHistoryService{

    private final CurrencyConverterHistoryRepository repository_history;

    @Autowired
    public CurrencyConverterHistoryServiceImpl(CurrencyConverterHistoryRepository repository_history) {
        this.repository_history = repository_history;
    }


    @Override
    public CurrencyConverterHistory create(CurrencyConverterHistory currencyConverterHistory) {
        return repository_history.save(currencyConverterHistory);
    }

    @Override
    public List<CurrencyConverterHistory> getAllCurrencyConverterHistories() {
        return repository_history.findAll();
    }

    @Override
    public void delete(long id) {repository_history.deleteById(id);}

}
