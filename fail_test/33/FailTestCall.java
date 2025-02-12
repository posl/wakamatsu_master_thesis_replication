package org.apache.commons.math3;

import org.apache.commons.math3.optimization.linear.SimplexSolverTest;
// import org.junit.runner.JUnitCore;

public class FailTestCall {
  public static void main(String[] args) {
    //JUnitCore.main(HypergeometricDistributionTest.class.getName());
    SimplexSolverTest s = new SimplexSolverTest();
    s.testMath781();
  }
}
