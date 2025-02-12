package org.apache.commons.math;

import org.apache.commons.math.special.GammaTest;
// import org.junit.runner.JUnitCore;

public class FailTestCall {
  public static void main(String[] args) {
    //JUnitCore.main(HypergeometricDistributionTest.class.getName());
    GammaTest g = new GammaTest("name");
    g.testRegularizedGammaPositivePositive();
  }
}
