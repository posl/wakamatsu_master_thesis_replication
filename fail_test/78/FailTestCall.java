package org.apache.commons.math;

import org.apache.commons.math.ode.events.EventStateTest;
import org.apache.commons.math.ode.events.EventException;
import org.apache.commons.math.ConvergenceException;
import org.apache.commons.math.ode.DerivativeException;
// import org.junit.runner.JUnitCore;

public class FailTestCall {
  public static void main(String[] args) throws EventException, ConvergenceException, DerivativeException {
    //JUnitCore.main(HypergeometricDistributionTest.class.getName());
    EventStateTest e = new EventStateTest();
    e.closeEvents();
  }
}
