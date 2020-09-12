package org.pm.cheetah.util;

/**
 * Class representing a currency pair.
 *
 * @author Per Magnusson
 */
public class CurrencyPair {

    private final Currency m_base;
    private final Currency m_terms;
    private QuoteBasis m_quoteBasis;

    /**
     * Creates a new currency pair instance for terms currency (numerator) / base currency (denominator).
     *
     * @param base The base (numerator) currency
     * @param terms The terms (denominator) currency
     */
    public CurrencyPair(Currency base, Currency terms) {
        m_base = base;
        m_terms = terms;
    }

    /**
     * Returns the base currency.
     *
     * @return A Currency
     */
    public Currency getCurrency1() {
        return m_base;
    }

    /**
     * Returns the terms currency.
     *
     * @return A Currency
     */
    public Currency getCurrency2() {
        return m_terms;
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
