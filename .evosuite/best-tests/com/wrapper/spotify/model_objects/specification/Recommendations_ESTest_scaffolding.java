/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Sat May 25 22:57:03 GMT 2019
 */

package com.wrapper.spotify.model_objects.specification;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class Recommendations_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "com.wrapper.spotify.model_objects.specification.Recommendations"; 
    org.evosuite.runtime.GuiSupport.initialize(); 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfThreads = 100; 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000; 
    org.evosuite.runtime.RuntimeSettings.mockSystemIn = true; 
    org.evosuite.runtime.RuntimeSettings.sandboxMode = org.evosuite.runtime.sandbox.Sandbox.SandboxMode.RECOMMENDED; 
    org.evosuite.runtime.sandbox.Sandbox.initializeSecurityManagerForSUT(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.init();
    setSystemProperties();
    initializeClasses();
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    try { initMocksToAvoidTimeoutsInTheTests(); } catch(ClassNotFoundException e) {} 
  } 

  @AfterClass 
  public static void clearEvoSuiteFramework(){ 
    Sandbox.resetDefaultSecurityManager(); 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
  } 

  @Before 
  public void initTestCase(){ 
    threadStopper.storeCurrentThreads();
    threadStopper.startRecordingTime();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().initHandler(); 
    org.evosuite.runtime.sandbox.Sandbox.goingToExecuteSUTCode(); 
    setSystemProperties(); 
    org.evosuite.runtime.GuiSupport.setHeadless(); 
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    org.evosuite.runtime.agent.InstrumentingAgent.activate(); 
  } 

  @After 
  public void doneWithTestCase(){ 
    threadStopper.killAndJoinClientThreads();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().safeExecuteAddedHooks(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.reset(); 
    resetClasses(); 
    org.evosuite.runtime.sandbox.Sandbox.doneWithExecutingSUTCode(); 
    org.evosuite.runtime.agent.InstrumentingAgent.deactivate(); 
    org.evosuite.runtime.GuiSupport.restoreHeadlessMode(); 
  } 

  public static void setSystemProperties() {
 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
    java.lang.System.setProperty("file.encoding", "UTF-8"); 
    java.lang.System.setProperty("java.awt.headless", "true"); 
    java.lang.System.setProperty("java.io.tmpdir", "/tmp"); 
    java.lang.System.setProperty("user.country", "US"); 
    java.lang.System.setProperty("user.dir", "/home/luiz/spoo/spotify-web-api-java"); 
    java.lang.System.setProperty("user.home", "/home/luiz"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.name", "luiz"); 
    java.lang.System.setProperty("user.timezone", "America/Recife"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(Recommendations_ESTest_scaffolding.class.getClassLoader() ,
      "com.google.gson.JsonObject",
      "com.wrapper.spotify.model_objects.specification.Recommendations$JsonUtil",
      "com.wrapper.spotify.model_objects.IModelObject$IJsonUtil",
      "com.wrapper.spotify.model_objects.specification.RecommendationsSeed",
      "com.wrapper.spotify.model_objects.specification.Recommendations",
      "com.google.gson.JsonElement",
      "com.wrapper.spotify.model_objects.specification.Recommendations$Builder",
      "com.wrapper.spotify.model_objects.AbstractModelObject",
      "com.wrapper.spotify.model_objects.AbstractModelObject$Builder",
      "com.google.gson.JsonArray",
      "com.wrapper.spotify.model_objects.specification.RecommendationsSeed$JsonUtil",
      "com.wrapper.spotify.model_objects.specification.TrackSimplified",
      "com.wrapper.spotify.model_objects.specification.TrackSimplified$JsonUtil",
      "com.wrapper.spotify.model_objects.specification.Paging",
      "com.wrapper.spotify.model_objects.AbstractModelObject$JsonUtil",
      "com.google.gson.JsonNull",
      "com.wrapper.spotify.model_objects.IModelObject",
      "com.google.gson.JsonPrimitive",
      "com.wrapper.spotify.model_objects.IModelObject$Builder",
      "com.wrapper.spotify.model_objects.specification.PagingCursorbased"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("com.google.gson.JsonElement", false, Recommendations_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("com.google.gson.JsonObject", false, Recommendations_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(Recommendations_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "com.wrapper.spotify.model_objects.AbstractModelObject",
      "com.wrapper.spotify.model_objects.specification.Recommendations",
      "com.wrapper.spotify.model_objects.AbstractModelObject$Builder",
      "com.wrapper.spotify.model_objects.specification.Recommendations$Builder",
      "com.wrapper.spotify.model_objects.AbstractModelObject$JsonUtil",
      "com.wrapper.spotify.model_objects.specification.RecommendationsSeed$JsonUtil",
      "com.wrapper.spotify.model_objects.specification.RecommendationsSeed$Builder",
      "com.wrapper.spotify.model_objects.specification.RecommendationsSeed",
      "com.google.gson.JsonElement",
      "com.google.gson.JsonObject",
      "com.wrapper.spotify.model_objects.specification.Recommendations$JsonUtil",
      "com.google.gson.JsonParser",
      "com.google.gson.internal.JsonReaderInternalAccess",
      "com.google.gson.stream.JsonReader$1",
      "com.google.gson.stream.JsonReader",
      "com.google.gson.internal.Streams",
      "com.google.gson.stream.JsonToken",
      "com.google.gson.TypeAdapter",
      "com.google.gson.internal.bind.TypeAdapters$1",
      "com.google.gson.TypeAdapter$1",
      "com.google.gson.internal.bind.TypeAdapters$32",
      "com.google.gson.internal.bind.TypeAdapters$2",
      "com.google.gson.internal.bind.TypeAdapters$3",
      "com.google.gson.internal.bind.TypeAdapters$4",
      "com.google.gson.internal.bind.TypeAdapters$33",
      "com.google.gson.internal.bind.TypeAdapters$5",
      "com.google.gson.internal.bind.TypeAdapters$6",
      "com.google.gson.internal.bind.TypeAdapters$7",
      "com.google.gson.internal.bind.TypeAdapters$8",
      "com.google.gson.internal.bind.TypeAdapters$9",
      "com.google.gson.internal.bind.TypeAdapters$10",
      "com.google.gson.internal.bind.TypeAdapters$11",
      "com.google.gson.internal.bind.TypeAdapters$12",
      "com.google.gson.internal.bind.TypeAdapters$13",
      "com.google.gson.internal.bind.TypeAdapters$14",
      "com.google.gson.internal.bind.TypeAdapters$15",
      "com.google.gson.internal.bind.TypeAdapters$16",
      "com.google.gson.internal.bind.TypeAdapters$17",
      "com.google.gson.internal.bind.TypeAdapters$18",
      "com.google.gson.internal.bind.TypeAdapters$19",
      "com.google.gson.internal.bind.TypeAdapters$20",
      "com.google.gson.internal.bind.TypeAdapters$21",
      "com.google.gson.internal.bind.TypeAdapters$22",
      "com.google.gson.internal.bind.TypeAdapters$23",
      "com.google.gson.internal.bind.TypeAdapters$35",
      "com.google.gson.internal.bind.TypeAdapters$24",
      "com.google.gson.internal.bind.TypeAdapters$25",
      "com.google.gson.internal.bind.TypeAdapters$26",
      "com.google.gson.internal.bind.TypeAdapters$27",
      "com.google.gson.internal.bind.TypeAdapters$34",
      "com.google.gson.internal.bind.TypeAdapters$28",
      "com.google.gson.internal.bind.TypeAdapters$29",
      "com.google.gson.internal.bind.TypeAdapters$30",
      "com.google.gson.internal.bind.TypeAdapters",
      "com.google.gson.internal.bind.TypeAdapters$36",
      "com.google.gson.JsonPrimitive",
      "com.google.gson.internal.$Gson$Preconditions",
      "com.google.gson.stream.MalformedJsonException",
      "com.google.gson.JsonParseException",
      "com.google.gson.JsonSyntaxException",
      "com.wrapper.spotify.model_objects.specification.TrackSimplified",
      "com.google.gson.stream.JsonWriter",
      "com.google.gson.JsonArray",
      "com.wrapper.spotify.model_objects.specification.PagingCursorbased$Builder",
      "com.wrapper.spotify.model_objects.specification.PagingCursorbased",
      "com.google.gson.JsonNull",
      "com.wrapper.spotify.model_objects.specification.Paging$Builder",
      "com.wrapper.spotify.model_objects.specification.Paging",
      "com.wrapper.spotify.model_objects.specification.TrackSimplified$JsonUtil"
    );
  }
}
