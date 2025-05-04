package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Represents the value captured by a localized field. Localized fields are
 * additional fields required by certain countries on international orders. For
 * example, some countries require additional fields for customs information or tax
 * identification numbers.
 */
public class LocalizedField {
  /**
   * Country ISO 3166-1 alpha-2 code.
   */
  private CountryCode countryCode;

  /**
   * The localized field keys that are allowed.
   */
  private LocalizedFieldKey key;

  /**
   * The purpose of this localized field.
   */
  private LocalizedFieldPurpose purpose;

  /**
   * The localized field title.
   */
  private String title;

  /**
   * The value of the field.
   */
  private String value;

  public LocalizedField() {
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
   * The localized field keys that are allowed.
   */
  public LocalizedFieldKey getKey() {
    return key;
  }

  public void setKey(LocalizedFieldKey key) {
    this.key = key;
  }

  /**
   * The purpose of this localized field.
   */
  public LocalizedFieldPurpose getPurpose() {
    return purpose;
  }

  public void setPurpose(LocalizedFieldPurpose purpose) {
    this.purpose = purpose;
  }

  /**
   * The localized field title.
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
    return "LocalizedField{countryCode='" + countryCode + "', key='" + key + "', purpose='" + purpose + "', title='" + title + "', value='" + value + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    LocalizedField that = (LocalizedField) o;
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
     * The localized field keys that are allowed.
     */
    private LocalizedFieldKey key;

    /**
     * The purpose of this localized field.
     */
    private LocalizedFieldPurpose purpose;

    /**
     * The localized field title.
     */
    private String title;

    /**
     * The value of the field.
     */
    private String value;

    public LocalizedField build() {
      LocalizedField result = new LocalizedField();
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
     * The localized field keys that are allowed.
     */
    public Builder key(LocalizedFieldKey key) {
      this.key = key;
      return this;
    }

    /**
     * The purpose of this localized field.
     */
    public Builder purpose(LocalizedFieldPurpose purpose) {
      this.purpose = purpose;
      return this;
    }

    /**
     * The localized field title.
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
