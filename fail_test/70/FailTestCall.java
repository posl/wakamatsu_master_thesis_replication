package org.apache.commons.math;

import org.apache.commons.math.analysis.solvers.BisectionSolverTest;
// import org.junit.runner.JUnitCore;

public class FailTestCall {
  public static void main(String[] args) throws Exception {
    //JUnitCore.main(HypergeometricDistributionTest.class.getName());
    BisectionSolverTest b = new BisectionSolverTest();
    b.testMath369();
  }
}
