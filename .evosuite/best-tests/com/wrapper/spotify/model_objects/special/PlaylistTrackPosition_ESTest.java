/*
 * This file was automatically generated by EvoSuite
 * Sat May 25 22:44:30 GMT 2019
 */

package com.wrapper.spotify.model_objects.special;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.gson.JsonObject;
import com.wrapper.spotify.model_objects.special.PlaylistTrackPosition;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class PlaylistTrackPosition_ESTest extends PlaylistTrackPosition_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      PlaylistTrackPosition.Builder playlistTrackPosition_Builder0 = new PlaylistTrackPosition.Builder();
      PlaylistTrackPosition.Builder playlistTrackPosition_Builder1 = playlistTrackPosition_Builder0.setUri("com.wrapper.spotify.model_objects.specification.Paging$Builder");
      PlaylistTrackPosition playlistTrackPosition0 = new PlaylistTrackPosition(playlistTrackPosition_Builder1);
      String string0 = playlistTrackPosition0.getUri();
      assertEquals("com.wrapper.spotify.model_objects.specification.Paging$Builder", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      PlaylistTrackPosition.Builder playlistTrackPosition_Builder0 = new PlaylistTrackPosition.Builder();
      PlaylistTrackPosition.Builder playlistTrackPosition_Builder1 = playlistTrackPosition_Builder0.setUri("");
      PlaylistTrackPosition playlistTrackPosition0 = new PlaylistTrackPosition(playlistTrackPosition_Builder1);
      String string0 = playlistTrackPosition0.getUri();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      PlaylistTrackPosition.Builder playlistTrackPosition_Builder0 = new PlaylistTrackPosition.Builder();
      int[] intArray0 = new int[3];
      PlaylistTrackPosition.Builder playlistTrackPosition_Builder1 = playlistTrackPosition_Builder0.setPositions(intArray0);
      PlaylistTrackPosition playlistTrackPosition0 = playlistTrackPosition_Builder1.build();
      int[] intArray1 = playlistTrackPosition0.getPositions();
      assertSame(intArray1, intArray0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      PlaylistTrackPosition.Builder playlistTrackPosition_Builder0 = new PlaylistTrackPosition.Builder();
      int[] intArray0 = new int[0];
      PlaylistTrackPosition.Builder playlistTrackPosition_Builder1 = playlistTrackPosition_Builder0.setPositions(intArray0);
      PlaylistTrackPosition playlistTrackPosition0 = playlistTrackPosition_Builder1.build();
      int[] intArray1 = playlistTrackPosition0.getPositions();
      assertSame(intArray0, intArray1);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      PlaylistTrackPosition playlistTrackPosition0 = null;
      try {
        playlistTrackPosition0 = new PlaylistTrackPosition((PlaylistTrackPosition.Builder) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.wrapper.spotify.model_objects.special.PlaylistTrackPosition$Builder", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      PlaylistTrackPosition.JsonUtil playlistTrackPosition_JsonUtil0 = new PlaylistTrackPosition.JsonUtil();
      JsonObject jsonObject0 = new JsonObject();
      jsonObject0.addProperty("uri", "uri");
      PlaylistTrackPosition playlistTrackPosition0 = playlistTrackPosition_JsonUtil0.createModelObject(jsonObject0);
      assertEquals("uri", playlistTrackPosition0.getUri());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      PlaylistTrackPosition.JsonUtil playlistTrackPosition_JsonUtil0 = new PlaylistTrackPosition.JsonUtil();
      PlaylistTrackPosition playlistTrackPosition0 = playlistTrackPosition_JsonUtil0.createModelObject((JsonObject) null);
      assertNull(playlistTrackPosition0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      PlaylistTrackPosition.JsonUtil playlistTrackPosition_JsonUtil0 = new PlaylistTrackPosition.JsonUtil();
      JsonObject jsonObject0 = new JsonObject();
      PlaylistTrackPosition playlistTrackPosition0 = playlistTrackPosition_JsonUtil0.createModelObject(jsonObject0);
      String string0 = playlistTrackPosition0.getUri();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      PlaylistTrackPosition.Builder playlistTrackPosition_Builder0 = new PlaylistTrackPosition.Builder();
      PlaylistTrackPosition playlistTrackPosition0 = new PlaylistTrackPosition(playlistTrackPosition_Builder0);
      int[] intArray0 = playlistTrackPosition0.getPositions();
      assertNull(intArray0);
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      PlaylistTrackPosition.JsonUtil playlistTrackPosition_JsonUtil0 = new PlaylistTrackPosition.JsonUtil();
      JsonObject jsonObject0 = new JsonObject();
      PlaylistTrackPosition playlistTrackPosition0 = playlistTrackPosition_JsonUtil0.createModelObject(jsonObject0);
      PlaylistTrackPosition.Builder playlistTrackPosition_Builder0 = playlistTrackPosition0.builder();
      assertNotNull(playlistTrackPosition_Builder0);
  }
}
