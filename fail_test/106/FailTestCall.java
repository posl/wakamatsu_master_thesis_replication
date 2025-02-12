package org.apache.commons.math;

import org.apache.commons.math.fraction.FractionFormatTest;
// import org.junit.runner.JUnitCore;

public class FailTestCall {
  public static void main(String[] args) {
    //JUnitCore.main(HypergeometricDistributionTest.class.getName());
    FractionFormatTest f = new FractionFormatTest();
    f.testParseProperInvalidMinus();
  }
}
