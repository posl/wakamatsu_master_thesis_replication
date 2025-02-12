package org.apache.commons.math3;

import org.apache.commons.math3.distribution.HypergeometricDistributionTest;
// import org.junit.runner.JUnitCore;

public class FailTestCall {
  public static void main(String[] args) {
    //JUnitCore.main(HypergeometricDistributionTest.class.getName());
    HypergeometricDistributionTest hgdt = new HypergeometricDistributionTest();
    hgdt.testMath1021();
  }
}
