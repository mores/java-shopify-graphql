package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class DomainLocalization {
  
  private List<String> alternateLocales;

  
  private String country;

  
  private String defaultLocale;

  public DomainLocalization() {
  }

  
  public List<String> getAlternateLocales() {
    return alternateLocales;
  }

  public void setAlternateLocales(List<String> alternateLocales) {
    this.alternateLocales = alternateLocales;
  }

  
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  
  public String getDefaultLocale() {
    return defaultLocale;
  }

  public void setDefaultLocale(String defaultLocale) {
    this.defaultLocale = defaultLocale;
  }

  @Override
  public String toString() {
    return "DomainLocalization{alternateLocales='" + alternateLocales + "', country='" + country + "', defaultLocale='" + defaultLocale + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DomainLocalization that = (DomainLocalization) o;
    return Objects.equals(alternateLocales, that.alternateLocales) &&
        Objects.equals(country, that.country) &&
        Objects.equals(defaultLocale, that.defaultLocale);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alternateLocales, country, defaultLocale);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private List<String> alternateLocales;

    
    private String country;

    
    private String defaultLocale;

    public DomainLocalization build() {
      DomainLocalization result = new DomainLocalization();
      result.alternateLocales = this.alternateLocales;
      result.country = this.country;
      result.defaultLocale = this.defaultLocale;
      return result;
    }

    
    public Builder alternateLocales(List<String> alternateLocales) {
      this.alternateLocales = alternateLocales;
      return this;
    }

    
    public Builder country(String country) {
      this.country = country;
      return this;
    }

    
    public Builder defaultLocale(String defaultLocale) {
      this.defaultLocale = defaultLocale;
      return this;
    }
  }
}
