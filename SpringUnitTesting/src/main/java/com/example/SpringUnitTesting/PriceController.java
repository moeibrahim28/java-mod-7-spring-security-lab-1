package com.example.SpringUnitTesting;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PriceController {

    private CryptoService cryptoService;

    public PriceController(CryptoService cryptoService) {
        this.cryptoService = cryptoService;
    }

    @GetMapping("/crypto/{crypto}")
    public String price(@PathVariable String crypto) {
        return String.format("<h1>Hello User</h1>" +
                "Price of "+ crypto+ " is currently: " + cryptoService.getCryptoPrice(crypto));

    }

}