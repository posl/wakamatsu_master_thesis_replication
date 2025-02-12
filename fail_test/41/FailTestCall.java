package org.apache.commons.math;

import org.apache.commons.math.stat.descriptive.moment.VarianceTest;
// import org.junit.runner.JUnitCore;

public class FailTestCall {
  public static void main(String[] args) {
    //JUnitCore.main(HypergeometricDistributionTest.class.getName());
    VarianceTest var = new VarianceTest();
    var.testEvaluateArraySegmentWeighted();
  }
}
