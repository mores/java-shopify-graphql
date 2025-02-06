package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * The input fields for linking a combined listing option to a metafield.
 */
public class LinkedMetafieldInput {
  /**
   * The namespace of the linked metafield.
   */
  private String namespace;

  /**
   * The key of the linked metafield.
   */
  private String key;

  /**
   * The values of the linked metafield.
   */
  private List<String> values;

  public LinkedMetafieldInput() {
  }

  /**
   * The namespace of the linked metafield.
   */
  public String getNamespace() {
    return namespace;
  }

  public void setNamespace(String namespace) {
    this.namespace = namespace;
  }

  /**
   * The key of the linked metafield.
   */
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  /**
   * The values of the linked metafield.
   */
  public List<String> getValues() {
    return values;
  }

  public void setValues(List<String> values) {
    this.values = values;
  }

  @Override
  public String toString() {
    return "LinkedMetafieldInput{namespace='" + namespace + "', key='" + key + "', values='" + values + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    LinkedMetafieldInput that = (LinkedMetafieldInput) o;
    return Objects.equals(namespace, that.namespace) &&
        Objects.equals(key, that.key) &&
        Objects.equals(values, that.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(namespace, key, values);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The namespace of the linked metafield.
     */
    private String namespace;

    /**
     * The key of the linked metafield.
     */
    private String key;

    /**
     * The values of the linked metafield.
     */
    private List<String> values;

    public LinkedMetafieldInput build() {
      LinkedMetafieldInput result = new LinkedMetafieldInput();
      result.namespace = this.namespace;
      result.key = this.key;
      result.values = this.values;
      return result;
    }

    /**
     * The namespace of the linked metafield.
     */
    public Builder namespace(String namespace) {
      this.namespace = namespace;
      return this;
    }

    /**
     * The key of the linked metafield.
     */
    public Builder key(String key) {
      this.key = key;
      return this;
    }

    /**
     * The values of the linked metafield.
     */
    public Builder values(List<String> values) {
      this.values = values;
      return this;
    }
  }
}
