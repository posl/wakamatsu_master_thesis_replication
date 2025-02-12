package org.apache.commons.math3;

import org.apache.commons.math3.genetics.ElitisticListPopulationTest;
// import org.junit.runner.JUnitCore;

public class FailTestCall {
  public static void main(String[] args) {
    //JUnitCore.main(HypergeometricDistributionTest.class.getName());
    ElitisticListPopulationTest el = new ElitisticListPopulationTest();
    el.testChromosomeListConstructorTooLow();
    el.testConstructorTooHigh();
    el.testConstructorTooLow();
    el.testChromosomeListConstructorTooHigh();
  }
}
