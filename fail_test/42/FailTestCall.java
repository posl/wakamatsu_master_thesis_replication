package org.apache.commons.math;

import org.apache.commons.math.optimization.linear.SimplexSolverTest;
// import org.junit.runner.JUnitCore;

public class FailTestCall {
  public static void main(String[] args) {
    //JUnitCore.main(HypergeometricDistributionTest.class.getName());
    SimplexSolverTest s = new SimplexSolverTest();
    s.testMath713NegativeVariable();
  }
}
