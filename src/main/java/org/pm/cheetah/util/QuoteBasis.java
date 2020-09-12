package org.pm.cheetah.util;

/**
 * Enum representing the quote basis. Either direct quotation where USD is the base currency or indirect quotation where
 * USD is the terms currency.
 *
 * @author Per Magnusson
 */
public enum QuoteBasis {

    DIRECT, INDIRECT;

    /**
     * Returns true if the quote basis is direct.
     *
     * @return A boolean
     */
    public boolean isDirect() {
        return this == DIRECT;
    }
}
