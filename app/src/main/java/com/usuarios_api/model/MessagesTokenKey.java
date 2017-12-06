/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/google/apis-client-generator/
 * (build: 2017-11-07 19:12:12 UTC)
 * on 2017-11-08 at 19:35:32 UTC 
 * Modify at your own risk.
 */

package com.usuarios_api.model;

/**
 * Model definition for MessagesTokenKey.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the usuarios_api. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class MessagesTokenKey extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String entityKey;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String tokenint;

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getEntityKey() {
    return entityKey;
  }

  /**
   * @param entityKey entityKey or {@code null} for none
   */
  public MessagesTokenKey setEntityKey(java.lang.String entityKey) {
    this.entityKey = entityKey;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getTokenint() {
    return tokenint;
  }

  /**
   * @param tokenint tokenint or {@code null} for none
   */
  public MessagesTokenKey setTokenint(java.lang.String tokenint) {
    this.tokenint = tokenint;
    return this;
  }

  @Override
  public MessagesTokenKey set(String fieldName, Object value) {
    return (MessagesTokenKey) super.set(fieldName, value);
  }

  @Override
  public MessagesTokenKey clone() {
    return (MessagesTokenKey) super.clone();
  }

}
