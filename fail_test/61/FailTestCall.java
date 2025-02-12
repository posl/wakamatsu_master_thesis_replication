package org.apache.commons.math;

import org.apache.commons.math.distribution.PoissonDistributionTest;
// import org.junit.runner.JUnitCore;

public class FailTestCall {
  public static void main(String[] args) {
    //JUnitCore.main(HypergeometricDistributionTest.class.getName());
    PoissonDistributionTest p = new PoissonDistributionTest("name");
    p.testMean();
  }
}
