/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 15 13:15:36 GMT 2018
 */

package model.impl.desconto;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import model.impl.desconto.IdosoDesconto;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class IdosoDesconto_ESTest extends IdosoDesconto_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      IdosoDesconto idosoDesconto0 = new IdosoDesconto();
      // Undeclared exception!
      try { 
        idosoDesconto0.getPercentualDeDesconto();
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Unresolved compilation problem: 
         // \tThe method getPercentualDeDesconto() of type IdosoDesconto must override a superclass method
         //
         verifyException("model.impl.desconto.IdosoDesconto", e);
      }
  }
}