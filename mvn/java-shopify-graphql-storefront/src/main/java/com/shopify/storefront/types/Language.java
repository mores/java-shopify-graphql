package com.shopify.storefront.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * A language available for a localized storefront experience. Provides the
 * language name in both its native form (endonym) and translated into the current
 * language, along with its [`LanguageCode`](https://shopify.dev/docs/api/storefront/current/enums/LanguageCode).
 *
 * Returned by the [`Localization`](https://shopify.dev/docs/api/storefront/current/objects/Localization)
 * and [`Country`](https://shopify.dev/docs/api/storefront/current/objects/Country)
 * objects to indicate available and active languages. Pass the `isoCode` to the [`@inContext`](https://shopify.dev/docs/storefronts/headless/building-with-the-storefront-api/in-context)
 * directive to retrieve translated content in that language.
 */
public class Language {
  /**
   * The name of the language in the language itself. If the language uses
   * capitalization, it is capitalized for a mid-sentence position.
   */
  private String endonymName;

  /**
   * The ISO code.
   */
  private LanguageCode isoCode;

  /**
   * The name of the language in the current language.
   */
  private String name;

  public Language() {
  }

  /**
   * The name of the language in the language itself. If the language uses
   * capitalization, it is capitalized for a mid-sentence position.
   */
  public String getEndonymName() {
    return endonymName;
  }

  public void setEndonymName(String endonymName) {
    this.endonymName = endonymName;
  }

  /**
   * The ISO code.
   */
  public LanguageCode getIsoCode() {
    return isoCode;
  }

  public void setIsoCode(LanguageCode isoCode) {
    this.isoCode = isoCode;
  }

  /**
   * The name of the language in the current language.
   */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "Language{endonymName='" + endonymName + "', isoCode='" + isoCode + "', name='" + name + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Language that = (Language) o;
    return Objects.equals(endonymName, that.endonymName) &&
        Objects.equals(isoCode, that.isoCode) &&
        Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endonymName, isoCode, name);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The name of the language in the language itself. If the language uses
     * capitalization, it is capitalized for a mid-sentence position.
     */
    private String endonymName;

    /**
     * The ISO code.
     */
    private LanguageCode isoCode;

    /**
     * The name of the language in the current language.
     */
    private String name;

    public Language build() {
      Language result = new Language();
      result.endonymName = this.endonymName;
      result.isoCode = this.isoCode;
      result.name = this.name;
      return result;
    }

    /**
     * The name of the language in the language itself. If the language uses
     * capitalization, it is capitalized for a mid-sentence position.
     */
    public Builder endonymName(String endonymName) {
      this.endonymName = endonymName;
      return this;
    }

    /**
     * The ISO code.
     */
    public Builder isoCode(LanguageCode isoCode) {
      this.isoCode = isoCode;
      return this;
    }

    /**
     * The name of the language in the current language.
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }
  }
}
