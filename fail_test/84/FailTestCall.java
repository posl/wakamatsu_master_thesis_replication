package org.apache.commons.math;

import org.apache.commons.math.optimization.direct.MultiDirectionalTest;
import org.apache.commons.math.ConvergenceException;
import org.apache.commons.math.FunctionEvaluationException;
// import org.junit.runner.JUnitCore;

public class FailTestCall {
  public static void main(String[] args) throws FunctionEvaluationException, ConvergenceException {
    //JUnitCore.main(HypergeometricDistributionTest.class.getName());
    MultiDirectionalTest m = new MultiDirectionalTest();
    m.testMinimizeMaximize();
    m.testMath283();
  }
}
