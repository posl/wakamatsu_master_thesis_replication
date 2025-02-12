package org.apache.commons.math;

import org.apache.commons.math.dfp.DfpTest;
// import org.junit.runner.JUnitCore;

public class FailTestCall {
  public static void main(String[] args) {
    //JUnitCore.main(HypergeometricDistributionTest.class.getName());
    DfpTest d = new DfpTest();
    d.testIssue567();
  }
}
