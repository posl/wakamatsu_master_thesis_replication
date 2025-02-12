package org.apache.commons.math;

import org.apache.commons.math.linear.ArrayRealVectorTest;
import org.apache.commons.math.linear.SparseRealVectorTest;
// import org.junit.runner.JUnitCore;

public class FailTestCall {
  public static void main(String[] args) {
    //JUnitCore.main(HypergeometricDistributionTest.class.getName());
    ArrayRealVectorTest a = new ArrayRealVectorTest();
    SparseRealVectorTest s = new SparseRealVectorTest();
    a.testBasicFunctions();
    s.testBasicFunctions();
  }
}
