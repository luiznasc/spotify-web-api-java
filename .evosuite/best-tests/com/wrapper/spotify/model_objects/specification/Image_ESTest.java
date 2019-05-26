/*
 * This file was automatically generated by EvoSuite
 * Sat May 25 21:09:49 GMT 2019
 */

package com.wrapper.spotify.model_objects.specification;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.gson.JsonObject;
import com.wrapper.spotify.model_objects.specification.Image;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Image_ESTest extends Image_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Image.JsonUtil image_JsonUtil0 = new Image.JsonUtil();
      JsonObject jsonObject0 = new JsonObject();
      Image image0 = image_JsonUtil0.createModelObject(jsonObject0);
      Image.Builder image_Builder0 = image0.builder();
      Integer integer0 = new Integer(0);
      Image.Builder image_Builder1 = image_Builder0.setWidth(integer0);
      Image image1 = image_Builder1.build();
      Integer integer1 = image1.getWidth();
      assertEquals(0, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Image.Builder image_Builder0 = new Image.Builder();
      Integer integer0 = new Integer(1805);
      image_Builder0.setWidth(integer0);
      Image image0 = image_Builder0.build();
      Integer integer1 = image0.getWidth();
      assertEquals(1805, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Image.Builder image_Builder0 = new Image.Builder();
      Integer integer0 = new Integer((-94));
      Image.Builder image_Builder1 = image_Builder0.setWidth(integer0);
      Image image0 = image_Builder1.build();
      Integer integer1 = image0.getWidth();
      assertEquals((-94), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Image.Builder image_Builder0 = new Image.Builder();
      image_Builder0.setUrl("");
      Image image0 = image_Builder0.build();
      String string0 = image0.getUrl();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Image.Builder image_Builder0 = new Image.Builder();
      Integer integer0 = new Integer(275);
      image_Builder0.setHeight(integer0);
      Image image0 = image_Builder0.build();
      Integer integer1 = image0.getHeight();
      assertEquals(275, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Image.Builder image_Builder0 = new Image.Builder();
      Integer integer0 = new Integer(0);
      image_Builder0.setHeight(integer0);
      Image image0 = image_Builder0.build();
      Integer integer1 = image0.getHeight();
      assertEquals(0, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Image.Builder image_Builder0 = new Image.Builder();
      Integer integer0 = new Integer((-1929));
      Image.Builder image_Builder1 = image_Builder0.setHeight(integer0);
      Image image0 = image_Builder1.build();
      Integer integer1 = image0.getHeight();
      assertEquals((-1929), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Image.Builder image_Builder0 = new Image.Builder();
      Integer integer0 = new Integer((-94));
      Image.Builder image_Builder1 = image_Builder0.setHeight(integer0);
      Image image0 = image_Builder1.build();
      Integer integer1 = image0.getHeight();
      assertEquals((-94), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Image.JsonUtil image_JsonUtil0 = new Image.JsonUtil();
      Image image0 = image_JsonUtil0.createModelObject((JsonObject) null);
      assertNull(image0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Image.Builder image_Builder0 = new Image.Builder();
      Image image0 = image_Builder0.build();
      String string0 = image0.getUrl();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Image.Builder image_Builder0 = new Image.Builder();
      Image image0 = image_Builder0.build();
      Integer integer0 = image0.getHeight();
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Image.Builder image_Builder0 = new Image.Builder();
      Image image0 = image_Builder0.build();
      Integer integer0 = image0.getWidth();
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Image.JsonUtil image_JsonUtil0 = new Image.JsonUtil();
      JsonObject jsonObject0 = new JsonObject();
      Image image0 = image_JsonUtil0.createModelObject(jsonObject0);
      Image.Builder image_Builder0 = image0.builder();
      Image.Builder image_Builder1 = image_Builder0.setUrl("jO3W");
      Image image1 = image_Builder1.build();
      String string0 = image1.getUrl();
      assertEquals("jO3W", string0);
  }
}
