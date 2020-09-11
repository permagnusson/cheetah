package org.pm.cheetah.util;

/**
 * Enum representing a currency.
 *
 * @author Per Magnusson
 */
public enum Currency {

    USD("USD"), CHF("CHF"), SEK("SEK");
    private final String m_iso;

    /**
     * Creates a new currency enum.
     *
     * @param iso The ISO code
     */
    Currency(String iso) {
        m_iso = iso;
    }

    /**
     * Returns the currency ISO code.
     *
     * @return A String
     */
    public String getISOCode() {
        return m_iso;
    }
}
