package org.apache.commons.math;

import org.apache.commons.math.distribution.NormalDistributionTest;
// import org.junit.runner.JUnitCore;

public class FailTestCall {
  public static void main(String[] args) throws MathException {
    //JUnitCore.main(HypergeometricDistributionTest.class.getName());
    NormalDistributionTest n = new NormalDistributionTest("name");
    n.testMath280();
  }
}
