package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Identifies metafields by their namespace, and key.
 */
public class WebhookSubscriptionMetafieldIdentifier {
  /**
   * The unique identifier for the metafield definition within its namespace.
   */
  private String key;

  /**
   * The container for a group of metafields that the metafield definition is associated with.
   */
  private String namespace;

  public WebhookSubscriptionMetafieldIdentifier() {
  }

  /**
   * The unique identifier for the metafield definition within its namespace.
   */
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  /**
   * The container for a group of metafields that the metafield definition is associated with.
   */
  public String getNamespace() {
    return namespace;
  }

  public void setNamespace(String namespace) {
    this.namespace = namespace;
  }

  @Override
  public String toString() {
    return "WebhookSubscriptionMetafieldIdentifier{key='" + key + "', namespace='" + namespace + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    WebhookSubscriptionMetafieldIdentifier that = (WebhookSubscriptionMetafieldIdentifier) o;
    return Objects.equals(key, that.key) &&
        Objects.equals(namespace, that.namespace);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, namespace);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The unique identifier for the metafield definition within its namespace.
     */
    private String key;

    /**
     * The container for a group of metafields that the metafield definition is associated with.
     */
    private String namespace;

    public WebhookSubscriptionMetafieldIdentifier build() {
      WebhookSubscriptionMetafieldIdentifier result = new WebhookSubscriptionMetafieldIdentifier();
      result.key = this.key;
      result.namespace = this.namespace;
      return result;
    }

    /**
     * The unique identifier for the metafield definition within its namespace.
     */
    public Builder key(String key) {
      this.key = key;
      return this;
    }

    /**
     * The container for a group of metafields that the metafield definition is associated with.
     */
    public Builder namespace(String namespace) {
      this.namespace = namespace;
      return this;
    }
  }
}
