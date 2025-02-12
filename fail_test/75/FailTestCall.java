package org.apache.commons.math;

import org.apache.commons.math.stat.FrequencyTest;
// import org.junit.runner.JUnitCore;

public class FailTestCall {
  public static void main(String[] args) {
    //JUnitCore.main(HypergeometricDistributionTest.class.getName());
    FrequencyTest f = new FrequencyTest("name");
    f.testPcts();
  }
}
