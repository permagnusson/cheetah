package org.pm.cheetah.fx;

import org.pm.cheetah.util.CurrencyPair;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Class representing a FX Forward.
 */
public class FXForward extends AbstractFXContract {


    public FXForward(CurrencyPair pair, BigDecimal rate, Date date) {
        super(pair, rate, date);
    }
}
