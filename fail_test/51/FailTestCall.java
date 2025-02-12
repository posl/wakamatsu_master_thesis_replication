package org.apache.commons.math;

import org.apache.commons.math.analysis.solvers.RegulaFalsiSolverTest;
// import org.junit.runner.JUnitCore;

public class FailTestCall {
  public static void main(String[] args) {
    //JUnitCore.main(HypergeometricDistributionTest.class.getName());
    RegulaFalsiSolverTest r = new RegulaFalsiSolverTest();
    r.testIssue631();
  }
}
