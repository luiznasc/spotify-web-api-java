/*
 * This file was automatically generated by EvoSuite
 * Sat May 25 21:14:49 GMT 2019
 */

package com.wrapper.spotify.exceptions.detailed;

import org.junit.Test;
import static org.junit.Assert.*;
import com.wrapper.spotify.exceptions.detailed.InternalServerErrorException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.lang.MockThrowable;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class InternalServerErrorException_ESTest extends InternalServerErrorException_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      InternalServerErrorException internalServerErrorException0 = new InternalServerErrorException("4j`");
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      InternalServerErrorException internalServerErrorException0 = new InternalServerErrorException();
      MockThrowable mockThrowable0 = new MockThrowable("4j`", internalServerErrorException0);
      InternalServerErrorException internalServerErrorException1 = new InternalServerErrorException("com.wrapper.spotify.exceptions.detailed.InternalServerErrorException", mockThrowable0);
      assertFalse(internalServerErrorException1.equals((Object)internalServerErrorException0));
  }
}
