package org.pm.cheetah.ir;

import java.math.BigDecimal;
import java.util.Date;

public class AbstractRatePoint implements RatePoint {

    protected BigDecimal m_rate;
    protected Date m_date;

    @Override
    public BigDecimal getRate() {
        return null;
    }

    @Override
    public Date getDate() {
        return null;
    }
}
