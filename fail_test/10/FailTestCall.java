package org.apache.commons.math3;

import org.apache.commons.math3.analysis.differentiation.DerivativeStructureTest;
// import org.junit.runner.JUnitCore;

public class FailTestCall {
  public static void main(String[] args) {
    //JUnitCore.main(HypergeometricDistributionTest.class.getName());
    DerivativeStructureTest deriv = new DerivativeStructureTest();
    deriv.testAtan2SpecialCases();
  }
}
