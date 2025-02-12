package org.apache.commons.math;

import org.apache.commons.math.fraction.BigFractionTest;
// import org.junit.runner.JUnitCore;

public class FailTestCall {
  public static void main(String[] args) {
    //JUnitCore.main(HypergeometricDistributionTest.class.getName());
    BigFractionTest b = new BigFractionTest();
    b.testFloatValueForLargeNumeratorAndDenominator();
    b.testDoubleValueForLargeNumeratorAndDenominator();
  }
}
