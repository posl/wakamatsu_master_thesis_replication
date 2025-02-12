package org.apache.commons.math;

import org.apache.commons.math.estimation.GaussNewtonEstimatorTest;
import org.apache.commons.math.estimation.EstimationException;
// import org.junit.runner.JUnitCore;

public class FailTestCall {
  public static void main(String[] args) throws EstimationException {
    //JUnitCore.main(HypergeometricDistributionTest.class.getName());
    GaussNewtonEstimatorTest g = new GaussNewtonEstimatorTest();
    g.testBoundParameters();
  }
}
