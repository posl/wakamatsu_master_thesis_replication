package org.apache.commons.math;

import org.apache.commons.math.distribution.NormalDistributionTest;
// import org.junit.runner.JUnitCore;

public class FailTestCall {
  public static void main(String[] args) throws Exception {
    //JUnitCore.main(HypergeometricDistributionTest.class.getName());
    NormalDistributionTest n = new NormalDistributionTest("name");
    n.testExtremeValues();
  }
}
