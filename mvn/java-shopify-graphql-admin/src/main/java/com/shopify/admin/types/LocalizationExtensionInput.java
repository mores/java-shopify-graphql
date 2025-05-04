package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for a LocalizationExtensionInput.
 */
public class LocalizationExtensionInput {
  /**
   * The key for the localization extension.
   */
  private LocalizationExtensionKey key;

  /**
   * The localization extension value.
   */
  private String value;

  public LocalizationExtensionInput() {
  }

  /**
   * The key for the localization extension.
   */
  public LocalizationExtensionKey getKey() {
    return key;
  }

  public void setKey(LocalizationExtensionKey key) {
    this.key = key;
  }

  /**
   * The localization extension value.
   */
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return "LocalizationExtensionInput{key='" + key + "', value='" + value + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    LocalizationExtensionInput that = (LocalizationExtensionInput) o;
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
     * The key for the localization extension.
     */
    private LocalizationExtensionKey key;

    /**
     * The localization extension value.
     */
    private String value;

    public LocalizationExtensionInput build() {
      LocalizationExtensionInput result = new LocalizationExtensionInput();
      result.key = this.key;
      result.value = this.value;
      return result;
    }

    /**
     * The key for the localization extension.
     */
    public Builder key(LocalizationExtensionKey key) {
      this.key = key;
      return this;
    }

    /**
     * The localization extension value.
     */
    public Builder value(String value) {
      this.value = value;
      return this;
    }
  }
}
