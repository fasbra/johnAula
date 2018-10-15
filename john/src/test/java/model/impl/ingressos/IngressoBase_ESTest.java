/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 15 13:13:18 GMT 2018
 */

package model.impl.ingressos;

import org.junit.Test;
import static org.junit.Assert.*;
import model.impl.ingressos.IngressoBase;
import model.impl.ingressos.TipoIngresso;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class IngressoBase_ESTest extends IngressoBase_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TipoIngresso tipoIngresso0 = TipoIngresso.VIP;
      IngressoBase ingressoBase0 = new IngressoBase(0, tipoIngresso0);
      int int0 = ingressoBase0.getValor();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      TipoIngresso tipoIngresso0 = TipoIngresso.PLATEIA_VIP;
      IngressoBase ingressoBase0 = new IngressoBase(626, tipoIngresso0);
      int int0 = ingressoBase0.getValor();
      assertEquals(626, int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      TipoIngresso tipoIngresso0 = TipoIngresso.BACKSTAGE;
      IngressoBase ingressoBase0 = new IngressoBase((-1), tipoIngresso0);
      ingressoBase0.getTipoIngresso();
      assertEquals((-1), ingressoBase0.getValor());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      IngressoBase ingressoBase0 = new IngressoBase((-20), (TipoIngresso) null);
      int int0 = ingressoBase0.getValor();
      assertEquals((-20), int0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      IngressoBase ingressoBase0 = new IngressoBase((-20), (TipoIngresso) null);
      ingressoBase0.getTipoIngresso();
      assertEquals((-20), ingressoBase0.getValor());
  }
}
