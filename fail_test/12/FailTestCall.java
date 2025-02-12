package org.apache.commons.math3;

import org.apache.commons.math3.distribution.GammaDistributionTest;
import org.apache.commons.math3.distribution.LogNormalDistributionTest;
import org.apache.commons.math3.distribution.NormalDistributionTest;

import java.io.IOException;
// import org.junit.runner.JUnitCore;

public class FailTestCall {
  public static void main(String[] args) throws IOException, ClassNotFoundException {
    //JUnitCore.main(HypergeometricDistributionTest.class.getName());
    GammaDistributionTest gamma = new GammaDistributionTest();
    LogNormalDistributionTest log = new LogNormalDistributionTest();
    NormalDistributionTest normal = new NormalDistributionTest();
    gamma.testDistributionClone();
    log.testDistributionClone();
    normal.testDistributionClone();
  }
}
