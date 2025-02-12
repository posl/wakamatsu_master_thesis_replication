package org.apache.commons.math;

import org.apache.commons.math.stat.correlation.PearsonsCorrelationTest;
import org.apache.commons.math.stat.correlation.SpearmansRankCorrelationTest;
// import org.junit.runner.JUnitCore;

public class FailTestCall {
  public static void main(String[] args) throws Exception {
    //JUnitCore.main(HypergeometricDistributionTest.class.getName());
    PearsonsCorrelationTest p = new PearsonsCorrelationTest();
    SpearmansRankCorrelationTest s = new SpearmansRankCorrelationTest();
    p.testPValueNearZero();
    s.testPValueNearZero();
  }
}
