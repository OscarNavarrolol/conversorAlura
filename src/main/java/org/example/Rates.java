package org.example;

public class Rates {
    private String currencyName;
    private double exchangeRate;
    private double amountExchange;

    public double getAmountExchange() {
        return amountExchange;
    }

    public void setAmountExchange(double amountExchange) {
        this.amountExchange = amountExchange;
    }

    public double calcExchange(double exchangeRate, double amountExchange){
        return exchangeRate * amountExchange;
    }

    public Rates() {
    }

    public Rates(String currencyName, double exchangeRate) {
        this.currencyName = currencyName;
        this.exchangeRate = exchangeRate;
    }

    public String getCurrencyName() {
        return currencyName;
    }

    public void setCurrencyName(String currencyName) {
        this.currencyName = currencyName;
    }

    public double getExchangeRate() {
        return exchangeRate;
    }

    public void setExchangeRate(double exchangeRate) {
        this.exchangeRate = exchangeRate;
    }
}
