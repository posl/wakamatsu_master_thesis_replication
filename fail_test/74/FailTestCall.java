package org.apache.commons.math;

import org.apache.commons.math.ode.nonstiff.AdamsMoultonIntegratorTest;
import org.apache.commons.math.ode.DerivativeException;
import org.apache.commons.math.ode.IntegratorException;
// import org.junit.runner.JUnitCore;

public class FailTestCall {
  public static void main(String[] args) throws DerivativeException, IntegratorException {
    //JUnitCore.main(HypergeometricDistributionTest.class.getName());
    AdamsMoultonIntegratorTest a = new AdamsMoultonIntegratorTest();
    a.polynomial();
  }
}
