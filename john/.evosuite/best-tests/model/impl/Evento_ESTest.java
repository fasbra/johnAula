/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 15 17:05:29 GMT 2018
 */

package model.impl;

import org.junit.Test;
import static org.junit.Assert.*;
import java.time.LocalDate;
import model.impl.Evento;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.time.MockLocalDate;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Evento_ESTest extends Evento_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      LocalDate localDate0 = MockLocalDate.now();
      Evento evento0 = new Evento("}E8", localDate0);
      String string0 = evento0.getNome();
      assertEquals("}E8", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Evento evento0 = new Evento("", (LocalDate) null);
      String string0 = evento0.getNome();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      LocalDate localDate0 = MockLocalDate.now();
      Evento evento0 = new Evento("}E8", localDate0);
      LocalDate localDate1 = evento0.getDataEvento();
      assertSame(localDate1, localDate0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Evento evento0 = new Evento();
      String string0 = evento0.getNome();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Evento evento0 = new Evento("", (LocalDate) null);
      LocalDate localDate0 = evento0.getDataEvento();
      assertNull(localDate0);
  }
}
