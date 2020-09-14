package org.pm.cheetah.fx;

import org.pm.cheetah.util.CurrencyPair;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Class representing a FX Spot.
 */
public class FXSpot extends AbstractFXContract {


    public FXSpot(CurrencyPair pair, BigDecimal rate, Date date) {
        super(pair, rate, date);
    }
}
