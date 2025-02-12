package org.apache.commons.math;

import org.apache.commons.math.linear.SingularValueSolverTest;
// import org.junit.runner.JUnitCore;

public class FailTestCall {
  public static void main(String[] args) {
    //JUnitCore.main(HypergeometricDistributionTest.class.getName());
    SingularValueSolverTest s = new SingularValueSolverTest();
    s.testMath320A();
    s.testMath320B();
  }
}
