/*
 * This file was automatically generated by EvoSuite
 * Sat May 25 21:58:02 GMT 2019
 */

package com.wrapper.spotify.exceptions.detailed;

import org.junit.Test;
import static org.junit.Assert.*;
import com.wrapper.spotify.exceptions.detailed.UnauthorizedException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.lang.MockThrowable;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class UnauthorizedException_ESTest extends UnauthorizedException_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      UnauthorizedException unauthorizedException0 = new UnauthorizedException("");
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      UnauthorizedException unauthorizedException0 = new UnauthorizedException();
      MockThrowable mockThrowable0 = new MockThrowable(unauthorizedException0);
      UnauthorizedException unauthorizedException1 = new UnauthorizedException("", mockThrowable0);
      assertFalse(unauthorizedException1.equals((Object)unauthorizedException0));
  }
}
