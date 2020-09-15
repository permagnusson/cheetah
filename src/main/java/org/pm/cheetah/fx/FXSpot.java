package org.pm.cheetah.fx;

import org.pm.cheetah.util.CurrencyPair;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Class representing a FX Spot.
 */
public class FXSpot extends AbstractFXContract {

    /**
     * Creates a new instance.
     *
     * @param pair    The currency pair
     * @param bidRate The bid rate
     * @param askRate The ask rate
     * @param date    The value date
     */
    public FXSpot(CurrencyPair pair, BigDecimal bidRate, BigDecimal askRate, Date date) {
        super(pair, bidRate, askRate, date);
    }
}
