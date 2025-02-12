package org.apache.commons.math;

import org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizerTest;
import org.apache.commons.math.FunctionEvaluationException;
import org.apache.commons.math.optimization.OptimizationException;
// import org.junit.runner.JUnitCore;

public class FailTestCall {
  public static void main(String[] args) throws FunctionEvaluationException, OptimizationException {
    //JUnitCore.main(HypergeometricDistributionTest.class.getName());
    LevenbergMarquardtOptimizerTest l = new LevenbergMarquardtOptimizerTest("name");
    l.testCircleFitting();
  }
}
