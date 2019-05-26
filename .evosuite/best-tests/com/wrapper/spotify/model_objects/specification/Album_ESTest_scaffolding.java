/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Sat May 25 22:14:18 GMT 2019
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
public class Album_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "com.wrapper.spotify.model_objects.specification.Album"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(Album_ESTest_scaffolding.class.getClassLoader() ,
      "com.google.gson.internal.bind.TimeTypeAdapter$1",
      "com.google.gson.reflect.TypeToken",
      "com.wrapper.spotify.model_objects.specification.Image",
      "com.wrapper.spotify.model_objects.specification.ArtistSimplified$JsonUtil",
      "com.google.gson.internal.bind.TypeAdapters$23",
      "com.google.gson.internal.bind.TypeAdapters$24",
      "com.google.gson.internal.LinkedTreeMap$KeySet",
      "com.wrapper.spotify.model_objects.specification.ExternalId",
      "com.google.gson.internal.bind.TypeAdapters$25",
      "com.google.gson.internal.bind.TypeAdapters$26",
      "com.google.gson.internal.bind.TypeAdapters$20",
      "com.google.gson.TypeAdapter",
      "com.google.gson.internal.bind.JsonTreeWriter",
      "com.google.gson.internal.bind.TypeAdapters$21",
      "com.google.gson.internal.bind.TypeAdapters$22",
      "com.wrapper.spotify.model_objects.AbstractModelObject$Builder",
      "com.google.gson.internal.bind.TypeAdapters$27",
      "com.google.gson.FieldNamingStrategy",
      "com.google.gson.internal.bind.TypeAdapters$28",
      "com.google.gson.internal.bind.TypeAdapters$29",
      "com.google.gson.internal.bind.SqlDateTypeAdapter",
      "com.google.gson.internal.bind.TypeAdapterRuntimeTypeWrapper",
      "com.wrapper.spotify.model_objects.specification.ArtistSimplified",
      "com.wrapper.spotify.model_objects.IModelObject$Builder",
      "com.google.gson.internal.bind.TimeTypeAdapter",
      "com.wrapper.spotify.model_objects.specification.ExternalId$Builder",
      "com.wrapper.spotify.enums.ReleaseDatePrecision",
      "com.google.gson.internal.bind.TypeAdapters$34",
      "com.google.gson.internal.bind.TypeAdapters$35",
      "com.google.gson.internal.JavaVersion",
      "com.google.gson.internal.bind.TypeAdapters$30",
      "com.google.gson.internal.bind.TypeAdapters$32",
      "com.google.gson.internal.bind.TypeAdapters$33",
      "com.google.gson.JsonArray",
      "com.google.gson.LongSerializationPolicy",
      "com.google.gson.internal.bind.TypeAdapters$35$1",
      "com.google.gson.internal.Excluder",
      "com.wrapper.spotify.model_objects.IModelObject",
      "com.google.gson.internal.LinkedTreeMap$EntrySet$1",
      "com.google.gson.TypeAdapterFactory",
      "com.google.gson.internal.bind.TypeAdapters$EnumTypeAdapter",
      "com.google.gson.internal.bind.MapTypeAdapterFactory$Adapter",
      "com.google.gson.stream.JsonReader$1",
      "com.google.gson.internal.$Gson$Types",
      "com.wrapper.spotify.model_objects.specification.Paging$JsonUtil",
      "com.google.gson.JsonParser",
      "com.google.gson.stream.JsonReader",
      "com.wrapper.spotify.model_objects.specification.ArtistSimplified$1",
      "com.wrapper.spotify.enums.AlbumType",
      "com.google.gson.internal.bind.MapTypeAdapterFactory",
      "com.google.gson.internal.reflect.UnsafeReflectionAccessor",
      "com.google.gson.Gson$FutureTypeAdapter",
      "com.wrapper.spotify.model_objects.AbstractModelObject$JsonUtil",
      "com.wrapper.spotify.model_objects.specification.Copyright$1",
      "com.wrapper.spotify.model_objects.specification.Copyright$JsonUtil",
      "com.wrapper.spotify.model_objects.specification.Album$JsonUtil",
      "com.google.gson.internal.bind.TreeTypeAdapter",
      "com.google.gson.internal.LinkedTreeMap$Node",
      "com.wrapper.spotify.model_objects.specification.ArtistSimplified$Builder",
      "com.google.gson.stream.JsonWriter",
      "com.google.gson.internal.bind.ArrayTypeAdapter$1",
      "com.google.gson.internal.$Gson$Preconditions",
      "com.google.gson.internal.Streams",
      "com.neovisionaries.i18n.CountryCode$Assignment",
      "com.google.gson.internal.bind.TypeAdapters$12",
      "com.google.gson.internal.bind.TypeAdapters$13",
      "com.google.gson.internal.bind.TypeAdapters$14",
      "com.google.gson.internal.bind.TypeAdapters$15",
      "com.google.gson.internal.bind.TypeAdapters$10",
      "com.google.gson.internal.Primitives",
      "com.google.gson.internal.bind.TypeAdapters$11",
      "com.google.gson.stream.MalformedJsonException",
      "com.google.gson.internal.bind.ArrayTypeAdapter",
      "com.google.gson.internal.bind.TypeAdapters$16",
      "com.wrapper.spotify.model_objects.specification.ExternalUrl",
      "com.google.gson.internal.ObjectConstructor",
      "com.google.gson.internal.bind.TypeAdapters$17",
      "com.google.gson.internal.bind.TypeAdapters$18",
      "com.google.gson.JsonNull",
      "com.google.gson.internal.bind.TypeAdapters$19",
      "com.google.gson.internal.bind.DateTypeAdapter$1",
      "com.google.gson.LongSerializationPolicy$1",
      "com.google.gson.LongSerializationPolicy$2",
      "com.google.gson.JsonObject",
      "com.google.gson.TypeAdapter$1",
      "com.wrapper.spotify.model_objects.specification.Album",
      "com.google.gson.Gson$2",
      "com.google.gson.Gson$3",
      "com.google.gson.internal.bind.ObjectTypeAdapter",
      "com.wrapper.spotify.model_objects.IModelObject$IJsonUtil",
      "com.wrapper.spotify.enums.CopyrightType",
      "com.google.gson.Gson$4",
      "com.google.gson.Gson$5",
      "com.neovisionaries.i18n.CountryCode$11",
      "com.neovisionaries.i18n.CountryCode$12",
      "com.wrapper.spotify.model_objects.specification.Copyright$Builder",
      "com.google.gson.internal.bind.DateTypeAdapter",
      "com.google.gson.internal.bind.CollectionTypeAdapterFactory$Adapter",
      "com.neovisionaries.i18n.CountryCode$10",
      "com.google.gson.Gson$1",
      "com.neovisionaries.i18n.CountryCode$2",
      "com.neovisionaries.i18n.CountryCode$3",
      "com.google.gson.internal.bind.TypeAdapters$26$1",
      "com.neovisionaries.i18n.CountryCode$4",
      "com.neovisionaries.i18n.CountryCode$5",
      "com.wrapper.spotify.model_objects.specification.Album$Builder",
      "com.google.gson.Gson",
      "com.neovisionaries.i18n.CountryCode$1",
      "com.google.gson.internal.LinkedTreeMap$1",
      "com.wrapper.spotify.model_objects.specification.Paging$Builder",
      "com.wrapper.spotify.model_objects.specification.Image$1",
      "com.google.gson.internal.reflect.ReflectionAccessor",
      "com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory",
      "com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$BoundField",
      "com.google.gson.internal.bind.ReflectiveTypeAdapterFactory",
      "com.google.gson.internal.LinkedTreeMap$EntrySet",
      "com.wrapper.spotify.model_objects.specification.Image$Builder",
      "com.wrapper.spotify.enums.ModelObjectType",
      "com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$1",
      "com.google.gson.internal.Excluder$1",
      "com.google.gson.internal.bind.TypeAdapters$2",
      "com.google.gson.internal.bind.JsonTreeReader",
      "com.google.gson.internal.bind.TypeAdapters$1",
      "com.wrapper.spotify.model_objects.specification.TrackSimplified",
      "com.wrapper.spotify.model_objects.specification.Paging",
      "com.google.gson.internal.bind.SqlDateTypeAdapter$1",
      "com.google.gson.JsonIOException",
      "com.google.gson.internal.bind.TypeAdapters$8",
      "com.google.gson.internal.bind.TypeAdapters$7",
      "com.google.gson.internal.bind.TypeAdapters",
      "com.google.gson.internal.bind.TypeAdapters$9",
      "com.google.gson.internal.LinkedTreeMap",
      "com.google.gson.internal.bind.TypeAdapters$4",
      "com.google.gson.internal.bind.TypeAdapters$3",
      "com.google.gson.internal.bind.TypeAdapters$6",
      "com.wrapper.spotify.model_objects.specification.PagingCursorbased",
      "com.google.gson.internal.bind.TypeAdapters$5",
      "com.google.gson.internal.LazilyParsedNumber",
      "com.google.gson.internal.bind.ObjectTypeAdapter$1",
      "com.google.gson.JsonParseException",
      "com.google.gson.internal.ConstructorConstructor",
      "com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$Adapter",
      "com.google.gson.internal.LinkedTreeMap$LinkedTreeMapIterator",
      "com.google.gson.JsonElement",
      "com.wrapper.spotify.model_objects.AbstractModelObject",
      "com.google.gson.FieldNamingPolicy",
      "com.google.gson.internal.bind.CollectionTypeAdapterFactory",
      "com.wrapper.spotify.model_objects.specification.ExternalUrl$Builder",
      "com.google.gson.internal.reflect.PreJava9ReflectionAccessor",
      "com.google.gson.JsonPrimitive",
      "com.google.gson.internal.Streams$AppendableWriter",
      "com.neovisionaries.i18n.CountryCode",
      "com.google.gson.JsonSyntaxException",
      "com.wrapper.spotify.model_objects.specification.Image$JsonUtil",
      "com.neovisionaries.i18n.CountryCode$6",
      "com.neovisionaries.i18n.CountryCode$7",
      "com.neovisionaries.i18n.CountryCode$8",
      "com.neovisionaries.i18n.CountryCode$9",
      "com.google.gson.FieldNamingPolicy$4",
      "com.google.gson.FieldNamingPolicy$3",
      "com.google.gson.FieldNamingPolicy$6",
      "com.google.gson.FieldNamingPolicy$5",
      "com.google.gson.internal.JsonReaderInternalAccess",
      "com.wrapper.spotify.model_objects.specification.Copyright",
      "com.google.gson.FieldNamingPolicy$2",
      "com.google.gson.FieldNamingPolicy$1"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("com.wrapper.spotify.model_objects.specification.ArtistSimplified", false, Album_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("com.wrapper.spotify.model_objects.specification.Copyright", false, Album_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("com.wrapper.spotify.model_objects.specification.Image", false, Album_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(Album_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "com.wrapper.spotify.model_objects.AbstractModelObject",
      "com.wrapper.spotify.model_objects.specification.Album",
      "com.wrapper.spotify.model_objects.AbstractModelObject$Builder",
      "com.wrapper.spotify.model_objects.specification.Album$Builder",
      "com.wrapper.spotify.model_objects.AbstractModelObject$JsonUtil",
      "com.wrapper.spotify.model_objects.specification.Album$JsonUtil",
      "com.google.gson.JsonElement",
      "com.google.gson.JsonObject",
      "com.google.gson.internal.LinkedTreeMap$1",
      "com.google.gson.internal.LinkedTreeMap",
      "com.google.gson.internal.LinkedTreeMap$Node",
      "com.wrapper.spotify.model_objects.specification.ArtistSimplified",
      "com.wrapper.spotify.model_objects.specification.Image",
      "com.google.gson.internal.LinkedTreeMap$EntrySet",
      "com.google.gson.internal.LinkedTreeMap$LinkedTreeMapIterator",
      "com.google.gson.internal.LinkedTreeMap$EntrySet$1",
      "com.google.gson.JsonPrimitive",
      "com.google.gson.internal.$Gson$Preconditions",
      "com.wrapper.spotify.model_objects.specification.Copyright",
      "com.google.gson.JsonParser",
      "com.google.gson.internal.JsonReaderInternalAccess",
      "com.google.gson.stream.JsonReader$1",
      "com.google.gson.stream.JsonReader",
      "com.google.gson.internal.Streams",
      "com.google.gson.stream.MalformedJsonException",
      "com.google.gson.JsonParseException",
      "com.google.gson.JsonSyntaxException",
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
      "com.google.gson.stream.JsonWriter",
      "com.wrapper.spotify.model_objects.specification.Paging$Builder",
      "com.wrapper.spotify.model_objects.specification.Paging",
      "com.google.gson.JsonNull",
      "com.google.gson.JsonArray",
      "com.google.gson.internal.LazilyParsedNumber",
      "com.wrapper.spotify.model_objects.specification.PagingCursorbased$Builder",
      "com.wrapper.spotify.model_objects.specification.PagingCursorbased",
      "com.google.gson.internal.LinkedTreeMap$KeySet",
      "com.google.gson.reflect.TypeToken",
      "com.google.gson.internal.$Gson$Types",
      "com.google.gson.Gson",
      "com.google.gson.internal.Excluder",
      "com.google.gson.FieldNamingPolicy",
      "com.google.gson.LongSerializationPolicy",
      "com.google.gson.internal.ConstructorConstructor",
      "com.google.gson.internal.JavaVersion",
      "com.google.gson.internal.reflect.PreJava9ReflectionAccessor",
      "com.google.gson.internal.reflect.ReflectionAccessor",
      "com.google.gson.internal.bind.ObjectTypeAdapter$1",
      "com.google.gson.internal.bind.ObjectTypeAdapter",
      "com.google.gson.Gson$1",
      "com.google.gson.Gson$2",
      "com.google.gson.Gson$4",
      "com.google.gson.Gson$5",
      "com.google.gson.internal.bind.DateTypeAdapter$1",
      "com.google.gson.internal.bind.DateTypeAdapter",
      "com.google.gson.internal.bind.TimeTypeAdapter$1",
      "com.google.gson.internal.bind.TimeTypeAdapter",
      "com.google.gson.internal.bind.SqlDateTypeAdapter$1",
      "com.google.gson.internal.bind.SqlDateTypeAdapter",
      "com.google.gson.internal.bind.ArrayTypeAdapter$1",
      "com.google.gson.internal.bind.ArrayTypeAdapter",
      "com.google.gson.internal.bind.CollectionTypeAdapterFactory",
      "com.google.gson.internal.bind.MapTypeAdapterFactory",
      "com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory",
      "com.google.gson.internal.bind.ReflectiveTypeAdapterFactory",
      "com.google.gson.internal.Primitives",
      "com.wrapper.spotify.model_objects.specification.ArtistSimplified$JsonUtil",
      "com.wrapper.spotify.model_objects.specification.Copyright$JsonUtil"
    );
  }
}
