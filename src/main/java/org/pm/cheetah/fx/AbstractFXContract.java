package org.pm.cheetah.fx;

import org.pm.cheetah.util.CurrencyPair;

import java.util.Date;

/**
 * Abstract class implementing the FX contract interface.
 *
 * @author Per Magnusson
 */
public class AbstractFXContract implements FXContract {

    protected CurrencyPair m_pair;
    protected Date m_tradeDate;
    protected Date m_valueDate;

    @Override
    public CurrencyPair getCurrencyPair() {
        return m_pair;
    }

    @Override
    public Date getTradeDate() {
        return m_tradeDate;
    }

    @Override
    public Date getValueDate() {
        return m_valueDate;
    }
}
