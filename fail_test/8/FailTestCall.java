package org.apache.commons.math3;

import org.apache.commons.math3.distribution.DiscreteRealDistributionTest;
// import org.junit.runner.JUnitCore;

public class FailTestCall {
  public static void main(String[] args) {
    //JUnitCore.main(HypergeometricDistributionTest.class.getName());
    DiscreteRealDistributionTest disc = new DiscreteRealDistributionTest();
    disc.testIssue942();
  }
}
