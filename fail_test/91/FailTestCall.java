package org.apache.commons.math;

import org.apache.commons.math.fraction.FractionTest;
// import org.junit.runner.JUnitCore;

public class FailTestCall {
  public static void main(String[] args) {
    //JUnitCore.main(HypergeometricDistributionTest.class.getName());
    FractionTest f = new FractionTest();
    f.testCompareTo();
  }
}
