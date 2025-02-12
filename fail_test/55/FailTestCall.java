package org.apache.commons.math;

import org.apache.commons.math.geometry.Vector3DTest;
// import org.junit.runner.JUnitCore;

public class FailTestCall {
  public static void main(String[] args) {
    //JUnitCore.main(HypergeometricDistributionTest.class.getName());
    Vector3DTest v = new Vector3DTest();
    v.testCrossProductCancellation();
  }
}
