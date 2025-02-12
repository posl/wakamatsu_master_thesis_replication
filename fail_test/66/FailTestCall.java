package org.apache.commons.math;

import org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizerTest;
import org.apache.commons.math.optimization.univariate.BrentOptimizerTest;
// import org.junit.runner.JUnitCore;

public class FailTestCall {
  public static void main(String[] args) throws MathException {
    //JUnitCore.main(HypergeometricDistributionTest.class.getName());
    MultiStartUnivariateRealOptimizerTest m = new MultiStartUnivariateRealOptimizerTest();
    BrentOptimizerTest b = new BrentOptimizerTest();
    m.testQuinticMin();
    m.testSinMin();
    b.testQuinticMin();
    b.testSinMin();
  }
}
