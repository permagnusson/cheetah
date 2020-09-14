package org.pm.cheetah.ir;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Interface representing a rate point.
 *
 * @author Per Magnusson
 */
public interface RatePoint {

    public BigDecimal getRate();

    public Date getDate();
}
