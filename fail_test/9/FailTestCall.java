package org.apache.commons.math3;

import org.apache.commons.math3.geometry.euclidean.threed.LineTest;
// import org.junit.runner.JUnitCore;

public class FailTestCall {
  public static void main(String[] args) {
    //JUnitCore.main(HypergeometricDistributionTest.class.getName());
    LineTest line = new LineTest();
    line.testRevert();
  }
}
