/*
 * This file was automatically generated by EvoSuite
 * Sat May 25 21:13:29 GMT 2019
 */

package com.wrapper.spotify.model_objects.special;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.wrapper.spotify.model_objects.special.SearchResult;
import com.wrapper.spotify.model_objects.specification.AlbumSimplified;
import com.wrapper.spotify.model_objects.specification.Artist;
import com.wrapper.spotify.model_objects.specification.Paging;
import com.wrapper.spotify.model_objects.specification.PlaylistSimplified;
import com.wrapper.spotify.model_objects.specification.Track;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SearchResult_ESTest extends SearchResult_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SearchResult.Builder searchResult_Builder0 = new SearchResult.Builder();
      SearchResult.Builder searchResult_Builder1 = searchResult_Builder0.setTracks((Paging<Track>) null);
      assertSame(searchResult_Builder0, searchResult_Builder1);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SearchResult.Builder searchResult_Builder0 = new SearchResult.Builder();
      SearchResult.Builder searchResult_Builder1 = searchResult_Builder0.setPlaylists((Paging<PlaylistSimplified>) null);
      assertSame(searchResult_Builder1, searchResult_Builder0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SearchResult.JsonUtil searchResult_JsonUtil0 = new SearchResult.JsonUtil();
      JsonObject jsonObject0 = mock(JsonObject.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(jsonObject0).isJsonNull();
      doReturn(false, false, false, false).when(jsonObject0).has(anyString());
      SearchResult searchResult0 = searchResult_JsonUtil0.createModelObject(jsonObject0);
      SearchResult.Builder searchResult_Builder0 = searchResult0.builder();
      SearchResult.Builder searchResult_Builder1 = searchResult_Builder0.setArtists((Paging<Artist>) null);
      assertSame(searchResult_Builder0, searchResult_Builder1);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SearchResult.JsonUtil searchResult_JsonUtil0 = new SearchResult.JsonUtil();
      JsonElement jsonElement0 = mock(JsonElement.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(jsonElement0).isJsonNull();
      JsonObject jsonObject0 = mock(JsonObject.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(jsonObject0).isJsonNull();
      doReturn(jsonElement0).when(jsonObject0).get(anyString());
      doReturn((JsonObject) null).when(jsonObject0).getAsJsonObject(anyString());
      doReturn(false, false, true).when(jsonObject0).has(anyString());
      // Undeclared exception!
      try { 
        searchResult_JsonUtil0.createModelObject(jsonObject0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.wrapper.spotify.model_objects.AbstractModelObject$JsonUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SearchResult.JsonUtil searchResult_JsonUtil0 = new SearchResult.JsonUtil();
      JsonElement jsonElement0 = mock(JsonElement.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(jsonElement0).isJsonNull();
      JsonObject jsonObject0 = mock(JsonObject.class, new ViolatedAssumptionAnswer());
      doReturn(false, false, false, false, false).when(jsonObject0).has(anyString());
      JsonObject jsonObject1 = mock(JsonObject.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(jsonObject1).isJsonNull();
      doReturn(jsonElement0).when(jsonObject1).get(anyString());
      doReturn(jsonObject0).when(jsonObject1).getAsJsonObject(anyString());
      doReturn(false, true, false, false).when(jsonObject1).has(anyString());
      SearchResult searchResult0 = searchResult_JsonUtil0.createModelObject(jsonObject1);
      assertNotNull(searchResult0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SearchResult.JsonUtil searchResult_JsonUtil0 = new SearchResult.JsonUtil();
      JsonElement jsonElement0 = mock(JsonElement.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(jsonElement0).isJsonNull();
      JsonObject jsonObject0 = mock(JsonObject.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(jsonObject0).isJsonNull();
      doReturn(jsonElement0).when(jsonObject0).get(anyString());
      doReturn((JsonObject) null).when(jsonObject0).getAsJsonObject(anyString());
      doReturn(true).when(jsonObject0).has(anyString());
      // Undeclared exception!
      try { 
        searchResult_JsonUtil0.createModelObject(jsonObject0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.wrapper.spotify.model_objects.AbstractModelObject$JsonUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SearchResult.JsonUtil searchResult_JsonUtil0 = new SearchResult.JsonUtil();
      JsonObject jsonObject0 = mock(JsonObject.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(jsonObject0).isJsonNull();
      SearchResult searchResult0 = searchResult_JsonUtil0.createModelObject(jsonObject0);
      assertNull(searchResult0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SearchResult.JsonUtil searchResult_JsonUtil0 = new SearchResult.JsonUtil();
      SearchResult searchResult0 = searchResult_JsonUtil0.createModelObject((JsonObject) null);
      assertNull(searchResult0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SearchResult.JsonUtil searchResult_JsonUtil0 = new SearchResult.JsonUtil();
      JsonObject jsonObject0 = mock(JsonObject.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(jsonObject0).isJsonNull();
      doReturn(false, false, false, false).when(jsonObject0).has(anyString());
      SearchResult searchResult0 = searchResult_JsonUtil0.createModelObject(jsonObject0);
      Paging<PlaylistSimplified> paging0 = searchResult0.getPlaylists();
      assertNull(paging0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SearchResult.JsonUtil searchResult_JsonUtil0 = new SearchResult.JsonUtil();
      JsonObject jsonObject0 = mock(JsonObject.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(jsonObject0).isJsonNull();
      doReturn(false, false, false, false).when(jsonObject0).has(anyString());
      SearchResult searchResult0 = searchResult_JsonUtil0.createModelObject(jsonObject0);
      Paging<Track> paging0 = searchResult0.getTracks();
      assertNull(paging0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SearchResult.JsonUtil searchResult_JsonUtil0 = new SearchResult.JsonUtil();
      JsonObject jsonObject0 = mock(JsonObject.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(jsonObject0).isJsonNull();
      doReturn(false, false, false, false).when(jsonObject0).has(anyString());
      SearchResult searchResult0 = searchResult_JsonUtil0.createModelObject(jsonObject0);
      Paging<AlbumSimplified> paging0 = searchResult0.getAlbums();
      assertNull(paging0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SearchResult.JsonUtil searchResult_JsonUtil0 = new SearchResult.JsonUtil();
      JsonObject jsonObject0 = mock(JsonObject.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(jsonObject0).isJsonNull();
      doReturn(false, false, false, false).when(jsonObject0).has(anyString());
      SearchResult searchResult0 = searchResult_JsonUtil0.createModelObject(jsonObject0);
      SearchResult.Builder searchResult_Builder0 = searchResult0.builder();
      SearchResult searchResult1 = searchResult_Builder0.build();
      assertNotSame(searchResult0, searchResult1);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SearchResult.Builder searchResult_Builder0 = new SearchResult.Builder();
      SearchResult.Builder searchResult_Builder1 = searchResult_Builder0.setAlbums((Paging<AlbumSimplified>) null);
      assertSame(searchResult_Builder0, searchResult_Builder1);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SearchResult.JsonUtil searchResult_JsonUtil0 = new SearchResult.JsonUtil();
      JsonObject jsonObject0 = mock(JsonObject.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(jsonObject0).isJsonNull();
      doReturn(false, false, false, false).when(jsonObject0).has(anyString());
      SearchResult searchResult0 = searchResult_JsonUtil0.createModelObject(jsonObject0);
      Paging<Artist> paging0 = searchResult0.getArtists();
      assertNull(paging0);
  }
}
