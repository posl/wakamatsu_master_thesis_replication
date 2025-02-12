package org.apache.commons.math3;

import org.apache.commons.math3.genetics.ListPopulationTest;
// import org.junit.runner.JUnitCore;

public class FailTestCall {
  public static void main(String[] args) {
    //JUnitCore.main(HypergeometricDistributionTest.class.getName());
    ListPopulationTest list = new ListPopulationTest();
    list.testIterator();
  }
}
