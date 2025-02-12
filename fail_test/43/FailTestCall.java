package org.apache.commons.math;

import org.apache.commons.math.stat.descriptive.SummaryStatisticsTest;
import org.apache.commons.math.stat.descriptive.SynchronizedSummaryStatisticsTest;
// import org.junit.runner.JUnitCore;

public class FailTestCall {
  public static void main(String[] args) throws Exception {
    //JUnitCore.main(HypergeometricDistributionTest.class.getName());
    SummaryStatisticsTest sum = new SummaryStatisticsTest();
    SynchronizedSummaryStatisticsTest syn = new SynchronizedSummaryStatisticsTest();
    sum.testOverrideMeanWithMathClass();
    sum.testOverrideGeoMeanWithMathClass();
    sum.testOverrideVarianceWithMathClass();
    syn.testOverrideMeanWithMathClass();
    syn.testOverrideGeoMeanWithMathClass();
    syn.testOverrideVarianceWithMathClass();
  }
}
