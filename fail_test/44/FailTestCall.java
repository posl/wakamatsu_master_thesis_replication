package org.apache.commons.math;

import org.apache.commons.math.ode.events.EventStateTest;
// import org.junit.runner.JUnitCore;

public class FailTestCall {
  public static void main(String[] args) {
    //JUnitCore.main(HypergeometricDistributionTest.class.getName());
    EventStateTest e = new EventStateTest();
    e.testIssue695();
  }
}
