package org.apache.commons.math;

import org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolverTest;
// import org.junit.runner.JUnitCore;

public class FailTestCall {
  public static void main(String[] args) {
    //JUnitCore.main(HypergeometricDistributionTest.class.getName());
    BracketingNthOrderBrentSolverTest b = new BracketingNthOrderBrentSolverTest();
    b.testIssue716();
  }
}
