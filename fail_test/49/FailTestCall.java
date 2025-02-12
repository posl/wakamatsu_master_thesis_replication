package org.apache.commons.math;

import org.apache.commons.math.linear.SparseRealVectorTest;
// import org.junit.runner.JUnitCore;

public class FailTestCall {
  public static void main(String[] args) {
    //JUnitCore.main(HypergeometricDistributionTest.class.getName());
    SparseRealVectorTest s = new SparseRealVectorTest();
    s.testConcurrentModification();
  }
}
