/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 15 17:02:01 GMT 2018
 */

package model.impl;

import org.junit.Test;
import static org.junit.Assert.*;
import model.Desconto;
import model.impl.Comprador;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Comprador_ESTest extends Comprador_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Comprador[] compradorArray0 = Comprador.values();
      assertEquals(5, compradorArray0.length);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Comprador comprador0 = Comprador.valueOf("PRATA");
      assertEquals(Comprador.PRATA, comprador0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Comprador comprador0 = Comprador.NORMAL;
      Desconto desconto0 = comprador0.getDesconto();
      assertNotNull(desconto0);
  }
}
