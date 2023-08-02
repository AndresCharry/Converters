package model;

import java.util.HashMap;

public class Converter {
    // Attributes
    private Coin coin;

    private Temperature temperature;

    private HashMap<String, Double> dictionaryOfCoins = new HashMap<>();
    private HashMap<String, Double> dictionaryOfTemperature = new HashMap<>();

    public Converter(String type, double value, boolean coinConverter) {
        if (coinConverter) {
            coin = new Coin(type, value);
        } else {
            temperature = new Temperature(type, value);
        }
    }

    public double currencyConversion() {
        String conversionRate = coin.getType();
        dictionaryOfCoins.put("from COP to USD", (coin.getValue() * 0.00025));
        dictionaryOfCoins.put("from COP to EUR", (coin.getValue() * 0.00023));
        dictionaryOfCoins.put("from COP to GBP", (coin.getValue() * 0.00020));
        dictionaryOfCoins.put("from COP to JPY", (coin.getValue() * 0.0365));
        dictionaryOfCoins.put("from COP to KRW", (coin.getValue() * 0.3291));
        dictionaryOfCoins.put("from USD to COP", (coin.getValue() * 3970.53));
        dictionaryOfCoins.put("from EUR to COP", (coin.getValue() * 4372.4270));
        dictionaryOfCoins.put("from GBP to COP", (coin.getValue() * 5079.1615));
        dictionaryOfCoins.put("from JPY to COP", (coin.getValue() * 27.7776));
        dictionaryOfCoins.put("from KRW to COP", (coin.getValue() * 3.0829));

        return dictionaryOfCoins.get(conversionRate);
    }

    public double temperatureConversion() {
        String conversionRate = temperature.getType();
        dictionaryOfTemperature.put("from Celsius to Fahrenheit", (temperature.getValue() * 1.8 + 32));
        dictionaryOfTemperature.put("from Celsius to Kelvin", (temperature.getValue() + 273.15));
        dictionaryOfTemperature.put("from Fahrenheit to Celsius", ((temperature.getValue() - 32) / 1.8));
        dictionaryOfTemperature.put("from Fahrenheit to Kelvin", (temperature.getValue() + 459.67) / 1.8);
        dictionaryOfTemperature.put("from Kelvin to Celsius", (temperature.getValue() - 273.15));
        dictionaryOfTemperature.put("from Kelvin to Fahrenheit", (temperature.getValue() * 1.8 - 459.67));

        return dictionaryOfTemperature.get(conversionRate);
    }
}