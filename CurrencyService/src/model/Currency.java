package model;

public class Currency {
    private String name;
    private double exchangeRate;

    public Currency(String name, double exchangeRate) {
        this.name = name;
        this.exchangeRate = exchangeRate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getExchangeRate() {
        return exchangeRate;
    }

    public void setExchangeRate(double exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    @Override
    public String toString() {
        return "Currency{" +
                "name='" + name + '\'' +
                ", exchangeRate=" + exchangeRate +
                '}';
    }
}
