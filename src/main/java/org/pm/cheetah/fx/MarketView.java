package org.pm.cheetah.fx;

import org.pm.cheetah.util.CurrencyPair;

import java.util.LinkedList;

public class MarketView {

    private final CurrencyPair m_pair;
    private final MarketViewList m_bidList = new MarketViewList();
    private final MarketViewList m_askList = new MarketViewList();

    public MarketView(CurrencyPair pair) {
        m_pair = pair;
    }

    public void addBid(MarketViewLevel level) {
        m_bidList.add(level);
    }

    public void addAsk(MarketViewLevel level) {
        m_askList.add(level);
    }

    public CurrencyPair getCurrencyPair() {
        return m_pair;
    }
}
