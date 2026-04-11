package com.shopify.storefront.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Translation represents a translation of a key-value pair.
 */
public class Translation {
  /**
   * The key of the translation.
   */
  private String key;

  /**
   * The value of the translation.
   */
  private String value;

  public Translation() {
  }

  /**
   * The key of the translation.
   */
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  /**
   * The value of the translation.
   */
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return "Translation{key='" + key + "', value='" + value + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Translation that = (Translation) o;
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
     * The key of the translation.
     */
    private String key;

    /**
     * The value of the translation.
     */
    private String value;

    public Translation build() {
      Translation result = new Translation();
      result.key = this.key;
      result.value = this.value;
      return result;
    }

    /**
     * The key of the translation.
     */
    public Builder key(String key) {
      this.key = key;
      return this;
    }

    /**
     * The value of the translation.
     */
    public Builder value(String value) {
      this.value = value;
      return this;
    }
  }
}
