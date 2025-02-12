package org.apache.commons.math;

import org.apache.commons.math.stat.inference.ChiSquareFactoryTest;
import org.apache.commons.math.stat.inference.ChiSquareTestTest;
import org.apache.commons.math.stat.inference.TestUtilsTest;
// import org.junit.runner.JUnitCore;

public class FailTestCall {
  public static void main(String[] args) throws Exception {
    //JUnitCore.main(HypergeometricDistributionTest.class.getName());
    ChiSquareFactoryTest csf = new ChiSquareFactoryTest("name");
    ChiSquareTestTest cst = new ChiSquareTestTest("name");
    TestUtilsTest t = new TestUtilsTest("name");
    csf.testChiSquareLargeTestStatistic();
    csf.testChiSquare();
    cst.testChiSquareLargeTestStatistic();
    cst.testChiSquare();
    t.testChiSquareLargeTestStatistic();
    t.testChiSquare();
  }
}
