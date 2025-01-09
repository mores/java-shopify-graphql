package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields required to create a product feed.
 */
public class ProductFeedInput {
  /**
   * The language of the product feed.
   */
  private LanguageCode language;

  /**
   * The country of the product feed.
   */
  private CountryCode country;

  public ProductFeedInput() {
  }

  /**
   * The language of the product feed.
   */
  public LanguageCode getLanguage() {
    return language;
  }

  public void setLanguage(LanguageCode language) {
    this.language = language;
  }

  /**
   * The country of the product feed.
   */
  public CountryCode getCountry() {
    return country;
  }

  public void setCountry(CountryCode country) {
    this.country = country;
  }

  @Override
  public String toString() {
    return "ProductFeedInput{language='" + language + "', country='" + country + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ProductFeedInput that = (ProductFeedInput) o;
    return Objects.equals(language, that.language) &&
        Objects.equals(country, that.country);
  }

  @Override
  public int hashCode() {
    return Objects.hash(language, country);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The language of the product feed.
     */
    private LanguageCode language;

    /**
     * The country of the product feed.
     */
    private CountryCode country;

    public ProductFeedInput build() {
      ProductFeedInput result = new ProductFeedInput();
      result.language = this.language;
      result.country = this.country;
      return result;
    }

    /**
     * The language of the product feed.
     */
    public Builder language(LanguageCode language) {
      this.language = language;
      return this;
    }

    /**
     * The country of the product feed.
     */
    public Builder country(CountryCode country) {
      this.country = country;
      return this;
    }
  }
}
