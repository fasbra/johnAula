/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 15 17:05:43 GMT 2018
 */

package model.impl.desconto;

import org.junit.Test;
import static org.junit.Assert.*;
import model.impl.desconto.SemDesconto;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SemDesconto_ESTest extends SemDesconto_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SemDesconto semDesconto0 = new SemDesconto();
      Double double0 = semDesconto0.getPercentualDeDesconto();
      assertEquals(0.0, (double)double0, 0.01);
  }
}
