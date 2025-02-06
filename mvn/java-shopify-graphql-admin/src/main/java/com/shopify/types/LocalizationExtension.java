package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Represents the value captured by a localization extension. Localization
 * extensions are additional fields required by certain countries on international
 * orders. For example, some countries require additional fields for customs
 * information or tax identification numbers.
 */
public class LocalizationExtension {
  /**
   * Country ISO 3166-1 alpha-2 code.
   */
  private CountryCode countryCode;

  /**
   * The localized extension keys that are allowed.
   */
  private LocalizationExtensionKey key;

  /**
   * The purpose of this localization extension.
   */
  private LocalizationExtensionPurpose purpose;

  /**
   * The localized extension title.
   */
  private String title;

  /**
   * The value of the field.
   */
  private String value;

  public LocalizationExtension() {
  }

  /**
   * Country ISO 3166-1 alpha-2 code.
   */
  public CountryCode getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(CountryCode countryCode) {
    this.countryCode = countryCode;
  }

  /**
   * The localized extension keys that are allowed.
   */
  public LocalizationExtensionKey getKey() {
    return key;
  }

  public void setKey(LocalizationExtensionKey key) {
    this.key = key;
  }

  /**
   * The purpose of this localization extension.
   */
  public LocalizationExtensionPurpose getPurpose() {
    return purpose;
  }

  public void setPurpose(LocalizationExtensionPurpose purpose) {
    this.purpose = purpose;
  }

  /**
   * The localized extension title.
   */
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
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
    return "LocalizationExtension{countryCode='" + countryCode + "', key='" + key + "', purpose='" + purpose + "', title='" + title + "', value='" + value + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    LocalizationExtension that = (LocalizationExtension) o;
    return Objects.equals(countryCode, that.countryCode) &&
        Objects.equals(key, that.key) &&
        Objects.equals(purpose, that.purpose) &&
        Objects.equals(title, that.title) &&
        Objects.equals(value, that.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(countryCode, key, purpose, title, value);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Country ISO 3166-1 alpha-2 code.
     */
    private CountryCode countryCode;

    /**
     * The localized extension keys that are allowed.
     */
    private LocalizationExtensionKey key;

    /**
     * The purpose of this localization extension.
     */
    private LocalizationExtensionPurpose purpose;

    /**
     * The localized extension title.
     */
    private String title;

    /**
     * The value of the field.
     */
    private String value;

    public LocalizationExtension build() {
      LocalizationExtension result = new LocalizationExtension();
      result.countryCode = this.countryCode;
      result.key = this.key;
      result.purpose = this.purpose;
      result.title = this.title;
      result.value = this.value;
      return result;
    }

    /**
     * Country ISO 3166-1 alpha-2 code.
     */
    public Builder countryCode(CountryCode countryCode) {
      this.countryCode = countryCode;
      return this;
    }

    /**
     * The localized extension keys that are allowed.
     */
    public Builder key(LocalizationExtensionKey key) {
      this.key = key;
      return this;
    }

    /**
     * The purpose of this localization extension.
     */
    public Builder purpose(LocalizationExtensionPurpose purpose) {
      this.purpose = purpose;
      return this;
    }

    /**
     * The localized extension title.
     */
    public Builder title(String title) {
      this.title = title;
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
