/*
 * This file was automatically generated by EvoSuite
 * Sat May 25 21:34:06 GMT 2019
 */

package com.wrapper.spotify.exceptions.detailed;

import org.junit.Test;
import static org.junit.Assert.*;
import com.wrapper.spotify.exceptions.detailed.ForbiddenException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ForbiddenException_ESTest extends ForbiddenException_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ForbiddenException forbiddenException0 = new ForbiddenException("CwYb57/fc3-hgk-L");
      ForbiddenException forbiddenException1 = new ForbiddenException("CwYb57/fc3-hgk-L", forbiddenException0);
      assertFalse(forbiddenException1.equals((Object)forbiddenException0));
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ForbiddenException forbiddenException0 = new ForbiddenException();
  }
}
