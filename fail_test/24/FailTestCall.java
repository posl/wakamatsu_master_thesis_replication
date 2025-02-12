package org.apache.commons.math3;

import org.apache.commons.math3.optimization.univariate.BrentOptimizerTest;
// import org.junit.runner.JUnitCore;

public class FailTestCall {
  public static void main(String[] args) {
    //JUnitCore.main(HypergeometricDistributionTest.class.getName());
    BrentOptimizerTest brent = new BrentOptimizerTest();
    brent.testMath855();
  }
}
