/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 15 17:05:40 GMT 2018
 */

package model.impl.desconto;

import org.junit.Test;
import static org.junit.Assert.*;
import model.impl.desconto.PrataDesconto;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class PrataDesconto_ESTest extends PrataDesconto_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      PrataDesconto prataDesconto0 = new PrataDesconto();
      Double double0 = prataDesconto0.getPercentualDeDesconto();
      assertEquals(0.6, (double)double0, 0.01);
  }
}