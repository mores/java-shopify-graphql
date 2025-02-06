package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * The country and language settings assigned to a domain.
 */
public class DomainLocalization {
  /**
   * The ISO codes for the domain’s alternate locales. For example, `["en"]`.
   */
  private List<String> alternateLocales;

  /**
   * The ISO code for the country assigned to the domain. For example, `"CA"` or "*" for a domain set to "Rest of world".
   */
  private String country;

  /**
   * The ISO code for the domain’s default locale. For example, `"en"`.
   */
  private String defaultLocale;

  public DomainLocalization() {
  }

  /**
   * The ISO codes for the domain’s alternate locales. For example, `["en"]`.
   */
  public List<String> getAlternateLocales() {
    return alternateLocales;
  }

  public void setAlternateLocales(List<String> alternateLocales) {
    this.alternateLocales = alternateLocales;
  }

  /**
   * The ISO code for the country assigned to the domain. For example, `"CA"` or "*" for a domain set to "Rest of world".
   */
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  /**
   * The ISO code for the domain’s default locale. For example, `"en"`.
   */
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
    /**
     * The ISO codes for the domain’s alternate locales. For example, `["en"]`.
     */
    private List<String> alternateLocales;

    /**
     * The ISO code for the country assigned to the domain. For example, `"CA"` or "*" for a domain set to "Rest of world".
     */
    private String country;

    /**
     * The ISO code for the domain’s default locale. For example, `"en"`.
     */
    private String defaultLocale;

    public DomainLocalization build() {
      DomainLocalization result = new DomainLocalization();
      result.alternateLocales = this.alternateLocales;
      result.country = this.country;
      result.defaultLocale = this.defaultLocale;
      return result;
    }

    /**
     * The ISO codes for the domain’s alternate locales. For example, `["en"]`.
     */
    public Builder alternateLocales(List<String> alternateLocales) {
      this.alternateLocales = alternateLocales;
      return this;
    }

    /**
     * The ISO code for the country assigned to the domain. For example, `"CA"` or "*" for a domain set to "Rest of world".
     */
    public Builder country(String country) {
      this.country = country;
      return this;
    }

    /**
     * The ISO code for the domain’s default locale. For example, `"en"`.
     */
    public Builder defaultLocale(String defaultLocale) {
      this.defaultLocale = defaultLocale;
      return this;
    }
  }
}
