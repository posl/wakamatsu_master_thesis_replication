package org.apache.commons.math3;

import org.apache.commons.math3.distribution.BinomialDistributionTest;
import org.apache.commons.math3.distribution.FDistributionTest;
// import org.junit.runner.JUnitCore;

public class FailTestCall {
  public static void main(String[] args) {
    //JUnitCore.main(HypergeometricDistributionTest.class.getName());
    BinomialDistributionTest bin = new BinomialDistributionTest();
    FDistributionTest f = new FDistributionTest();
    bin.testMath718();
    f.testMath785();
  }
}
