/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Sat May 25 22:53:22 GMT 2019
 */

package com.wrapper.spotify;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class HttpDeleteBody_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "com.wrapper.spotify.HttpDeleteBody"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(HttpDeleteBody_ESTest_scaffolding.class.getClassLoader() ,
      "org.apache.http.HttpEntityEnclosingRequest",
      "org.apache.http.client.methods.Configurable",
      "org.apache.http.client.methods.HttpEntityEnclosingRequestBase",
      "org.apache.http.HeaderIterator",
      "org.apache.http.message.HeaderGroup",
      "org.apache.http.client.methods.HttpRequestBase",
      "org.apache.http.HttpEntity",
      "com.wrapper.spotify.HttpDeleteBody",
      "org.apache.http.conn.ClientConnectionRequest",
      "org.apache.http.client.methods.HttpUriRequest",
      "org.apache.http.client.methods.HttpExecutionAware",
      "org.apache.http.client.config.RequestConfig",
      "org.apache.http.HttpRequest",
      "org.apache.http.Header",
      "org.apache.http.ProtocolVersion",
      "org.apache.http.concurrent.Cancellable",
      "org.apache.http.client.methods.AbortableHttpRequest",
      "org.apache.http.RequestLine",
      "org.apache.http.params.HttpParams",
      "org.apache.http.HttpMessage",
      "org.apache.http.message.AbstractHttpMessage",
      "org.apache.http.conn.ConnectionReleaseTrigger",
      "org.apache.http.client.methods.AbstractExecutionAwareRequest",
      "org.apache.http.NameValuePair"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(HttpDeleteBody_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.apache.http.message.AbstractHttpMessage",
      "org.apache.http.client.methods.AbstractExecutionAwareRequest",
      "org.apache.http.client.methods.HttpRequestBase",
      "org.apache.http.client.methods.HttpEntityEnclosingRequestBase",
      "com.wrapper.spotify.HttpDeleteBody",
      "org.apache.http.message.HeaderGroup",
      "org.apache.http.params.AbstractHttpParams",
      "org.apache.http.params.BasicHttpParams",
      "org.apache.http.params.HttpProtocolParams",
      "org.apache.http.util.Args",
      "org.apache.http.ProtocolVersion",
      "org.apache.http.HttpVersion",
      "org.apache.http.util.CharArrayBuffer",
      "org.apache.http.message.BufferedHeader",
      "org.apache.http.message.BasicHeader",
      "org.apache.http.message.TokenParser",
      "org.apache.http.message.BasicHeaderValueParser",
      "org.apache.http.message.ParserCursor",
      "org.apache.http.message.BasicNameValuePair",
      "org.apache.http.message.BasicHeaderElement",
      "org.apache.http.message.BasicListHeaderIterator",
      "org.apache.http.message.BasicLineFormatter",
      "org.apache.http.concurrent.BasicFuture",
      "org.apache.http.client.utils.CloneUtils",
      "org.apache.http.util.Asserts",
      "org.apache.http.message.BasicRequestLine",
      "org.apache.http.ParseException"
    );
  }
}
