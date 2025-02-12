package org.apache.commons.math;

import org.apache.commons.math.analysis.BrentSolverTest;
// import org.junit.runner.JUnitCore;

public class FailTestCall {
  public static void main(String[] args) throws Exception {
    //JUnitCore.main(HypergeometricDistributionTest.class.getName());
    BrentSolverTest b = new BrentSolverTest("name");
    b.testRootEndpoints();
  }
}
