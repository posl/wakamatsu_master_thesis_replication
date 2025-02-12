package org.apache.commons.math3;

import org.apache.commons.math3.stat.inference.MannWhitneyUTestTest;
// import org.junit.runner.JUnitCore;

public class FailTestCall {
  public static void main(String[] args) throws Exception {
    //JUnitCore.main(HypergeometricDistributionTest.class.getName());
    MannWhitneyUTestTest man = new MannWhitneyUTestTest();
    man.testBigDataSet();
  }
}
