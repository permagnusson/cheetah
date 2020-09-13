package org.pm.cheetah.util;

public class CurrencyPairFactory {

    private static CurrencyPairFactory m_instance;

    /**
     * Method returning the singleton factory instance.
     *
     * @return A CurrencyPairFactory
     */
    public static synchronized CurrencyPairFactory getInstance() {
        if (m_instance == null) {
            m_instance = new CurrencyPairFactory();
        }
        return m_instance;
    }

    public CurrencyPair create(Currency ccy1, Currency ccy2) {
        CurrencyPair pair;
        if (ccy1.getPriority() < ccy2.getPriority()) {
            pair = new CurrencyPair(ccy1, ccy2);
        } else {
            pair = new CurrencyPair(ccy2, ccy1);
        }
        return pair;
    }

}
