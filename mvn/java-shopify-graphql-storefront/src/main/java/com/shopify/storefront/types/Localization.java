package com.shopify.storefront.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Information about the localized experiences configured for the shop.
 */
public class Localization {
  /**
   * The list of countries with enabled localized experiences.
   */
  private List<Country> availableCountries;

  /**
   * The list of languages available for the active country.
   */
  private List<Language> availableLanguages;

  /**
   * The country of the active localized experience. Use the `@inContext` directive to change this value.
   */
  private Country country;

  /**
   * The language of the active localized experience. Use the `@inContext` directive to change this value.
   */
  private Language language;

  /**
   * The market including the country of the active localized experience. Use the `@inContext` directive to change this value.
   */
  private Market market;

  public Localization() {
  }

  /**
   * The list of countries with enabled localized experiences.
   */
  public List<Country> getAvailableCountries() {
    return availableCountries;
  }

  public void setAvailableCountries(List<Country> availableCountries) {
    this.availableCountries = availableCountries;
  }

  /**
   * The list of languages available for the active country.
   */
  public List<Language> getAvailableLanguages() {
    return availableLanguages;
  }

  public void setAvailableLanguages(List<Language> availableLanguages) {
    this.availableLanguages = availableLanguages;
  }

  /**
   * The country of the active localized experience. Use the `@inContext` directive to change this value.
   */
  public Country getCountry() {
    return country;
  }

  public void setCountry(Country country) {
    this.country = country;
  }

  /**
   * The language of the active localized experience. Use the `@inContext` directive to change this value.
   */
  public Language getLanguage() {
    return language;
  }

  public void setLanguage(Language language) {
    this.language = language;
  }

  /**
   * The market including the country of the active localized experience. Use the `@inContext` directive to change this value.
   */
  public Market getMarket() {
    return market;
  }

  public void setMarket(Market market) {
    this.market = market;
  }

  @Override
  public String toString() {
    return "Localization{availableCountries='" + availableCountries + "', availableLanguages='" + availableLanguages + "', country='" + country + "', language='" + language + "', market='" + market + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Localization that = (Localization) o;
    return Objects.equals(availableCountries, that.availableCountries) &&
        Objects.equals(availableLanguages, that.availableLanguages) &&
        Objects.equals(country, that.country) &&
        Objects.equals(language, that.language) &&
        Objects.equals(market, that.market);
  }

  @Override
  public int hashCode() {
    return Objects.hash(availableCountries, availableLanguages, country, language, market);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The list of countries with enabled localized experiences.
     */
    private List<Country> availableCountries;

    /**
     * The list of languages available for the active country.
     */
    private List<Language> availableLanguages;

    /**
     * The country of the active localized experience. Use the `@inContext` directive to change this value.
     */
    private Country country;

    /**
     * The language of the active localized experience. Use the `@inContext` directive to change this value.
     */
    private Language language;

    /**
     * The market including the country of the active localized experience. Use the `@inContext` directive to change this value.
     */
    private Market market;

    public Localization build() {
      Localization result = new Localization();
      result.availableCountries = this.availableCountries;
      result.availableLanguages = this.availableLanguages;
      result.country = this.country;
      result.language = this.language;
      result.market = this.market;
      return result;
    }

    /**
     * The list of countries with enabled localized experiences.
     */
    public Builder availableCountries(List<Country> availableCountries) {
      this.availableCountries = availableCountries;
      return this;
    }

    /**
     * The list of languages available for the active country.
     */
    public Builder availableLanguages(List<Language> availableLanguages) {
      this.availableLanguages = availableLanguages;
      return this;
    }

    /**
     * The country of the active localized experience. Use the `@inContext` directive to change this value.
     */
    public Builder country(Country country) {
      this.country = country;
      return this;
    }

    /**
     * The language of the active localized experience. Use the `@inContext` directive to change this value.
     */
    public Builder language(Language language) {
      this.language = language;
      return this;
    }

    /**
     * The market including the country of the active localized experience. Use the `@inContext` directive to change this value.
     */
    public Builder market(Market market) {
      this.market = market;
      return this;
    }
  }
}
