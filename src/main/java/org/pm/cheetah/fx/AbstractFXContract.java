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
    protected BigDecimal m_rate;
    protected Date m_date;

    public AbstractFXContract(CurrencyPair pair, BigDecimal rate, Date date) {
        m_pair = pair;
        m_rate = rate;
        m_date = date;
    }

    @Override
    public CurrencyPair getCurrencyPair() {
        return m_pair;
    }

    @Override
    public BigDecimal getRate() {
        return m_rate;
    }

    @Override
    public Date getValueDate() {
        return m_date;
    }
}
