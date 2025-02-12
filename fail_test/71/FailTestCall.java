package org.apache.commons.math;

import org.apache.commons.math.ode.nonstiff.ClassicalRungeKuttaIntegratorTest;
import org.apache.commons.math.ode.nonstiff.DormandPrince853IntegratorTest;
import org.apache.commons.math.ode.DerivativeException;
import org.apache.commons.math.ode.IntegratorException;
// import org.junit.runner.JUnitCore;

public class FailTestCall {
  public static void main(String[] args) throws IntegratorException, DerivativeException {
    //JUnitCore.main(HypergeometricDistributionTest.class.getName());
    ClassicalRungeKuttaIntegratorTest c = new ClassicalRungeKuttaIntegratorTest("name1");
    DormandPrince853IntegratorTest d = new DormandPrince853IntegratorTest("name2");
    c.testMissedEndEvent();
    d.testMissedEndEvent();
  }
}
