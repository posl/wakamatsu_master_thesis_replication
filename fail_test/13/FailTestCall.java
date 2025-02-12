package org.apache.commons.math3;

import org.apache.commons.math3.optimization.fitting.PolynomialFitterTest;
// import org.junit.runner.JUnitCore;

public class FailTestCall {
  public static void main(String[] args) {
    //JUnitCore.main(HypergeometricDistributionTest.class.getName());
    PolynomialFitterTest poly = new PolynomialFitterTest();
    poly.testLargeSample();
  }
}
