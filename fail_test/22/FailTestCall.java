package org.apache.commons.math3;

import org.apache.commons.math3.distribution.FDistributionTest;
import org.apache.commons.math3.distribution.UniformRealDistributionTest;
// import org.junit.runner.JUnitCore;

public class FailTestCall {
  public static void main(String[] args) {
    //JUnitCore.main(HypergeometricDistributionTest.class.getName());
    FDistributionTest f = new FDistributionTest();
    UniformRealDistributionTest uni = new UniformRealDistributionTest();
    f.testIsSupportLowerBoundInclusive();
    uni.testIsSupportUpperBoundInclusive();
  }
}
