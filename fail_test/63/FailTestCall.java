package org.apache.commons.math;

import org.apache.commons.math.util.MathUtilsTest;
// import org.junit.runner.JUnitCore;

public class FailTestCall {
  public static void main(String[] args) {
    //JUnitCore.main(HypergeometricDistributionTest.class.getName());
    MathUtilsTest m = new MathUtilsTest("name");
    m.testArrayEquals();
  }
}
