package org.apache.commons.math;

import org.apache.commons.math.linear.EigenDecompositionImplTest;
// import org.junit.runner.JUnitCore;

public class FailTestCall {
  public static void main(String[] args) {
    //JUnitCore.main(HypergeometricDistributionTest.class.getName());
    EigenDecompositionImplTest e = new EigenDecompositionImplTest("name");
    e.testMathpbx02();
  }
}
