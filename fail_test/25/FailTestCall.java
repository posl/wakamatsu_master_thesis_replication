package org.apache.commons.math3;

import org.apache.commons.math3.optimization.fitting.HarmonicFitterTest;
// import org.junit.runner.JUnitCore;

public class FailTestCall {
  public static void main(String[] args) {
    //JUnitCore.main(HypergeometricDistributionTest.class.getName());
    HarmonicFitterTest har = new HarmonicFitterTest();
    har.testMath844();
  }
}
