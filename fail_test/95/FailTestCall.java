package org.apache.commons.math;

import org.apache.commons.math.distribution.FDistributionTest;
// import org.junit.runner.JUnitCore;

public class FailTestCall {
  public static void main(String[] args) throws Exception {
    //JUnitCore.main(HypergeometricDistributionTest.class.getName());
    FDistributionTest f = new FDistributionTest("name");
    f.testSmallDegreesOfFreedom();
  }
}
