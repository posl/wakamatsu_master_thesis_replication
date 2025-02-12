package org.apache.commons.math;

import org.apache.commons.math.util.MultidimensionalCounterTest;
// import org.junit.runner.JUnitCore;

public class FailTestCall {
  public static void main(String[] args) {
    //JUnitCore.main(HypergeometricDistributionTest.class.getName());
    MultidimensionalCounterTest m = new MultidimensionalCounterTest();
    m.testIterationConsistency();
  }
}
