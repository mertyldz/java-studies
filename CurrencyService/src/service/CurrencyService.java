package service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import model.Currency;

public class CurrencyService {
    List<Currency> currencyList;

    public CurrencyService() {
        currencyList = new ArrayList<>();
        Currency eur = new Currency("EUR", 28.63);
        currencyList.add(eur);
        Currency usd = new Currency("USD", 26.07);
        currencyList.add(usd);
        Currency gbp = new Currency("GBP", 33.43);
        currencyList.add(gbp);
    }

    public List<Currency> getCurrencyList() {
        return this.currencyList;
    }

    public Currency getCurrencyByName(String currencyName) {
        for (Currency c : currencyList) {
            if (c.getName().equals(currencyName)) {
                return c;
            }
        }
        return null;
    }

    public void addCurrency(String name, Double exchangeRate) {
        Currency newCur = new Currency(name, exchangeRate);
        currencyList.add(newCur);
    }

    public BigDecimal makeExchange(Currency targetCurrency, Currency currency, BigDecimal amount) {
        double ratio = currency.getExchangeRate() / targetCurrency.getExchangeRate();
        return amount.multiply(BigDecimal.valueOf(ratio));
    }
}
