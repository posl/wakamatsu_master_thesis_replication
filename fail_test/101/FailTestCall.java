package org.apache.commons.math;

import org.apache.commons.math.complex.ComplexFormatTest;
import org.apache.commons.math.complex.FrenchComplexFormatTest;
// import org.junit.runner.JUnitCore;

public class FailTestCall {
  public static void main(String[] args) {
    //JUnitCore.main(HypergeometricDistributionTest.class.getName());
    ComplexFormatTest c = new ComplexFormatTest();
    FrenchComplexFormatTest f = new FrenchComplexFormatTest();
    c.testForgottenImaginaryCharacter();
    f.testForgottenImaginaryCharacter();
  }
}
