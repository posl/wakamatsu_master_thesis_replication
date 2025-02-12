package org.apache.commons.math3;

import org.apache.commons.math3.dfp.DfpTest;
// import org.junit.runner.JUnitCore;

public class FailTestCall {
  public static void main(String[] args) {
    //JUnitCore.main(HypergeometricDistributionTest.class.getName());
    DfpTest dfp = new DfpTest();
    dfp.testMultiply();
  }
}
