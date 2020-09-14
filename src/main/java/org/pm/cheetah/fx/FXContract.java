package org.pm.cheetah.fx;

import org.pm.cheetah.util.CurrencyPair;

import java.util.Date;

/**
 * Interface for implementing FX contracts.
 *
 * @author Per Magnusson
 */
public interface FXContract {

    /**
     * Method to get  the currency pair.
     *
     * @return The currency pair
     */
    public CurrencyPair getCurrencyPair();

    /**
     * Method to get the trade date.
     *
     * @return The trade date
     */
    public Date getTradeDate();

    /**
     * Method to get the value date.
     *
     * @return The value date
     */
    public Date getValueDate();

}
