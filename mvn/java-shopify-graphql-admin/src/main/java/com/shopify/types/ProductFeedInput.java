package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class ProductFeedInput {
  
  private LanguageCode language;

  
  private CountryCode country;

  public ProductFeedInput() {
  }

  
  public LanguageCode getLanguage() {
    return language;
  }

  public void setLanguage(LanguageCode language) {
    this.language = language;
  }

  
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
    
    private LanguageCode language;

    
    private CountryCode country;

    public ProductFeedInput build() {
      ProductFeedInput result = new ProductFeedInput();
      result.language = this.language;
      result.country = this.country;
      return result;
    }

    
    public Builder language(LanguageCode language) {
      this.language = language;
      return this;
    }

    
    public Builder country(CountryCode country) {
      this.country = country;
      return this;
    }
  }
}
