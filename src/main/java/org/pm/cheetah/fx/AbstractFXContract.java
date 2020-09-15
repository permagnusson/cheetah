package org.pm.cheetah.fx;

import org.pm.cheetah.util.CurrencyPair;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Abstract class implementing the FX contract interface.
 *
 * @author Per Magnusson
 */
public class AbstractFXContract implements FXContract {

    protected CurrencyPair m_pair;
    protected BigDecimal m_bidRate;
    protected BigDecimal m_askRate;
    protected Date m_date;

    /**
     * Creates a new instance.
     *
     * @param pair    The currency pair
     * @param bidRate The bid rate
     * @param askRate The ask rate
     * @param date    The value date
     */
    public AbstractFXContract(CurrencyPair pair, BigDecimal bidRate, BigDecimal askRate, Date date) {
        m_pair = pair;
        m_bidRate = bidRate;
        m_askRate = askRate;
        m_date = date;
    }

    @Override
    public CurrencyPair getCurrencyPair() {
        return m_pair;
    }

    @Override
    public BigDecimal getBidRate() {
        return m_bidRate;
    }

    @Override
    public BigDecimal getAskRate() {
        return m_askRate;
    }

    @Override
    public Date getValueDate() {
        return m_date;
    }
}
