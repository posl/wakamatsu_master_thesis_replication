package org.apache.commons.math3;

import org.apache.commons.math3.fraction.BigFractionTest;
import org.apache.commons.math3.fraction.FractionTest;
// import org.junit.runner.JUnitCore;

public class FailTestCall {
  public static void main(String[] args) {
    //JUnitCore.main(HypergeometricDistributionTest.class.getName());
    BigFractionTest bft = new BigFractionTest();
    FractionTest ft = new FractionTest();
    bft.testDigitLimitConstructor();
    ft.testDigitLimitConstructor();
  }
}
