package com.example.SpringUnitTesting;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CryptoService {

    public String getCryptoPrice(String name) {
        String apiURL = "https://api.coincap.io/v2/assets/" + name;
        RestTemplate restTemplate = new RestTemplate();
        Data result = restTemplate.getForObject(apiURL, Data.class);
        double price = Double.parseDouble(result.getData().getPriceUsd());
        return String.format("$%.2f", price);
    }
}

@Getter
@Setter
class Crypto {
    private String id;
    private String symbol;
    private String priceUsd;
}

@Getter
@Setter
class Data{
    private Crypto data;
}