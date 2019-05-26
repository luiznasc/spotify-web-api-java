/*
 * This file was automatically generated by EvoSuite
 * Sat May 25 21:08:02 GMT 2019
 */

package com.wrapper.spotify.model_objects;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.wrapper.spotify.model_objects.special.PlaylistTrackPosition;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AbstractModelObject_ESTest extends AbstractModelObject_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      PlaylistTrackPosition playlistTrackPosition0 = null;
      try {
        playlistTrackPosition0 = new PlaylistTrackPosition((PlaylistTrackPosition.Builder) null);
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      PlaylistTrackPosition.Builder playlistTrackPosition_Builder0 = new PlaylistTrackPosition.Builder();
      PlaylistTrackPosition playlistTrackPosition0 = playlistTrackPosition_Builder0.build();
      assertNull(playlistTrackPosition0.getUri());
  }
}
