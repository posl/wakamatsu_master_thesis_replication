package org.apache.commons.math;

import org.apache.commons.math.stat.clustering.KMeansPlusPlusClustererTest;
// import org.junit.runner.JUnitCore;

public class FailTestCall {
  public static void main(String[] args) {
    //JUnitCore.main(HypergeometricDistributionTest.class.getName());
    KMeansPlusPlusClustererTest k = new KMeansPlusPlusClustererTest();
    k.testSmallDistances();
  }
}
