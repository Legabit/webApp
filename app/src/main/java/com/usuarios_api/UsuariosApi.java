
package com.usuarios_api;

/**
 * Service definition for UsuariosApi (v1).
 *
 * <p>
 * usuarios endpoints
 * </p>
 *
 * <p>
 * For more information about this service, see the
 * <a href="" target="_blank">API Documentation</a>
 * </p>
 *
 * <p>
 * This service uses {@link UsuariosApiRequestInitializer} to initialize global parameters via its
 * {@link Builder}.
 * </p>
 *
 * @since 1.3
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public class UsuariosApi extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient {

  // Note: Leave this static initializer at the top of the file.
  static {
    com.google.api.client.util.Preconditions.checkState(
            com.google.api.client.googleapis.GoogleUtils.MAJOR_VERSION == 1 &&
                    com.google.api.client.googleapis.GoogleUtils.MINOR_VERSION >= 15,
            "You are currently running with version %s of google-api-client. " +
                    "You need at least version 1.15 of google-api-client to run version " +
                    "1.23.0 of the usuarios_api library.", com.google.api.client.googleapis.GoogleUtils.VERSION);
  }

  /**
   * The default encoded root URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_ROOT_URL = "https://bestmedicineprice.appspot.com/_ah/api/";

  /**
   * The default encoded service path of the service. This is determined when the library is
   * generated and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_SERVICE_PATH = "usuarios_api/v1/";

  /**
   * The default encoded batch path of the service. This is determined when the library is
   * generated and normally should not be changed.
   *
   * @since 1.23
   */
  public static final String DEFAULT_BATCH_PATH = "batch";

  /**
   * The default encoded base URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   */
  public static final String DEFAULT_BASE_URL = DEFAULT_ROOT_URL + DEFAULT_SERVICE_PATH;

  /**
   * Constructor.
   *
   * <p>
   * Use {@link Builder} if you need to specify any of the optional parameters.
   * </p>
   *
   * @param transport HTTP transport, which should normally be:
   *        <ul>
   *        <li>Google App Engine:
   *        {@code com.google.api.client.extensions.appengine.http.UrlFetchTransport}</li>
   *        <li>Android: {@code newCompatibleTransport} from
   *        {@code com.google.api.client.extensions.android.http.AndroidHttp}</li>
   *        <li>Java: {@link com.google.api.client.googleapis.javanet.GoogleNetHttpTransport#newTrustedTransport()}
   *        </li>
   *        </ul>
   * @param jsonFactory JSON factory, which may be:
   *        <ul>
   *        <li>Jackson: {@code com.google.api.client.json.jackson2.JacksonFactory}</li>
   *        <li>Google GSON: {@code com.google.api.client.json.gson.GsonFactory}</li>
   *        <li>Android Honeycomb or higher:
   *        {@code com.google.api.client.extensions.android.json.AndroidJsonFactory}</li>
   *        </ul>
   * @param httpRequestInitializer HTTP request initializer or {@code null} for none
   * @since 1.7
   */
  public UsuariosApi(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
                     com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
    this(new Builder(transport, jsonFactory, httpRequestInitializer));
  }

  /**
   * @param builder builder
   */
  UsuariosApi(Builder builder) {
    super(builder);
  }

  @Override
  protected void initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest<?> httpClientRequest) throws java.io.IOException {
    super.initialize(httpClientRequest);
  }

  /**
   * An accessor for creating requests from the User collection.
   *
   * <p>The typical use is:</p>
   * <pre>
   *   {@code UsuariosApi usuarios_api = new UsuariosApi(...);}
   *   {@code UsuariosApi.User.List request = usuarios_api.user().list(parameters ...)}
   * </pre>
   *
   * @return the resource collection
   */
  public User user() {
    return new User();
  }

  /**
   * The "user" collection of methods.
   */
  public class User {

    /**
     * Create a request for the method "user.update".
     *
     * This request holds the parameters needed by the usuarios_api server.  After setting any optional
     * parameters, call the {@link Update#execute()} method to invoke the remote operation.
     *
     * @param content the {@link com.usuarios_api.model.MessagesUserUpdate}
     * @return the request
     */
    public Update update(com.usuarios_api.model.MessagesUserUpdate content) throws java.io.IOException {
      Update result = new Update(content);
      initialize(result);
      return result;
    }

    public class Update extends UsuariosApiRequest<com.usuarios_api.model.MessagesCodeMessage> {

      private static final String REST_PATH = "user/update";

      /**
       * Create a request for the method "user.update".
       *
       * This request holds the parameters needed by the the usuarios_api server.  After setting any
       * optional parameters, call the {@link Update#execute()} method to invoke the remote operation.
       * <p> {@link
       * Update#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)} must
       * be called to initialize this instance immediately after invoking the constructor. </p>
       *
       * @param content the {@link com.usuarios_api.model.MessagesUserUpdate}
       * @since 1.13
       */
      protected Update(com.usuarios_api.model.MessagesUserUpdate content) {
        super(UsuariosApi.this, "POST", REST_PATH, content, com.usuarios_api.model.MessagesCodeMessage.class);
      }

      @Override
      public Update setAlt(java.lang.String alt) {
        return (Update) super.setAlt(alt);
      }

      @Override
      public Update setFields(java.lang.String fields) {
        return (Update) super.setFields(fields);
      }

      @Override
      public Update setKey(java.lang.String key) {
        return (Update) super.setKey(key);
      }

      @Override
      public Update setOauthToken(java.lang.String oauthToken) {
        return (Update) super.setOauthToken(oauthToken);
      }

      @Override
      public Update setPrettyPrint(java.lang.Boolean prettyPrint) {
        return (Update) super.setPrettyPrint(prettyPrint);
      }

      @Override
      public Update setQuotaUser(java.lang.String quotaUser) {
        return (Update) super.setQuotaUser(quotaUser);
      }

      @Override
      public Update setUserIp(java.lang.String userIp) {
        return (Update) super.setUserIp(userIp);
      }

      @Override
      public Update set(String parameterName, Object value) {
        return (Update) super.set(parameterName, value);
      }
    }

  }

  /**
   * An accessor for creating requests from the Users collection.
   *
   * <p>The typical use is:</p>
   * <pre>
   *   {@code UsuariosApi usuarios_api = new UsuariosApi(...);}
   *   {@code UsuariosApi.Users.List request = usuarios_api.users().list(parameters ...)}
   * </pre>
   *
   * @return the resource collection
   */
  public Users users() {
    return new Users();
  }

  /**
   * The "users" collection of methods.
   */
  public class Users {

    /**
     * Create a request for the method "users.get".
     *
     * This request holds the parameters needed by the usuarios_api server.  After setting any optional
     * parameters, call the {@link Get#execute()} method to invoke the remote operation.
     *
     * @param content the {@link com.usuarios_api.model.MessagesTokenKey}
     * @return the request
     */
    public Get get(com.usuarios_api.model.MessagesTokenKey content) throws java.io.IOException {
      Get result = new Get(content);
      initialize(result);
      return result;
    }

    public class Get extends UsuariosApiRequest<com.usuarios_api.model.MessagesUserList> {

      private static final String REST_PATH = "users/get";

      /**
       * Create a request for the method "users.get".
       *
       * This request holds the parameters needed by the the usuarios_api server.  After setting any
       * optional parameters, call the {@link Get#execute()} method to invoke the remote operation. <p>
       * {@link Get#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
       * must be called to initialize this instance immediately after invoking the constructor. </p>
       *
       * @param content the {@link com.usuarios_api.model.MessagesTokenKey}
       * @since 1.13
       */
      protected Get(com.usuarios_api.model.MessagesTokenKey content) {
        super(UsuariosApi.this, "POST", REST_PATH, content, com.usuarios_api.model.MessagesUserList.class);
      }

      @Override
      public Get setAlt(java.lang.String alt) {
        return (Get) super.setAlt(alt);
      }

      @Override
      public Get setFields(java.lang.String fields) {
        return (Get) super.setFields(fields);
      }

      @Override
      public Get setKey(java.lang.String key) {
        return (Get) super.setKey(key);
      }

      @Override
      public Get setOauthToken(java.lang.String oauthToken) {
        return (Get) super.setOauthToken(oauthToken);
      }

      @Override
      public Get setPrettyPrint(java.lang.Boolean prettyPrint) {
        return (Get) super.setPrettyPrint(prettyPrint);
      }

      @Override
      public Get setQuotaUser(java.lang.String quotaUser) {
        return (Get) super.setQuotaUser(quotaUser);
      }

      @Override
      public Get setUserIp(java.lang.String userIp) {
        return (Get) super.setUserIp(userIp);
      }

      @Override
      public Get set(String parameterName, Object value) {
        return (Get) super.set(parameterName, value);
      }
    }
    /**
     * Create a request for the method "users.login".
     *
     * This request holds the parameters needed by the usuarios_api server.  After setting any optional
     * parameters, call the {@link Login#execute()} method to invoke the remote operation.
     *
     * @param content the {@link com.usuarios_api.model.MessagesEmailPasswordMessage}
     * @return the request
     */
    public Login login(com.usuarios_api.model.MessagesEmailPasswordMessage content) throws java.io.IOException {
      Login result = new Login(content);
      initialize(result);
      return result;
    }

    public class Login extends UsuariosApiRequest<com.usuarios_api.model.MessagesTokenMessage> {

      private static final String REST_PATH = "users/login";

      /**
       * Create a request for the method "users.login".
       *
       * This request holds the parameters needed by the the usuarios_api server.  After setting any
       * optional parameters, call the {@link Login#execute()} method to invoke the remote operation.
       * <p> {@link
       * Login#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)} must
       * be called to initialize this instance immediately after invoking the constructor. </p>
       *
       * @param content the {@link com.usuarios_api.model.MessagesEmailPasswordMessage}
       * @since 1.13
       */
      protected Login(com.usuarios_api.model.MessagesEmailPasswordMessage content) {
        super(UsuariosApi.this, "POST", REST_PATH, content, com.usuarios_api.model.MessagesTokenMessage.class);
      }

      @Override
      public Login setAlt(java.lang.String alt) {
        return (Login) super.setAlt(alt);
      }

      @Override
      public Login setFields(java.lang.String fields) {
        return (Login) super.setFields(fields);
      }

      @Override
      public Login setKey(java.lang.String key) {
        return (Login) super.setKey(key);
      }

      @Override
      public Login setOauthToken(java.lang.String oauthToken) {
        return (Login) super.setOauthToken(oauthToken);
      }

      @Override
      public Login setPrettyPrint(java.lang.Boolean prettyPrint) {
        return (Login) super.setPrettyPrint(prettyPrint);
      }

      @Override
      public Login setQuotaUser(java.lang.String quotaUser) {
        return (Login) super.setQuotaUser(quotaUser);
      }

      @Override
      public Login setUserIp(java.lang.String userIp) {
        return (Login) super.setUserIp(userIp);
      }

      @Override
      public Login set(String parameterName, Object value) {
        return (Login) super.set(parameterName, value);
      }
    }

  }

  /**
   * Builder for {@link UsuariosApi}.
   *
   * <p>
   * Implementation is not thread-safe.
   * </p>
   *
   * @since 1.3.0
   */
  public static final class Builder extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient.Builder {

    /**
     * Returns an instance of a new builder.
     *
     * @param transport HTTP transport, which should normally be:
     *        <ul>
     *        <li>Google App Engine:
     *        {@code com.google.api.client.extensions.appengine.http.UrlFetchTransport}</li>
     *        <li>Android: {@code newCompatibleTransport} from
     *        {@code com.google.api.client.extensions.android.http.AndroidHttp}</li>
     *        <li>Java: {@link com.google.api.client.googleapis.javanet.GoogleNetHttpTransport#newTrustedTransport()}
     *        </li>
     *        </ul>
     * @param jsonFactory JSON factory, which may be:
     *        <ul>
     *        <li>Jackson: {@code com.google.api.client.json.jackson2.JacksonFactory}</li>
     *        <li>Google GSON: {@code com.google.api.client.json.gson.GsonFactory}</li>
     *        <li>Android Honeycomb or higher:
     *        {@code com.google.api.client.extensions.android.json.AndroidJsonFactory}</li>
     *        </ul>
     * @param httpRequestInitializer HTTP request initializer or {@code null} for none
     * @since 1.7
     */
    public Builder(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
                   com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
      super(
              transport,
              jsonFactory,
              DEFAULT_ROOT_URL,
              DEFAULT_SERVICE_PATH,
              httpRequestInitializer,
              false);
      //setBatchPath(DEFAULT_BATCH_PATH);
    }

    /** Builds a new instance of {@link UsuariosApi}. */
    @Override
    public UsuariosApi build() {
      return new UsuariosApi(this);
    }

    @Override
    public Builder setRootUrl(String rootUrl) {
      return (Builder) super.setRootUrl(rootUrl);
    }

    @Override
    public Builder setServicePath(String servicePath) {
      return (Builder) super.setServicePath(servicePath);
    }
/*
    @Override
    public Builder setBatchPath(String batchPath) {
      return (Builder) super.setBatchPath(batchPath);
    }*/

    @Override
    public Builder setHttpRequestInitializer(com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
      return (Builder) super.setHttpRequestInitializer(httpRequestInitializer);
    }

    @Override
    public Builder setApplicationName(String applicationName) {
      return (Builder) super.setApplicationName(applicationName);
    }

    @Override
    public Builder setSuppressPatternChecks(boolean suppressPatternChecks) {
      return (Builder) super.setSuppressPatternChecks(suppressPatternChecks);
    }

    @Override
    public Builder setSuppressRequiredParameterChecks(boolean suppressRequiredParameterChecks) {
      return (Builder) super.setSuppressRequiredParameterChecks(suppressRequiredParameterChecks);
    }

    @Override
    public Builder setSuppressAllChecks(boolean suppressAllChecks) {
      return (Builder) super.setSuppressAllChecks(suppressAllChecks);
    }

    /**
     * Set the {@link UsuariosApiRequestInitializer}.
     *
     * @since 1.12
     */
    public Builder setUsuariosApiRequestInitializer(
            UsuariosApiRequestInitializer usuariosapiRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(usuariosapiRequestInitializer);
    }

    @Override
    public Builder setGoogleClientRequestInitializer(
            com.google.api.client.googleapis.services.GoogleClientRequestInitializer googleClientRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(googleClientRequestInitializer);
    }
  }
}
