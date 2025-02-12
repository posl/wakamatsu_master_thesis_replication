package org.apache.commons.math;

import org.apache.commons.math.optimization.direct.BOBYQAOptimizerTest;
// import org.junit.runner.JUnitCore;

public class FailTestCall {
  public static void main(String[] args) {
    //JUnitCore.main(HypergeometricDistributionTest.class.getName());
    BOBYQAOptimizerTest b = new BOBYQAOptimizerTest();
    b.testConstrainedRosenWithMoreInterpolationPoints();
  }
}
