/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Sat May 25 21:54:44 GMT 2019
 */

package com.wrapper.spotify.model_objects.specification;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class AudioFeatures_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "com.wrapper.spotify.model_objects.specification.AudioFeatures"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(AudioFeatures_ESTest_scaffolding.class.getClassLoader() ,
      "com.google.gson.JsonObject",
      "com.google.gson.TypeAdapter$1",
      "com.google.gson.internal.bind.TypeAdapters$23",
      "com.google.gson.internal.bind.TypeAdapters$24",
      "com.wrapper.spotify.model_objects.IModelObject$IJsonUtil",
      "com.google.gson.internal.bind.TypeAdapters$25",
      "com.google.gson.internal.bind.TypeAdapters$26",
      "com.google.gson.internal.bind.TypeAdapters$20",
      "com.google.gson.TypeAdapter",
      "com.google.gson.internal.bind.TypeAdapters$21",
      "com.google.gson.internal.bind.JsonTreeWriter",
      "com.google.gson.internal.bind.TypeAdapters$22",
      "com.google.gson.internal.bind.TypeAdapters$26$1",
      "com.wrapper.spotify.model_objects.AbstractModelObject$Builder",
      "com.google.gson.internal.bind.TypeAdapters$27",
      "com.google.gson.internal.bind.TypeAdapters$28",
      "com.google.gson.internal.bind.TypeAdapters$29",
      "com.google.gson.internal.LinkedTreeMap$1",
      "com.wrapper.spotify.model_objects.specification.Paging$Builder",
      "com.wrapper.spotify.model_objects.IModelObject$Builder",
      "com.google.gson.internal.LinkedTreeMap$EntrySet",
      "com.wrapper.spotify.enums.ModelObjectType",
      "com.google.gson.internal.bind.TypeAdapters$34",
      "com.google.gson.internal.bind.TypeAdapters$35",
      "com.google.gson.internal.bind.TypeAdapters$36",
      "com.google.gson.internal.bind.TypeAdapters$30",
      "com.google.gson.internal.bind.TypeAdapters$32",
      "com.google.gson.internal.bind.TypeAdapters$33",
      "com.google.gson.JsonArray",
      "com.google.gson.internal.bind.TypeAdapters$2",
      "com.google.gson.internal.bind.TypeAdapters$1",
      "com.google.gson.internal.bind.JsonTreeReader",
      "com.google.gson.internal.bind.TypeAdapters$35$1",
      "com.wrapper.spotify.model_objects.specification.Paging",
      "com.google.gson.JsonIOException",
      "com.google.gson.internal.bind.TypeAdapters$8",
      "com.google.gson.internal.bind.TypeAdapters$7",
      "com.google.gson.internal.bind.TypeAdapters",
      "com.wrapper.spotify.model_objects.IModelObject",
      "com.google.gson.internal.LinkedTreeMap$EntrySet$1",
      "com.google.gson.internal.bind.TypeAdapters$9",
      "com.wrapper.spotify.model_objects.specification.AudioFeatures$JsonUtil",
      "com.google.gson.internal.LinkedTreeMap",
      "com.google.gson.internal.bind.TypeAdapters$4",
      "com.google.gson.TypeAdapterFactory",
      "com.google.gson.internal.bind.TypeAdapters$3",
      "com.google.gson.internal.bind.TypeAdapters$6",
      "com.google.gson.internal.bind.TypeAdapters$EnumTypeAdapter",
      "com.wrapper.spotify.model_objects.specification.PagingCursorbased",
      "com.google.gson.internal.LazilyParsedNumber",
      "com.google.gson.internal.bind.TypeAdapters$5",
      "com.google.gson.JsonParseException",
      "com.wrapper.spotify.enums.Modality",
      "com.google.gson.stream.JsonReader$1",
      "com.google.gson.internal.LinkedTreeMap$LinkedTreeMapIterator",
      "com.google.gson.JsonParser",
      "com.google.gson.stream.JsonReader",
      "com.google.gson.JsonElement",
      "com.wrapper.spotify.model_objects.AbstractModelObject",
      "com.wrapper.spotify.model_objects.AbstractModelObject$JsonUtil",
      "com.google.gson.internal.LinkedTreeMap$Node",
      "com.google.gson.JsonPrimitive",
      "com.google.gson.internal.Streams$AppendableWriter",
      "com.google.gson.stream.JsonWriter",
      "com.google.gson.internal.Streams",
      "com.google.gson.internal.$Gson$Preconditions",
      "com.google.gson.JsonSyntaxException",
      "com.wrapper.spotify.model_objects.specification.AudioFeatures",
      "com.wrapper.spotify.model_objects.specification.AudioFeatures$Builder",
      "com.google.gson.internal.bind.TypeAdapters$12",
      "com.google.gson.internal.bind.TypeAdapters$13",
      "com.google.gson.internal.bind.TypeAdapters$14",
      "com.google.gson.internal.bind.TypeAdapters$15",
      "com.google.gson.internal.bind.TypeAdapters$10",
      "com.google.gson.internal.bind.TypeAdapters$11",
      "com.google.gson.stream.MalformedJsonException",
      "com.google.gson.stream.JsonToken",
      "com.google.gson.internal.bind.TypeAdapters$16",
      "com.google.gson.internal.JsonReaderInternalAccess",
      "com.google.gson.internal.bind.TypeAdapters$17",
      "com.google.gson.internal.bind.TypeAdapters$18",
      "com.google.gson.JsonNull",
      "com.google.gson.internal.bind.TypeAdapters$19"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(AudioFeatures_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "com.wrapper.spotify.model_objects.AbstractModelObject",
      "com.wrapper.spotify.model_objects.specification.AudioFeatures",
      "com.wrapper.spotify.model_objects.AbstractModelObject$Builder",
      "com.wrapper.spotify.model_objects.specification.AudioFeatures$Builder",
      "com.wrapper.spotify.model_objects.AbstractModelObject$JsonUtil",
      "com.wrapper.spotify.model_objects.specification.AudioFeatures$JsonUtil",
      "com.google.gson.JsonElement",
      "com.google.gson.JsonObject",
      "com.google.gson.internal.LinkedTreeMap$1",
      "com.google.gson.internal.LinkedTreeMap",
      "com.google.gson.internal.LinkedTreeMap$Node",
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
      "com.google.gson.stream.JsonWriter",
      "com.google.gson.internal.LinkedTreeMap$KeySet",
      "com.google.gson.internal.LinkedTreeMap$EntrySet",
      "com.google.gson.internal.LinkedTreeMap$LinkedTreeMapIterator",
      "com.google.gson.internal.LinkedTreeMap$EntrySet$1",
      "com.google.gson.JsonArray",
      "com.google.gson.JsonNull",
      "com.google.gson.stream.MalformedJsonException",
      "com.google.gson.JsonParseException",
      "com.google.gson.JsonSyntaxException",
      "com.wrapper.spotify.model_objects.specification.PagingCursorbased$Builder",
      "com.wrapper.spotify.model_objects.specification.PagingCursorbased",
      "com.wrapper.spotify.model_objects.specification.Paging$Builder",
      "com.wrapper.spotify.model_objects.specification.Paging"
    );
  }
}
