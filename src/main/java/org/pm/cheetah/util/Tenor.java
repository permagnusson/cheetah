package org.pm.cheetah.util;

/**
 * Enum representing a tenor (for example, Today, Tomorrow, Spot, 1 Week, 1 Month, etc.). The tenor refers to the length
 * of time remaining before a financial instrument expires.
 */
public enum Tenor {

    TODAY, TOMORROW, SPOT, ONE_WEEK, TWO_WEEKS, THREE_WEEKS, ONE_MONTH, THREE_MONTHS, SIX_MONTHS, TWELVE_MONTHS;
}
