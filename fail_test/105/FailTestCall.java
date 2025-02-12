package org.apache.commons.math;

import org.apache.commons.math.stat.regression.SimpleRegressionTest;
// import org.junit.runner.JUnitCore;

public class FailTestCall {
  public static void main(String[] args) {
    //JUnitCore.main(HypergeometricDistributionTest.class.getName());
    SimpleRegressionTest s = new SimpleRegressionTest();
    s.testSSENonNegative();
  }
}
