package com.zipcodewilmington.danny_do_better_exercises;

/**
 * Created by dan on 6/14/17.
 */
public class PredicateUtilities {
    /**
     * @param x
     * @param y
     * @return true if `x` is greater than `y`
     */
    public Boolean isGreaterThan(int x, int y) {
        boolean greaterThan = x > y ? true:false;
        return greaterThan;

    }

    /**
     * @param x
     * @param y
     * @return true if `x` is less than `y`
     */
    public Boolean isLessThan(int x, int y) {
        boolean lessThan = x < y ? true:false;
        return lessThan;
    }

    /**
     * @param x
     * @param y
     * @return true if `x` is greater than or equal to `y`
     */
    public Boolean isGreaterThanOrEqualTo(int x, int y) {
        boolean greaterThanOrEqual = x >= y ? true:false;
        return greaterThanOrEqual;
    }

    /**
     * @param x
     * @param y
     * @return true if `x` is less than or equal to `y`
     */
    public Boolean isLessThanOrEqualTo(int x, int y) {
        boolean lessThanOrEqual = x <= y ? true:false;
        return lessThanOrEqual;
    }


    /**
     * @return true
     */
    public Boolean returnTrue() {
        boolean positive = true;
        return positive;
    }

    /**
     * @return false
     */
    public Boolean returnFalse() {
        boolean negative = false;
        return negative;
    }

}