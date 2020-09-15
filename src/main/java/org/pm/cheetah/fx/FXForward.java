package org.pm.cheetah.fx;

import org.pm.cheetah.util.CurrencyPair;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Class representing a FX Forward.
 *
 * @author Per Magnusson
 */
public class FXForward extends AbstractFXContract {

    private BigDecimal m_bidMargin;
    private BigDecimal m_askMargin;

    /**
     * Creates a new instance.
     *
     * @param pair      The currency pair
     * @param bidRate   The forward bid rate
     * @param askRate   The forward ask rate
     * @param bidMargin The forward bid margin
     * @param askMargin The forward ask margin
     * @param date      The forward date
     */
    public FXForward(CurrencyPair pair, BigDecimal bidRate, BigDecimal askRate, BigDecimal bidMargin, BigDecimal askMargin, Date date) {
        super(pair, bidRate, askRate, date);
        m_bidMargin = bidMargin;
        m_askMargin = askMargin;
    }

    /**
     * Method to get the forward bid margin.
     *
     * @return The bid margin
     */
    public BigDecimal getBidMargin() {
        return m_bidMargin;
    }

    /**
     * Method to get the forward ask margin.
     *
     * @return The ask margin
     */
    public BigDecimal getAskMargin() {
        return m_askMargin;
    }
}
