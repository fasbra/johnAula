/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 15 13:10:03 GMT 2018
 */

package model.impl.ingressos;

import org.junit.Test;
import static org.junit.Assert.*;
import model.impl.ingressos.IngressoBackStage;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class IngressoBackStage_ESTest extends IngressoBackStage_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      IngressoBackStage ingressoBackStage0 = new IngressoBackStage();
      assertEquals(800, ingressoBackStage0.getValor());
  }
}
