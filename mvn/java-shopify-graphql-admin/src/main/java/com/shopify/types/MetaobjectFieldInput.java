package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for a metaobject field value.
 */
public class MetaobjectFieldInput {
  /**
   * The key of the field.
   */
  private String key;

  /**
   * The value of the field.
   */
  private String value;

  public MetaobjectFieldInput() {
  }

  /**
   * The key of the field.
   */
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  /**
   * The value of the field.
   */
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return "MetaobjectFieldInput{key='" + key + "', value='" + value + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MetaobjectFieldInput that = (MetaobjectFieldInput) o;
    return Objects.equals(key, that.key) &&
        Objects.equals(value, that.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, value);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The key of the field.
     */
    private String key;

    /**
     * The value of the field.
     */
    private String value;

    public MetaobjectFieldInput build() {
      MetaobjectFieldInput result = new MetaobjectFieldInput();
      result.key = this.key;
      result.value = this.value;
      return result;
    }

    /**
     * The key of the field.
     */
    public Builder key(String key) {
      this.key = key;
      return this;
    }

    /**
     * The value of the field.
     */
    public Builder value(String value) {
      this.value = value;
      return this;
    }
  }
}
