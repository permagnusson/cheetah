package org.pm.cheetah.fx;

public class MarketViewLevel {

    enum Side {BID, ASK};
    private final Side m_side;

    public MarketViewLevel(Side side) {
        m_side = side;
    }

    public boolean isBid() {
        return m_side == Side.BID;
    }

    public boolean isAsk() {
        return m_side == Side.ASK;
    }

}
