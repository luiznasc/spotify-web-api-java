/*
 * This file was automatically generated by EvoSuite
 * Sat May 25 21:22:33 GMT 2019
 */

package com.wrapper.spotify.model_objects.miscellaneous;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.gson.JsonObject;
import com.wrapper.spotify.model_objects.miscellaneous.PlaylistTracksInformation;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class PlaylistTracksInformation_ESTest extends PlaylistTracksInformation_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      PlaylistTracksInformation.JsonUtil playlistTracksInformation_JsonUtil0 = new PlaylistTracksInformation.JsonUtil();
      JsonObject jsonObject0 = new JsonObject();
      PlaylistTracksInformation playlistTracksInformation0 = playlistTracksInformation_JsonUtil0.createModelObject(jsonObject0);
      PlaylistTracksInformation.Builder playlistTracksInformation_Builder0 = playlistTracksInformation0.builder();
      Integer integer0 = new Integer((-4164));
      playlistTracksInformation_Builder0.setTotal(integer0);
      PlaylistTracksInformation playlistTracksInformation1 = playlistTracksInformation_Builder0.build();
      Integer integer1 = playlistTracksInformation1.getTotal();
      assertEquals((-4164), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      PlaylistTracksInformation.JsonUtil playlistTracksInformation_JsonUtil0 = new PlaylistTracksInformation.JsonUtil();
      JsonObject jsonObject0 = new JsonObject();
      PlaylistTracksInformation playlistTracksInformation0 = playlistTracksInformation_JsonUtil0.createModelObject(jsonObject0);
      PlaylistTracksInformation.Builder playlistTracksInformation_Builder0 = playlistTracksInformation0.builder();
      Integer integer0 = new Integer(0);
      PlaylistTracksInformation.Builder playlistTracksInformation_Builder1 = playlistTracksInformation_Builder0.setTotal(integer0);
      PlaylistTracksInformation playlistTracksInformation1 = playlistTracksInformation_Builder1.build();
      Integer integer1 = playlistTracksInformation1.getTotal();
      assertEquals(0, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      PlaylistTracksInformation.Builder playlistTracksInformation_Builder0 = new PlaylistTracksInformation.Builder();
      Integer integer0 = new Integer(4);
      playlistTracksInformation_Builder0.setTotal(integer0);
      PlaylistTracksInformation playlistTracksInformation0 = playlistTracksInformation_Builder0.build();
      Integer integer1 = playlistTracksInformation0.getTotal();
      assertEquals(4, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      PlaylistTracksInformation.Builder playlistTracksInformation_Builder0 = new PlaylistTracksInformation.Builder();
      playlistTracksInformation_Builder0.setHref("");
      PlaylistTracksInformation playlistTracksInformation0 = playlistTracksInformation_Builder0.build();
      String string0 = playlistTracksInformation0.getHref();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      PlaylistTracksInformation.JsonUtil playlistTracksInformation_JsonUtil0 = new PlaylistTracksInformation.JsonUtil();
      PlaylistTracksInformation playlistTracksInformation0 = playlistTracksInformation_JsonUtil0.createModelObject((JsonObject) null);
      assertNull(playlistTracksInformation0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      PlaylistTracksInformation.JsonUtil playlistTracksInformation_JsonUtil0 = new PlaylistTracksInformation.JsonUtil();
      JsonObject jsonObject0 = new JsonObject();
      PlaylistTracksInformation playlistTracksInformation0 = playlistTracksInformation_JsonUtil0.createModelObject(jsonObject0);
      String string0 = playlistTracksInformation0.getHref();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      PlaylistTracksInformation.JsonUtil playlistTracksInformation_JsonUtil0 = new PlaylistTracksInformation.JsonUtil();
      JsonObject jsonObject0 = new JsonObject();
      PlaylistTracksInformation playlistTracksInformation0 = playlistTracksInformation_JsonUtil0.createModelObject(jsonObject0);
      PlaylistTracksInformation.Builder playlistTracksInformation_Builder0 = playlistTracksInformation0.builder();
      playlistTracksInformation_Builder0.setHref("a4");
      PlaylistTracksInformation playlistTracksInformation1 = playlistTracksInformation_Builder0.build();
      String string0 = playlistTracksInformation1.getHref();
      assertEquals("a4", string0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      PlaylistTracksInformation.JsonUtil playlistTracksInformation_JsonUtil0 = new PlaylistTracksInformation.JsonUtil();
      JsonObject jsonObject0 = new JsonObject();
      PlaylistTracksInformation playlistTracksInformation0 = playlistTracksInformation_JsonUtil0.createModelObject(jsonObject0);
      Integer integer0 = playlistTracksInformation0.getTotal();
      assertNull(integer0);
  }
}
