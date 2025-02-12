package org.apache.commons.math;

import org.apache.commons.math.linear.BigMatrixImplTest;
import org.apache.commons.math.linear.RealMatrixImplTest;
// import org.junit.runner.JUnitCore;

public class FailTestCall {
  public static void main(String[] args) {
    //JUnitCore.main(HypergeometricDistributionTest.class.getName());
    BigMatrixImplTest b = new BigMatrixImplTest("name1");
    RealMatrixImplTest r = new RealMatrixImplTest("name2");
    b.testMath209();
    r.testMath209();
  }
}
