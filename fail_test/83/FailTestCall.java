package org.apache.commons.math;

import org.apache.commons.math.optimization.linear.SimplexSolverTest;
import org.apache.commons.math.optimization.OptimizationException;
// import org.junit.runner.JUnitCore;

public class FailTestCall {
  public static void main(String[] args) throws OptimizationException {
    //JUnitCore.main(HypergeometricDistributionTest.class.getName());
    SimplexSolverTest s = new SimplexSolverTest();
    s.testMath286();
  }
}
