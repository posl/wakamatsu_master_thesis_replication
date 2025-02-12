package org.apache.commons.math3;

import org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizerTest;
import org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizerTest;
import org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizerTest;
import org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizerMultiDirectionalTest;
import org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizerNelderMeadTest;
import org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizerTest;
import org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizerTest;
// import org.junit.runner.JUnitCore;

public class FailTestCall {
  public static void main(String[] args) {
    //JUnitCore.main(HypergeometricDistributionTest.class.getName());
    NonLinearConjugateGradientOptimizerTest nlcg = new NonLinearConjugateGradientOptimizerTest();
    CMAESOptimizerTest cmaes = new CMAESOptimizerTest();
    PowellOptimizerTest powell = new PowellOptimizerTest();
    SimplexOptimizerMultiDirectionalTest somd = new SimplexOptimizerMultiDirectionalTest();
    SimplexOptimizerNelderMeadTest sonm = new SimplexOptimizerNelderMeadTest();
    GaussNewtonOptimizerTest gauss = new GaussNewtonOptimizerTest();
    LevenbergMarquardtOptimizerTest leven = new LevenbergMarquardtOptimizerTest();

    nlcg.testTrivial();
    cmaes.testConstrainedRosen();
    cmaes.testElliRotated();
    cmaes.testEllipse();
    cmaes.testTwoAxes();
    cmaes.testCigar();
    cmaes.testRosen();
    cmaes.testRastrigin();
    cmaes.testDiagonalRosen();
    cmaes.testSsDiffPow();
    cmaes.testMaximize();
    cmaes.testAckley();
    cmaes.testCigTab();
    cmaes.testDiffPow();
    cmaes.testSphere();
    cmaes.testTablet();
    cmaes.testCigarWithBoundaries();
    powell.testSumSinc();
    somd.testMaximize1();
    somd.testMaximize2();
    somd.testMinimize1();
    somd.testMinimize2();
    sonm.testMaximize1();
    sonm.testMaximize2();
    sonm.testMinimize1();
    sonm.testMinimize2();
    gauss.testGetIterations();
    leven.testGetIterations();
  }
}
