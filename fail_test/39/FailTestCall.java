package org.apache.commons.math;

import org.apache.commons.math.ode.nonstiff.DormandPrince853IntegratorTest;
// import org.junit.runner.JUnitCore;

public class FailTestCall {
  public static void main(String[] args) {
    //JUnitCore.main(HypergeometricDistributionTest.class.getName());
    DormandPrince853IntegratorTest dor = new DormandPrince853IntegratorTest();
    dor.testTooLargeFirstStep();
  }
}
