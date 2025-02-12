package org.apache.commons.math3;

import org.apache.commons.math3.ode.nonstiff.DormandPrince853IntegratorTest;
// import org.junit.runner.JUnitCore;

public class FailTestCall {
  public static void main(String[] args) {
    //JUnitCore.main(HypergeometricDistributionTest.class.getName());
    DormandPrince853IntegratorTest dormand = new DormandPrince853IntegratorTest();
    dormand.testEventsScheduling();
  }
}
