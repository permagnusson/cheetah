package org.pm.cheetah.util;

/**
 * Class representing a currency pair.
 *
 * @author Per Magnusson
 */
public class CurrencyPair {

    private final Currency m_ccy1;
    private final Currency m_ccy2;
    private QuoteBasis m_quoteBasis;

    /**
     * Creates a new instance ccy1 / ccy2.
     *
     * @param ccy1 The first (numerator) currency
     * @param ccy2 The second (denominator) currency
     */
    public CurrencyPair(Currency ccy1, Currency ccy2) {
        m_ccy1 = ccy1;
        m_ccy2 = ccy2;
    }

    /**
     * Returns the first currency.
     *
     * @return A Currency
     */
    public Currency getCurrency1() {
        return m_ccy1;
    }

    /**
     * Returns the second currency.
     *
     * @return A Currency
     */
    public Currency getCurrency2() {
        return m_ccy2;
    }

    /**
     * Returns the quote basis.
     *
     * @return A QuoteBasis
     */
    public QuoteBasis getQuoteBasis() {
        return m_quoteBasis;
    }
}
