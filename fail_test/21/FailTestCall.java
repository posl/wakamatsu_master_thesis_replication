package org.apache.commons.math3;

import org.apache.commons.math3.linear.RectangularCholeskyDecompositionTest;
// import org.junit.runner.JUnitCore;

public class FailTestCall {
  public static void main(String[] args) {
    //JUnitCore.main(HypergeometricDistributionTest.class.getName());
    RectangularCholeskyDecompositionTest rect = new RectangularCholeskyDecompositionTest();
    rect.testMath789();
    rect.testFullRank();
  }
}
