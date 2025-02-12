package org.apache.commons.math3;

import org.apache.commons.math3.complex.ComplexTest;
// import org.junit.runner.JUnitCore;

public class FailTestCall {
  public static void main(String[] args) {
    //JUnitCore.main(HypergeometricDistributionTest.class.getName());
    ComplexTest ct = new ComplexTest();
    ct.testReciprocalZero();
  }
}
