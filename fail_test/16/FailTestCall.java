package org.apache.commons.math3;

import org.apache.commons.math3.util.FastMathTest;
// import org.junit.runner.JUnitCore;

public class FailTestCall {
  public static void main(String[] args) {
    //JUnitCore.main(HypergeometricDistributionTest.class.getName());
    FastMathTest fast = new FastMathTest();
    fast.testMath905LargePositive();
    fast.testMath905LargeNegative();
  }
}
