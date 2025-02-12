package org.apache.commons.math;

import org.apache.commons.math.optimization.general.MinpackTest;
// import org.junit.runner.JUnitCore;

public class FailTestCall {
  public static void main(String[] args) {
    //JUnitCore.main(HypergeometricDistributionTest.class.getName());
    MinpackTest m = new MinpackTest("name");
    m.testMinpackJennrichSampson();
    m.testMinpackFreudensteinRoth();
  }
}
