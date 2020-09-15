package org.pm.cheetah.fx;

import org.pm.cheetah.util.CurrencyPair;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Interface for implementing FX contracts.
 *
 * @author Per Magnusson
 */
public interface FXContract {

    /**
     * Method to get the currency pair.
     *
     * @return The currency pair
     */
    public CurrencyPair getCurrencyPair();

    /**
     * Method to get the bid rate.
     *
     * @return The rate
     */
    public BigDecimal getBidRate();

    /**
     * Method to get the ask rate.
     *
     * @return The rate
     */
    public BigDecimal getAskRate();

    /**
     * Method to get the value date.
     *
     * @return The value date
     */
    public Date getValueDate();

}
