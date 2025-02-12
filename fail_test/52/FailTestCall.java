package org.apache.commons.math;

import org.apache.commons.math.geometry.euclidean.threed.RotationTest;
// import org.junit.runner.JUnitCore;

public class FailTestCall {
  public static void main(String[] args) {
    //JUnitCore.main(HypergeometricDistributionTest.class.getName());
    RotationTest r = new RotationTest();
    r.testIssue639();
  }
}
