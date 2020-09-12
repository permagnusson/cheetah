package org.pm.cheetah.util;

/**
 * Enum representing a currency.
 *
 * @author Per Magnusson
 */
public enum Currency {

    EUR("EUR",1), GBP("GBP", 2), AUD("AUD", 3)
    , NZD("NZD", 4), USD("USD", 5), CAD("CAD", 6)
    , CHF("CHF", 7), JPY("JPY", 8);
    private final String m_iso;
    private final int m_priority;

    /**
     * Creates a new currency enum.
     *
     * @param iso The currency ISO code
     * @param priority The currency priority
     */
    Currency(String iso, int priority) {
        m_iso = iso;
        m_priority = priority;
    }

    /**
     * Returns the currency ISO code.
     *
     * @return A String
     */
    public String getISOCode() {
        return m_iso;
    }

    /**
     * Returns the currency priority relative other currencies with 1 the highest.
     *
     * @return An int
     */
    public int getPriority() {
        return m_priority;
    }
}
