/*
 * This file was automatically generated by EvoSuite
 * Sat May 25 21:10:08 GMT 2019
 */

package com.wrapper.spotify.exceptions.detailed;

import org.junit.Test;
import static org.junit.Assert.*;
import com.wrapper.spotify.exceptions.detailed.NotFoundException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class NotFoundException_ESTest extends NotFoundException_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      NotFoundException notFoundException0 = new NotFoundException("c");
      NotFoundException notFoundException1 = new NotFoundException("c", notFoundException0);
      assertFalse(notFoundException1.equals((Object)notFoundException0));
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      NotFoundException notFoundException0 = new NotFoundException();
  }
}
