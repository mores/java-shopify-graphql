package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for a LocalizedFieldInput.
 */
public class LocalizedFieldInput {
  /**
   * The key for the localized field.
   */
  private LocalizedFieldKey key;

  /**
   * The localized field value.
   */
  private String value;

  public LocalizedFieldInput() {
  }

  /**
   * The key for the localized field.
   */
  public LocalizedFieldKey getKey() {
    return key;
  }

  public void setKey(LocalizedFieldKey key) {
    this.key = key;
  }

  /**
   * The localized field value.
   */
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return "LocalizedFieldInput{key='" + key + "', value='" + value + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    LocalizedFieldInput that = (LocalizedFieldInput) o;
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
     * The key for the localized field.
     */
    private LocalizedFieldKey key;

    /**
     * The localized field value.
     */
    private String value;

    public LocalizedFieldInput build() {
      LocalizedFieldInput result = new LocalizedFieldInput();
      result.key = this.key;
      result.value = this.value;
      return result;
    }

    /**
     * The key for the localized field.
     */
    public Builder key(LocalizedFieldKey key) {
      this.key = key;
      return this;
    }

    /**
     * The localized field value.
     */
    public Builder value(String value) {
      this.value = value;
      return this;
    }
  }
}
