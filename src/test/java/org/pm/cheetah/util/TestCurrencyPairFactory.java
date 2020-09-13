package org.pm.cheetah.util;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class TestCurrencyPairFactory {

    @BeforeAll
    static void initAll() {
    }

    @BeforeEach
    void init() {
    }

    @Test
    void testCreateEURUSD() {
        CurrencyPair pair = CurrencyPairFactory.getInstance().create(Currency.EUR, Currency.USD);
        assertEquals("EUR/USD", pair.toString());
    }

    @Test
    void testCreateUSDEUR() {
        CurrencyPair pair = CurrencyPairFactory.getInstance().create(Currency.USD, Currency.EUR);
        assertEquals("EUR/USD", pair.toString());
    }

    @Test
    void testCreateUSDCHF() {
        CurrencyPair pair = CurrencyPairFactory.getInstance().create(Currency.USD, Currency.CHF);
        assertEquals("USD/CHF", pair.toString());
    }

    @Test
    void testCreateCHFUSD() {
        CurrencyPair pair = CurrencyPairFactory.getInstance().create(Currency.CHF, Currency.USD);
        assertEquals("USD/CHF", pair.toString());
    }

    @Test
    void testCreateEURJPY() {
        CurrencyPair pair = CurrencyPairFactory.getInstance().create(Currency.EUR, Currency.JPY);
        assertEquals("EUR/JPY", pair.toString());
    }

    @Test
    void testCreateJPYEUR() {
        CurrencyPair pair = CurrencyPairFactory.getInstance().create(Currency.JPY, Currency.EUR);
        assertEquals("EUR/JPY", pair.toString());
    }

    @AfterEach
    void tearDown() {
    }

    @AfterAll
    static void tearDownAll() {
    }
}
