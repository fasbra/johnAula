/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 15 17:02:57 GMT 2018
 */

package model.impl.ingressos;

import org.junit.Test;
import static org.junit.Assert.*;
import model.impl.ingressos.IngressoVip;
import model.impl.ingressos.TipoIngresso;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class IngressoVip_ESTest extends IngressoVip_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      IngressoVip ingressoVip0 = new IngressoVip();
      assertEquals(TipoIngresso.VIP, ingressoVip0.getTipoIngresso());
  }
}
