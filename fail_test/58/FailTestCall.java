package org.apache.commons.math;

import org.apache.commons.math.optimization.fitting.GaussianFitterTest;
// import org.junit.runner.JUnitCore;

public class FailTestCall {
  public static void main(String[] args) {
    //JUnitCore.main(HypergeometricDistributionTest.class.getName());
    GaussianFitterTest g = new GaussianFitterTest();
    g.testMath519();
  }
}
