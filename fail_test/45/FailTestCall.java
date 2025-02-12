package org.apache.commons.math;

import org.apache.commons.math.linear.OpenMapRealMatrixTest;
// import org.junit.runner.JUnitCore;

public class FailTestCall {
  public static void main(String[] args) {
    //JUnitCore.main(HypergeometricDistributionTest.class.getName());
    OpenMapRealMatrixTest op = new OpenMapRealMatrixTest();
    op.testMath679();
  }
}
