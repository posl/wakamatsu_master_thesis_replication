package org.apache.commons.math3;

import org.apache.commons.math3.geometry.euclidean.threed.SubLineTest;
//import org.apache.commons.math3.geometry.euclidean.twod.SubLineTest;
// import org.junit.runner.JUnitCore;

public class FailTestCall {
  public static void main(String[] args) {
    //JUnitCore.main(HypergeometricDistributionTest.class.getName());
    SubLineTest sl3 = new SubLineTest();
    org.apache.commons.math3.geometry.euclidean.twod.SubLineTest sl2 = new org.apache.commons.math3.geometry.euclidean.twod.SubLineTest();

    sl3.testIntersectionNotIntersecting();
    sl2.testIntersectionParallel();
  }
}
