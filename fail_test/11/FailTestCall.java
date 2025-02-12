package org.apache.commons.math3;

import org.apache.commons.math3.distribution.MultivariateNormalDistributionTest;
// import org.junit.runner.JUnitCore;

public class FailTestCall {
  public static void main(String[] args) {
    //JUnitCore.main(HypergeometricDistributionTest.class.getName());
    MultivariateNormalDistributionTest multi = new MultivariateNormalDistributionTest();
    multi.testUnivariateDistribution();
  }
}
