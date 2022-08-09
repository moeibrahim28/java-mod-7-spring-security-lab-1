package com.example.SpringUnitTesting;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class BitcoinServiceIntegrationTest {

    @Test
    void shouldReturnPrice() {
        CryptoService bitCoinService = new CryptoService();
        String currentPrice = bitCoinService.getBitcoinPrice();
        assertThat(currentPrice).isNotNull();

    }
}