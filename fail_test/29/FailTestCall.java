package org.apache.commons.math3;

import org.apache.commons.math3.linear.SparseRealVectorTest;
// import org.junit.runner.JUnitCore;

public class FailTestCall {
  public static void main(String[] args) {
    //JUnitCore.main(HypergeometricDistributionTest.class.getName());
    SparseRealVectorTest s = new SparseRealVectorTest();
    s.testEbeDivideMixedTypes();
    s.testEbeMultiplyMixedTypes();
    s.testEbeMultiplySameType();
  }
}
