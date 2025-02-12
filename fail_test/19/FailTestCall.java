package org.apache.commons.math3;

import org.apache.commons.math3.optimization.direct.CMAESOptimizerTest;
// import org.junit.runner.JUnitCore;

public class FailTestCall {
  public static void main(String[] args) {
    //JUnitCore.main(HypergeometricDistributionTest.class.getName());
    CMAESOptimizerTest cmaes = new CMAESOptimizerTest();
    cmaes.testBoundaryRangeTooLarge();
  }
}
