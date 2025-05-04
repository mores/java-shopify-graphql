package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Represents a typed custom attribute.
 */
public class TypedAttribute {
  /**
   * Key or name of the attribute.
   */
  private String key;

  /**
   * Value of the attribute.
   */
  private String value;

  public TypedAttribute() {
  }

  /**
   * Key or name of the attribute.
   */
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  /**
   * Value of the attribute.
   */
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return "TypedAttribute{key='" + key + "', value='" + value + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    TypedAttribute that = (TypedAttribute) o;
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
     * Key or name of the attribute.
     */
    private String key;

    /**
     * Value of the attribute.
     */
    private String value;

    public TypedAttribute build() {
      TypedAttribute result = new TypedAttribute();
      result.key = this.key;
      result.value = this.value;
      return result;
    }

    /**
     * Key or name of the attribute.
     */
    public Builder key(String key) {
      this.key = key;
      return this;
    }

    /**
     * Value of the attribute.
     */
    public Builder value(String value) {
      this.value = value;
      return this;
    }
  }
}
