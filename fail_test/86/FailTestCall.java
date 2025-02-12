package org.apache.commons.math;

import org.apache.commons.math.linear.CholeskyDecompositionImplTest;
// import org.junit.runner.JUnitCore;

public class FailTestCall {
  public static void main(String[] args) throws MathException {
    //JUnitCore.main(HypergeometricDistributionTest.class.getName());
    CholeskyDecompositionImplTest c = new CholeskyDecompositionImplTest();
    c.testMath274();
    c.testNotPositiveDefinite();
  }
}
