package ru.bobretsoff.currencyconverterbackend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.bobretsoff.currencyconverterbackend.model.Currency;
import ru.bobretsoff.currencyconverterbackend.repository.CurrencyRepository;

import java.util.List;

@Service
public class CurrencyServiceImpl implements CurrencyService{
    /**  автоинъекция интерфейса repository.  */
    private final CurrencyRepository repository;

    @Autowired
    public CurrencyServiceImpl(CurrencyRepository repository) {
        this.repository = repository;
    }

    @Override
    public void save(Currency currency) {
        repository.save(currency);
    }

    @Override
    public void delete() {repository.deleteAll();}

    @Override
    public List<Currency> getAllCurrencies() {
        return repository.findAll();
    }

//    @Override
//    public Page<Company> companyList(Pageable pageable) {
//        return repository.findAll(pageable);
//    }
//
//
//    @Override
//    public List<CompanyProjection> getByTicker(String ticker) {
//        return repository.findByTicker(ticker);
//    }
}
