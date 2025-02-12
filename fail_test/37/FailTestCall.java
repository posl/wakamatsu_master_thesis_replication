package org.apache.commons.math;

import org.apache.commons.math.complex.ComplexTest;
// import org.junit.runner.JUnitCore;

public class FailTestCall {
  public static void main(String[] args) {
    //JUnitCore.main(HypergeometricDistributionTest.class.getName());
    ComplexTest c = new ComplexTest();
    c.testTanhInf();
    c.testTan();
    c.testTanh();
    c.testTanInf();
  }
}
