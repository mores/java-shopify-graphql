package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * The input fields required to link a product option to a metafield.
 */
public class LinkedMetafieldCreateInput {
  /**
   * The namespace of the metafield this option is linked to.
   */
  private String namespace;

  /**
   * The key of the metafield this option is linked to.
   */
  private String key;

  /**
   * Values associated with the option.
   */
  private List<String> values;

  public LinkedMetafieldCreateInput() {
  }

  /**
   * The namespace of the metafield this option is linked to.
   */
  public String getNamespace() {
    return namespace;
  }

  public void setNamespace(String namespace) {
    this.namespace = namespace;
  }

  /**
   * The key of the metafield this option is linked to.
   */
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  /**
   * Values associated with the option.
   */
  public List<String> getValues() {
    return values;
  }

  public void setValues(List<String> values) {
    this.values = values;
  }

  @Override
  public String toString() {
    return "LinkedMetafieldCreateInput{namespace='" + namespace + "', key='" + key + "', values='" + values + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    LinkedMetafieldCreateInput that = (LinkedMetafieldCreateInput) o;
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
     * The namespace of the metafield this option is linked to.
     */
    private String namespace;

    /**
     * The key of the metafield this option is linked to.
     */
    private String key;

    /**
     * Values associated with the option.
     */
    private List<String> values;

    public LinkedMetafieldCreateInput build() {
      LinkedMetafieldCreateInput result = new LinkedMetafieldCreateInput();
      result.namespace = this.namespace;
      result.key = this.key;
      result.values = this.values;
      return result;
    }

    /**
     * The namespace of the metafield this option is linked to.
     */
    public Builder namespace(String namespace) {
      this.namespace = namespace;
      return this;
    }

    /**
     * The key of the metafield this option is linked to.
     */
    public Builder key(String key) {
      this.key = key;
      return this;
    }

    /**
     * Values associated with the option.
     */
    public Builder values(List<String> values) {
      this.values = values;
      return this;
    }
  }
}
