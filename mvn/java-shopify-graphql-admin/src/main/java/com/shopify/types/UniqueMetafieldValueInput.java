package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields that identify a unique valued metafield.
 */
public class UniqueMetafieldValueInput {
  /**
   * The container the metafield belongs to. If omitted, the app-reserved namespace will be used.
   */
  private String namespace;

  /**
   * The key for the metafield.
   */
  private String key;

  /**
   * The value of the metafield.
   */
  private String value;

  public UniqueMetafieldValueInput() {
  }

  /**
   * The container the metafield belongs to. If omitted, the app-reserved namespace will be used.
   */
  public String getNamespace() {
    return namespace;
  }

  public void setNamespace(String namespace) {
    this.namespace = namespace;
  }

  /**
   * The key for the metafield.
   */
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  /**
   * The value of the metafield.
   */
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return "UniqueMetafieldValueInput{namespace='" + namespace + "', key='" + key + "', value='" + value + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UniqueMetafieldValueInput that = (UniqueMetafieldValueInput) o;
    return Objects.equals(namespace, that.namespace) &&
        Objects.equals(key, that.key) &&
        Objects.equals(value, that.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(namespace, key, value);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The container the metafield belongs to. If omitted, the app-reserved namespace will be used.
     */
    private String namespace;

    /**
     * The key for the metafield.
     */
    private String key;

    /**
     * The value of the metafield.
     */
    private String value;

    public UniqueMetafieldValueInput build() {
      UniqueMetafieldValueInput result = new UniqueMetafieldValueInput();
      result.namespace = this.namespace;
      result.key = this.key;
      result.value = this.value;
      return result;
    }

    /**
     * The container the metafield belongs to. If omitted, the app-reserved namespace will be used.
     */
    public Builder namespace(String namespace) {
      this.namespace = namespace;
      return this;
    }

    /**
     * The key for the metafield.
     */
    public Builder key(String key) {
      this.key = key;
      return this;
    }

    /**
     * The value of the metafield.
     */
    public Builder value(String value) {
      this.value = value;
      return this;
    }
  }
}
