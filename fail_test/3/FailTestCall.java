package org.apache.commons.math3;

import org.apache.commons.math3.util.MathArraysTest;
// import org.junit.runner.JUnitCore;

public class FailTestCall {
  public static void main(String[] args) {
    //JUnitCore.main(HypergeometricDistributionTest.class.getName());
    MathArraysTest mat = new MathArraysTest();
    mat.testLinearCombinationWithSingleElementArray();
  }
}
