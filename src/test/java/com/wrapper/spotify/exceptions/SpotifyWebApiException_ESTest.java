/*
 * This file was automatically generated by EvoSuite
 * Sat May 25 21:21:49 GMT 2019
 */

package com.wrapper.spotify.exceptions;

import org.junit.Test;
import static org.junit.Assert.*;
import com.wrapper.spotify.exceptions.SpotifyWebApiException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.lang.MockThrowable;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SpotifyWebApiException_ESTest extends SpotifyWebApiException_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SpotifyWebApiException spotifyWebApiException0 = new SpotifyWebApiException("cRD%8Xn&Xy7\"Bs");
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      SpotifyWebApiException spotifyWebApiException0 = new SpotifyWebApiException();
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      MockThrowable mockThrowable0 = new MockThrowable("");
      SpotifyWebApiException spotifyWebApiException0 = new SpotifyWebApiException("", mockThrowable0);
  }
}
