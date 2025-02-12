package org.apache.commons.math;

import org.apache.commons.math.util.FastMathTest;
// import org.junit.runner.JUnitCore;

public class FailTestCall {
  public static void main(String[] args) {
    //JUnitCore.main(HypergeometricDistributionTest.class.getName());
    FastMathTest f = new FastMathTest();
    f.testMinMaxFloat();
  }
}
