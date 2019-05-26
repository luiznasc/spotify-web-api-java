/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Sat May 25 22:26:28 GMT 2019
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
public class SavedAlbum_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "com.wrapper.spotify.model_objects.specification.SavedAlbum"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(SavedAlbum_ESTest_scaffolding.class.getClassLoader() ,
      "org.apache.http.io.HttpMessageParserFactory",
      "org.apache.http.impl.conn.DefaultHttpResponseParserFactory",
      "org.apache.http.impl.client.cache.HttpCache",
      "org.apache.http.impl.execchain.RequestAbortedException",
      "com.wrapper.spotify.model_objects.specification.ExternalId",
      "com.google.gson.internal.bind.JsonTreeWriter",
      "com.wrapper.spotify.exceptions.detailed.InternalServerErrorException",
      "org.apache.http.impl.execchain.ProtocolExec",
      "org.apache.http.config.Registry",
      "org.apache.http.cookie.MalformedCookieException",
      "org.apache.http.impl.conn.SystemDefaultDnsResolver",
      "org.apache.http.client.protocol.RequestClientConnControl",
      "org.apache.http.conn.ConnectionRequest",
      "com.wrapper.spotify.model_objects.specification.ArtistSimplified",
      "com.wrapper.spotify.exceptions.SpotifyWebApiException",
      "org.apache.http.impl.client.DefaultUserTokenHandler",
      "org.apache.http.impl.client.cache.CacheEntryUpdater",
      "com.wrapper.spotify.IHttpManager",
      "org.apache.http.impl.cookie.RFC6265CookieSpecProvider$CompatibilityLevel",
      "org.apache.http.impl.conn.DefaultManagedHttpClientConnection",
      "org.apache.http.conn.HttpClientConnectionManager",
      "org.apache.http.client.protocol.RequestAcceptEncoding",
      "org.apache.http.HttpException",
      "org.apache.http.cookie.CookieSpec",
      "org.apache.http.pool.AbstractConnPool$1",
      "org.apache.http.conn.ssl.AllowAllHostnameVerifier",
      "com.wrapper.spotify.exceptions.detailed.ForbiddenException",
      "org.apache.http.impl.client.cache.FailureCache",
      "com.google.gson.internal.bind.TypeAdapters$35$1",
      "org.apache.http.client.entity.GZIPInputStreamFactory",
      "com.wrapper.spotify.model_objects.IModelObject",
      "org.apache.http.client.CredentialsProvider",
      "org.apache.http.impl.client.cache.CachedHttpResponseGenerator",
      "org.apache.http.impl.client.cache.ResponseProtocolCompliance",
      "org.apache.http.client.entity.InputStreamFactory",
      "org.apache.http.impl.client.cache.AsynchronousValidator",
      "org.apache.http.client.ClientProtocolException",
      "org.apache.http.pool.RouteSpecificPool",
      "com.google.gson.stream.JsonReader$1",
      "org.apache.http.client.methods.Configurable",
      "org.apache.http.config.RegistryBuilder",
      "org.apache.http.impl.client.cache.CacheConfig",
      "com.google.gson.JsonParser",
      "org.apache.http.conn.ssl.AbstractVerifier",
      "com.wrapper.spotify.SpotifyApi",
      "org.apache.http.auth.Credentials",
      "com.wrapper.spotify.model_objects.AbstractModelObject$JsonUtil",
      "com.wrapper.spotify.model_objects.specification.Album$JsonUtil",
      "org.apache.http.io.HttpMessageParser",
      "org.apache.http.client.methods.AbstractExecutionAwareRequest",
      "org.apache.http.impl.BHttpConnectionBase",
      "com.google.gson.stream.JsonWriter",
      "org.apache.http.io.HttpMessageWriter",
      "org.apache.http.impl.cookie.RFC6265CookieSpecProvider",
      "org.apache.http.impl.execchain.RedirectExec",
      "org.apache.http.HttpClientConnection",
      "org.apache.http.conn.ConnectionPoolTimeoutException",
      "org.apache.http.conn.routing.HttpRouteDirector",
      "org.apache.http.impl.client.cache.CacheKeyGenerator",
      "org.apache.http.pool.ConnPool",
      "org.apache.http.protocol.HttpProcessor",
      "org.apache.http.client.cache.HttpCacheStorage",
      "org.apache.http.impl.client.cache.DefaultFailureCache",
      "org.apache.http.client.RedirectStrategy",
      "org.apache.http.impl.client.BasicCookieStore",
      "com.wrapper.spotify.model_objects.specification.ExternalUrl",
      "org.apache.http.conn.routing.BasicRouteDirector",
      "org.apache.http.protocol.HttpContext",
      "com.google.gson.JsonNull",
      "org.apache.http.client.NonRepeatableRequestException",
      "org.apache.http.HttpResponse",
      "org.apache.http.impl.client.AuthenticationStrategyImpl",
      "org.apache.http.impl.client.HttpClientBuilder",
      "com.google.gson.JsonObject",
      "com.wrapper.spotify.model_objects.specification.Album",
      "org.apache.http.impl.io.DefaultHttpRequestWriterFactory",
      "org.apache.http.client.protocol.RequestAuthCache",
      "com.wrapper.spotify.model_objects.IModelObject$IJsonUtil",
      "org.apache.http.impl.conn.DefaultSchemePortResolver",
      "org.apache.http.impl.conn.PoolingHttpClientConnectionManager$InternalConnectionFactory",
      "org.apache.http.Header",
      "org.apache.http.conn.HttpHostConnectException",
      "org.apache.http.impl.client.cache.RequestProtocolCompliance",
      "org.apache.http.impl.client.BasicCredentialsProvider",
      "org.apache.http.conn.ConnectionKeepAliveStrategy",
      "org.apache.http.conn.ssl.X509HostnameVerifier",
      "com.wrapper.spotify.model_objects.specification.Album$Builder",
      "org.apache.http.protocol.ChainBuilder",
      "org.apache.http.impl.client.DefaultHttpRequestRetryHandler",
      "org.apache.http.impl.conn.PoolingHttpClientConnectionManager",
      "org.apache.http.impl.client.DefaultRedirectStrategy",
      "org.apache.http.impl.auth.KerberosSchemeFactory",
      "org.apache.http.impl.client.cache.CacheableRequestPolicy",
      "org.apache.http.impl.client.cache.BasicHttpCacheStorage",
      "com.wrapper.spotify.enums.ModelObjectType",
      "org.apache.http.conn.util.PublicSuffixListParser",
      "org.apache.http.client.methods.HttpRequestBase",
      "org.apache.http.pool.PoolEntryCallback",
      "org.apache.http.HttpEntity",
      "org.apache.http.impl.DefaultConnectionReuseStrategy",
      "org.apache.http.pool.ConnFactory",
      "com.google.gson.internal.bind.TypeAdapters$2",
      "com.google.gson.internal.bind.TypeAdapters$1",
      "org.apache.http.client.methods.HttpGet",
      "com.wrapper.spotify.model_objects.specification.Paging",
      "com.google.gson.JsonIOException",
      "com.google.gson.internal.bind.TypeAdapters$8",
      "org.apache.http.conn.ssl.DefaultHostnameVerifier",
      "org.apache.http.client.CircularRedirectException",
      "com.google.gson.internal.bind.TypeAdapters$7",
      "com.google.gson.internal.bind.TypeAdapters",
      "com.google.gson.internal.bind.TypeAdapters$9",
      "com.google.gson.internal.bind.TypeAdapters$4",
      "org.apache.http.impl.execchain.ClientExecChain",
      "org.apache.commons.logging.impl.Jdk14Logger",
      "com.google.gson.internal.bind.TypeAdapters$3",
      "com.google.gson.internal.bind.TypeAdapters$6",
      "com.google.gson.internal.bind.TypeAdapters$5",
      "org.apache.http.impl.client.cache.CacheConfig$Builder",
      "org.apache.http.HttpVersion",
      "com.wrapper.spotify.SpotifyHttpManager$Builder",
      "org.apache.http.config.ConnectionConfig$Builder",
      "org.apache.http.conn.SchemePortResolver",
      "org.apache.http.conn.DnsResolver",
      "org.apache.http.impl.client.cache.BasicHttpCache",
      "com.wrapper.spotify.HttpDeleteBody",
      "org.apache.http.impl.client.TargetAuthenticationStrategy",
      "org.apache.http.impl.client.cache.ResponseCachingPolicy",
      "com.wrapper.spotify.exceptions.detailed.BadGatewayException",
      "org.apache.http.auth.AuthScheme",
      "org.apache.http.message.AbstractHttpMessage",
      "com.google.gson.JsonPrimitive",
      "org.apache.http.impl.cookie.BasicPathHandler",
      "com.wrapper.spotify.exceptions.detailed.TooManyRequestsException",
      "com.google.gson.internal.Streams$AppendableWriter",
      "org.apache.http.auth.MalformedChallengeException",
      "com.neovisionaries.i18n.CountryCode",
      "org.apache.http.HttpEntityEnclosingRequest",
      "org.apache.http.cookie.CommonCookieAttributeHandler",
      "com.google.gson.JsonSyntaxException",
      "org.apache.http.ReasonPhraseCatalog",
      "org.apache.http.client.UserTokenHandler",
      "org.apache.http.impl.auth.DigestSchemeFactory",
      "org.apache.http.HttpResponseFactory",
      "org.apache.http.impl.entity.LaxContentLengthStrategy",
      "org.apache.http.client.methods.HttpPut",
      "org.apache.http.impl.client.cache.CachingHttpClients",
      "org.apache.http.ConnectionReuseStrategy",
      "org.apache.http.client.protocol.RequestDefaultHeaders",
      "org.apache.http.impl.entity.StrictContentLengthStrategy",
      "org.apache.http.impl.conn.ConnectionShutdownException",
      "org.apache.http.conn.ManagedHttpClientConnection",
      "org.apache.http.client.protocol.ResponseContentEncoding",
      "org.apache.http.message.BasicLineParser",
      "org.apache.http.client.methods.HttpPost",
      "org.apache.http.auth.AuthSchemeProvider",
      "com.wrapper.spotify.model_objects.specification.Image",
      "com.wrapper.spotify.exceptions.detailed.NotFoundException",
      "com.google.gson.internal.bind.TypeAdapters$23",
      "com.google.gson.internal.bind.TypeAdapters$24",
      "com.google.gson.internal.bind.TypeAdapters$25",
      "org.apache.http.client.config.RequestConfig",
      "com.google.gson.internal.bind.TypeAdapters$26",
      "org.apache.http.StatusLine",
      "com.google.gson.internal.bind.TypeAdapters$20",
      "org.apache.http.client.entity.DeflateInputStream",
      "com.google.gson.TypeAdapter",
      "com.google.gson.internal.bind.TypeAdapters$21",
      "org.apache.http.impl.DefaultBHttpClientConnection",
      "com.google.gson.internal.bind.TypeAdapters$22",
      "com.wrapper.spotify.model_objects.AbstractModelObject$Builder",
      "org.apache.http.impl.DefaultHttpResponseFactory",
      "com.google.gson.internal.bind.TypeAdapters$27",
      "org.apache.http.RequestLine",
      "com.google.gson.internal.bind.TypeAdapters$28",
      "org.apache.http.conn.HttpConnectionFactory",
      "org.apache.http.protocol.RequestContent",
      "com.google.gson.internal.bind.TypeAdapters$29",
      "org.apache.http.ssl.SSLContexts",
      "org.apache.http.cookie.CookieIdentityComparator",
      "org.apache.http.config.Lookup",
      "org.apache.http.HttpMessage",
      "com.wrapper.spotify.SpotifyHttpManager",
      "com.wrapper.spotify.model_objects.IModelObject$Builder",
      "org.apache.http.HttpRequestInterceptor",
      "org.apache.http.HeaderElementIterator",
      "org.apache.http.client.AuthCache",
      "org.apache.http.impl.conn.DefaultHttpClientConnectionOperator",
      "org.apache.http.impl.client.cache.CacheMap",
      "com.wrapper.spotify.enums.ReleaseDatePrecision",
      "org.apache.http.pool.AbstractConnPool",
      "org.apache.http.HeaderIterator",
      "org.apache.http.client.entity.DeflateInputStreamFactory",
      "org.apache.http.conn.ClientConnectionManager",
      "org.apache.http.HttpInetConnection",
      "org.apache.http.message.LineFormatter",
      "com.google.gson.internal.bind.TypeAdapters$34",
      "com.google.gson.internal.bind.TypeAdapters$35",
      "org.apache.http.cookie.CookieSpecProvider",
      "org.apache.http.impl.client.cache.ImmediateSchedulingStrategy",
      "com.google.gson.internal.bind.TypeAdapters$30",
      "org.apache.http.HttpRequest",
      "org.apache.http.pool.ConnPoolControl",
      "com.google.gson.internal.bind.TypeAdapters$32",
      "com.google.gson.internal.bind.TypeAdapters$33",
      "com.google.gson.JsonArray",
      "org.apache.http.client.AuthenticationStrategy",
      "org.apache.http.conn.socket.ConnectionSocketFactory",
      "org.apache.http.impl.cookie.DefaultCookieSpecProvider",
      "org.apache.http.conn.HttpClientConnectionOperator",
      "org.apache.http.client.cache.Resource",
      "org.apache.http.conn.util.PublicSuffixMatcher",
      "org.apache.http.client.cache.HttpCacheUpdateException",
      "com.google.gson.TypeAdapterFactory",
      "org.apache.http.client.cache.HttpCacheUpdateCallback",
      "com.google.gson.internal.bind.TypeAdapters$EnumTypeAdapter",
      "org.apache.http.protocol.RequestTargetHost",
      "org.apache.http.pool.PoolEntry",
      "org.apache.http.impl.client.cache.CachedResponseSuitabilityChecker",
      "org.apache.http.message.BasicLineFormatter",
      "org.apache.http.impl.client.cache.CachingHttpClientBuilder",
      "org.apache.http.client.RedirectException",
      "org.apache.http.client.methods.HttpUriRequest",
      "org.apache.http.protocol.HttpRequestExecutor",
      "com.google.gson.stream.JsonReader",
      "org.apache.http.impl.auth.HttpAuthenticator",
      "org.apache.http.conn.util.PublicSuffixList",
      "com.wrapper.spotify.exceptions.detailed.BadRequestException",
      "org.apache.http.impl.conn.ManagedHttpClientConnectionFactory",
      "org.apache.http.conn.ConnectTimeoutException",
      "org.apache.http.impl.client.cache.CachingExec",
      "com.wrapper.spotify.enums.AlbumType",
      "org.apache.http.client.methods.AbortableHttpRequest",
      "org.apache.http.client.HttpClient",
      "com.wrapper.spotify.SpotifyApi$1",
      "org.apache.http.auth.AuthSchemeFactory",
      "org.apache.http.protocol.ImmutableHttpProcessor",
      "org.apache.http.impl.auth.SPNegoSchemeFactory",
      "org.apache.http.impl.conn.PoolingHttpClientConnectionManager$ConfigData",
      "com.google.gson.internal.Streams",
      "com.google.gson.internal.bind.TypeAdapters$12",
      "com.google.gson.internal.bind.TypeAdapters$13",
      "com.wrapper.spotify.exceptions.detailed.UnauthorizedException",
      "org.apache.http.TokenIterator",
      "com.google.gson.internal.bind.TypeAdapters$14",
      "com.google.gson.internal.bind.TypeAdapters$15",
      "org.apache.http.impl.conn.CPool",
      "org.apache.http.impl.auth.NTLMSchemeFactory",
      "com.google.gson.internal.bind.TypeAdapters$10",
      "com.google.gson.internal.bind.TypeAdapters$11",
      "com.google.gson.stream.MalformedJsonException",
      "org.apache.http.ProtocolVersion",
      "org.apache.http.client.protocol.RequestExpectContinue",
      "org.apache.http.impl.client.cache.CacheValidityPolicy",
      "com.google.gson.internal.bind.TypeAdapters$16",
      "com.google.gson.internal.bind.TypeAdapters$17",
      "org.apache.http.impl.client.cache.ConditionalRequestBuilder",
      "com.google.gson.internal.bind.TypeAdapters$18",
      "com.google.gson.internal.bind.TypeAdapters$19",
      "org.apache.http.util.VersionInfo",
      "org.apache.http.conn.UnsupportedSchemeException",
      "org.apache.http.ProtocolException",
      "com.wrapper.spotify.model_objects.specification.SavedAlbum$Builder",
      "org.apache.http.client.methods.HttpEntityEnclosingRequestBase",
      "com.google.gson.TypeAdapter$1",
      "org.apache.http.NoHttpResponseException",
      "org.apache.http.impl.client.ProxyAuthenticationStrategy",
      "org.apache.http.conn.ssl.StrictHostnameVerifier",
      "org.apache.http.io.HttpMessageWriterFactory",
      "com.google.gson.internal.bind.TypeAdapters$26$1",
      "org.apache.http.concurrent.Cancellable",
      "org.apache.http.impl.execchain.MainClientExec",
      "org.apache.http.impl.client.cache.HeapResourceFactory",
      "org.apache.http.entity.ContentLengthStrategy",
      "org.apache.http.protocol.HttpProcessorBuilder",
      "org.apache.http.impl.execchain.TunnelRefusedException",
      "org.apache.http.conn.routing.HttpRoutePlanner",
      "org.apache.http.Consts",
      "org.apache.http.impl.cookie.DefaultCookieSpecProvider$CompatibilityLevel",
      "org.apache.http.conn.ssl.SSLConnectionSocketFactory",
      "com.wrapper.spotify.model_objects.specification.SavedAlbum",
      "org.apache.http.message.LineParser",
      "com.wrapper.spotify.exceptions.detailed.ServiceUnavailableException",
      "org.apache.http.util.Args",
      "org.apache.http.impl.client.DefaultConnectionKeepAliveStrategy",
      "org.apache.http.protocol.RequestUserAgent",
      "org.apache.http.impl.cookie.IgnoreSpecProvider",
      "org.apache.http.conn.util.PublicSuffixMatcherLoader",
      "org.apache.http.config.ConnectionConfig",
      "org.apache.http.conn.socket.LayeredConnectionSocketFactory",
      "org.apache.http.cookie.CookieAttributeHandler",
      "org.apache.http.HttpResponseInterceptor",
      "org.apache.http.conn.ssl.BrowserCompatHostnameVerifier",
      "org.apache.http.util.TextUtils",
      "com.google.gson.internal.bind.JsonTreeReader",
      "org.apache.http.impl.EnglishReasonPhraseCatalog",
      "org.apache.http.impl.client.HttpClientBuilder$2",
      "org.apache.http.client.config.RequestConfig$Builder",
      "org.apache.http.auth.AuthenticationException",
      "org.apache.http.impl.cookie.NetscapeDraftSpecProvider",
      "org.apache.http.NameValuePair",
      "org.apache.http.impl.client.DefaultClientConnectionReuseStrategy",
      "org.apache.http.client.protocol.RequestAddCookies",
      "com.wrapper.spotify.model_objects.specification.PagingCursorbased",
      "com.google.gson.internal.LazilyParsedNumber",
      "com.google.gson.JsonParseException",
      "org.apache.http.impl.client.cache.CacheInvalidator",
      "org.apache.http.impl.conn.DefaultRoutePlanner",
      "com.google.gson.JsonElement",
      "org.apache.http.ssl.SSLInitializationException",
      "com.wrapper.spotify.model_objects.AbstractModelObject",
      "org.apache.http.impl.conn.CPoolEntry",
      "org.apache.http.client.CookieStore",
      "org.apache.http.impl.auth.BasicSchemeFactory",
      "org.apache.http.client.methods.CloseableHttpResponse",
      "org.apache.http.conn.socket.PlainConnectionSocketFactory",
      "com.wrapper.spotify.model_objects.specification.SavedAlbum$JsonUtil",
      "org.apache.http.impl.client.cache.SchedulingStrategy",
      "org.apache.http.client.HttpRequestRetryHandler",
      "org.apache.http.impl.client.CloseableHttpClient",
      "org.apache.http.ParseException",
      "org.apache.http.client.protocol.ResponseProcessCookies",
      "org.apache.http.impl.cookie.DefaultCookieSpecProvider$1",
      "org.apache.http.client.methods.HttpExecutionAware",
      "org.apache.http.impl.client.InternalHttpClient",
      "org.apache.http.impl.execchain.RetryExec",
      "org.apache.http.impl.client.CookieSpecRegistries",
      "com.google.gson.internal.JsonReaderInternalAccess",
      "org.apache.http.client.cache.HttpCacheInvalidator",
      "org.apache.http.conn.util.DomainType",
      "com.wrapper.spotify.model_objects.specification.Copyright",
      "org.apache.http.conn.routing.RouteInfo",
      "org.apache.http.HttpConnection",
      "org.apache.http.client.cache.ResourceFactory"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("com.google.gson.JsonElement", false, SavedAlbum_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("com.google.gson.JsonObject", false, SavedAlbum_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(SavedAlbum_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "com.wrapper.spotify.model_objects.AbstractModelObject",
      "com.wrapper.spotify.model_objects.specification.SavedAlbum",
      "com.wrapper.spotify.model_objects.AbstractModelObject$Builder",
      "com.wrapper.spotify.model_objects.specification.SavedAlbum$Builder",
      "com.wrapper.spotify.model_objects.AbstractModelObject$JsonUtil",
      "com.wrapper.spotify.model_objects.specification.SavedAlbum$JsonUtil",
      "com.google.gson.JsonElement",
      "com.google.gson.JsonObject",
      "com.google.gson.JsonArray",
      "com.google.gson.JsonParser",
      "com.google.gson.internal.JsonReaderInternalAccess",
      "com.google.gson.stream.JsonReader$1",
      "com.google.gson.stream.JsonReader",
      "com.google.gson.internal.Streams",
      "com.google.gson.JsonNull",
      "com.google.gson.stream.JsonWriter",
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
      "com.google.gson.stream.JsonToken",
      "com.google.gson.internal.bind.TypeAdapters$36",
      "com.google.gson.JsonPrimitive",
      "com.google.gson.internal.$Gson$Preconditions",
      "com.google.gson.stream.MalformedJsonException",
      "com.google.gson.JsonParseException",
      "com.google.gson.JsonSyntaxException",
      "com.wrapper.spotify.model_objects.specification.PagingCursorbased$Builder",
      "com.wrapper.spotify.model_objects.specification.PagingCursorbased",
      "com.wrapper.spotify.model_objects.specification.Paging$Builder",
      "com.wrapper.spotify.model_objects.specification.Paging",
      "com.google.gson.internal.LazilyParsedNumber",
      "com.google.gson.internal.LinkedTreeMap$1",
      "com.google.gson.internal.LinkedTreeMap",
      "com.google.gson.internal.LinkedTreeMap$Node",
      "com.wrapper.spotify.model_objects.specification.Album$JsonUtil",
      "com.wrapper.spotify.model_objects.specification.Album$Builder",
      "com.wrapper.spotify.model_objects.specification.Album",
      "com.wrapper.spotify.SpotifyHttpManager$Builder",
      "com.wrapper.spotify.SpotifyHttpManager",
      "org.apache.http.impl.client.cache.CacheConfig$Builder",
      "org.apache.http.impl.client.cache.CacheConfig",
      "org.apache.http.config.ConnectionConfig$Builder",
      "org.apache.http.config.ConnectionConfig",
      "org.apache.http.impl.client.BasicCredentialsProvider",
      "org.apache.http.client.config.RequestConfig$Builder",
      "org.apache.http.client.config.RequestConfig",
      "org.apache.http.impl.client.cache.CachingHttpClients",
      "org.apache.http.impl.client.HttpClientBuilder",
      "org.apache.http.impl.client.cache.CachingHttpClientBuilder",
      "org.apache.http.conn.util.PublicSuffixMatcherLoader",
      "org.apache.http.util.Args",
      "org.apache.http.conn.util.PublicSuffixListParser",
      "org.apache.http.Consts",
      "org.apache.http.conn.util.DomainType",
      "org.apache.http.conn.util.PublicSuffixList",
      "org.apache.http.conn.util.PublicSuffixMatcher",
      "org.apache.http.protocol.HttpRequestExecutor",
      "org.apache.http.conn.ssl.DefaultHostnameVerifier",
      "org.apache.commons.logging.impl.Jdk14Logger",
      "org.apache.http.conn.ssl.AbstractVerifier",
      "org.apache.http.conn.ssl.AllowAllHostnameVerifier",
      "org.apache.http.conn.ssl.BrowserCompatHostnameVerifier",
      "org.apache.http.conn.ssl.StrictHostnameVerifier",
      "org.apache.http.conn.ssl.SSLConnectionSocketFactory",
      "org.apache.http.ssl.SSLContexts",
      "org.apache.http.impl.conn.PoolingHttpClientConnectionManager",
      "org.apache.http.config.RegistryBuilder",
      "org.apache.http.conn.socket.PlainConnectionSocketFactory",
      "org.apache.http.util.TextUtils",
      "org.apache.http.config.Registry",
      "org.apache.http.impl.conn.DefaultHttpClientConnectionOperator",
      "org.apache.http.impl.conn.DefaultSchemePortResolver",
      "org.apache.http.impl.conn.SystemDefaultDnsResolver",
      "org.apache.http.impl.conn.PoolingHttpClientConnectionManager$ConfigData",
      "org.apache.http.pool.AbstractConnPool",
      "org.apache.http.impl.conn.CPool",
      "org.apache.http.impl.conn.PoolingHttpClientConnectionManager$InternalConnectionFactory",
      "org.apache.http.message.BasicLineFormatter",
      "org.apache.http.impl.io.DefaultHttpRequestWriterFactory",
      "org.apache.http.ProtocolVersion",
      "org.apache.http.HttpVersion",
      "org.apache.http.message.BasicLineParser",
      "org.apache.http.impl.EnglishReasonPhraseCatalog",
      "org.apache.http.impl.DefaultHttpResponseFactory",
      "org.apache.http.impl.conn.DefaultHttpResponseParserFactory",
      "org.apache.http.impl.entity.LaxContentLengthStrategy",
      "org.apache.http.impl.entity.StrictContentLengthStrategy",
      "org.apache.http.impl.conn.ManagedHttpClientConnectionFactory",
      "org.apache.http.impl.DefaultConnectionReuseStrategy",
      "org.apache.http.impl.client.DefaultClientConnectionReuseStrategy",
      "org.apache.http.impl.client.DefaultConnectionKeepAliveStrategy",
      "org.apache.http.impl.client.AuthenticationStrategyImpl",
      "org.apache.http.impl.client.TargetAuthenticationStrategy",
      "org.apache.http.impl.client.ProxyAuthenticationStrategy",
      "org.apache.http.impl.client.DefaultUserTokenHandler",
      "org.apache.http.util.VersionInfo",
      "org.apache.http.protocol.ImmutableHttpProcessor",
      "org.apache.http.protocol.RequestTargetHost",
      "org.apache.http.protocol.RequestUserAgent",
      "org.apache.http.impl.execchain.MainClientExec",
      "org.apache.http.impl.auth.HttpAuthenticator",
      "org.apache.http.conn.routing.BasicRouteDirector",
      "org.apache.http.impl.client.cache.HeapResourceFactory",
      "org.apache.http.impl.client.cache.BasicHttpCacheStorage",
      "org.apache.http.impl.client.cache.CacheMap",
      "org.apache.http.impl.client.cache.ImmediateSchedulingStrategy",
      "org.apache.http.impl.client.cache.AsynchronousValidator",
      "org.apache.http.impl.client.cache.CacheKeyGenerator",
      "org.apache.http.impl.client.cache.DefaultFailureCache",
      "org.apache.http.impl.client.cache.CacheInvalidator",
      "org.apache.http.impl.client.cache.CachingExec",
      "org.apache.http.impl.client.cache.BasicHttpCache",
      "org.apache.http.impl.client.cache.CacheEntryUpdater",
      "org.apache.http.impl.client.cache.CachedHttpResponseGenerator",
      "org.apache.http.impl.client.cache.CacheValidityPolicy",
      "org.apache.http.impl.client.cache.CacheableRequestPolicy",
      "org.apache.http.impl.client.cache.CachedResponseSuitabilityChecker",
      "org.apache.http.impl.client.cache.ConditionalRequestBuilder",
      "org.apache.http.impl.client.cache.ResponseProtocolCompliance",
      "org.apache.http.impl.client.cache.RequestProtocolCompliance",
      "org.apache.http.impl.client.cache.ResponseCachingPolicy",
      "org.apache.http.protocol.HttpProcessorBuilder",
      "org.apache.http.client.protocol.RequestDefaultHeaders",
      "org.apache.http.protocol.RequestContent",
      "org.apache.http.client.protocol.RequestClientConnControl",
      "org.apache.http.client.protocol.RequestExpectContinue",
      "org.apache.http.protocol.ChainBuilder",
      "org.apache.http.client.protocol.RequestAddCookies",
      "org.apache.http.client.protocol.RequestAcceptEncoding",
      "org.apache.http.client.protocol.RequestAuthCache",
      "org.apache.http.client.protocol.ResponseProcessCookies",
      "org.apache.http.client.protocol.ResponseContentEncoding",
      "org.apache.http.client.entity.GZIPInputStreamFactory",
      "org.apache.http.client.entity.DeflateInputStreamFactory",
      "org.apache.http.impl.execchain.ProtocolExec",
      "org.apache.http.impl.client.DefaultHttpRequestRetryHandler",
      "org.apache.http.impl.execchain.RetryExec",
      "org.apache.http.impl.conn.DefaultRoutePlanner",
      "org.apache.http.impl.client.DefaultRedirectStrategy",
      "org.apache.http.impl.execchain.RedirectExec",
      "org.apache.http.impl.auth.BasicSchemeFactory",
      "org.apache.http.impl.auth.DigestSchemeFactory",
      "org.apache.http.impl.auth.NTLMSchemeFactory",
      "org.apache.http.impl.auth.SPNegoSchemeFactory",
      "org.apache.http.impl.auth.KerberosSchemeFactory",
      "org.apache.http.impl.client.CookieSpecRegistries",
      "org.apache.http.impl.cookie.DefaultCookieSpecProvider",
      "org.apache.http.impl.cookie.DefaultCookieSpecProvider$CompatibilityLevel",
      "org.apache.http.impl.cookie.RFC6265CookieSpecProvider",
      "org.apache.http.impl.cookie.RFC6265CookieSpecProvider$CompatibilityLevel",
      "org.apache.http.impl.cookie.NetscapeDraftSpecProvider",
      "org.apache.http.impl.cookie.IgnoreSpecProvider",
      "org.apache.http.impl.client.BasicCookieStore",
      "org.apache.http.cookie.CookieIdentityComparator",
      "org.apache.http.impl.client.HttpClientBuilder$2",
      "org.apache.http.impl.client.CloseableHttpClient",
      "org.apache.http.impl.client.InternalHttpClient",
      "com.wrapper.spotify.SpotifyApi$1",
      "com.wrapper.spotify.SpotifyApi"
    );
  }
}
