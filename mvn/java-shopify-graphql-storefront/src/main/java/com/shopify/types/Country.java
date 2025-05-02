package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * A country.
 */
public class Country {
  /**
   * The languages available for the country.
   */
  private List<Language> availableLanguages;

  /**
   * The currency of the country.
   */
  private Currency currency;

  /**
   * The ISO code of the country.
   */
  private CountryCode isoCode;

  /**
   * The market that includes this country.
   */
  private Market market;

  /**
   * The name of the country.
   */
  private String name;

  /**
   * The unit system used in the country.
   */
  private UnitSystem unitSystem;

  public Country() {
  }

  /**
   * The languages available for the country.
   */
  public List<Language> getAvailableLanguages() {
    return availableLanguages;
  }

  public void setAvailableLanguages(List<Language> availableLanguages) {
    this.availableLanguages = availableLanguages;
  }

  /**
   * The currency of the country.
   */
  public Currency getCurrency() {
    return currency;
  }

  public void setCurrency(Currency currency) {
    this.currency = currency;
  }

  /**
   * The ISO code of the country.
   */
  public CountryCode getIsoCode() {
    return isoCode;
  }

  public void setIsoCode(CountryCode isoCode) {
    this.isoCode = isoCode;
  }

  /**
   * The market that includes this country.
   */
  public Market getMarket() {
    return market;
  }

  public void setMarket(Market market) {
    this.market = market;
  }

  /**
   * The name of the country.
   */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  /**
   * The unit system used in the country.
   */
  public UnitSystem getUnitSystem() {
    return unitSystem;
  }

  public void setUnitSystem(UnitSystem unitSystem) {
    this.unitSystem = unitSystem;
  }

  @Override
  public String toString() {
    return "Country{availableLanguages='" + availableLanguages + "', currency='" + currency + "', isoCode='" + isoCode + "', market='" + market + "', name='" + name + "', unitSystem='" + unitSystem + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Country that = (Country) o;
    return Objects.equals(availableLanguages, that.availableLanguages) &&
        Objects.equals(currency, that.currency) &&
        Objects.equals(isoCode, that.isoCode) &&
        Objects.equals(market, that.market) &&
        Objects.equals(name, that.name) &&
        Objects.equals(unitSystem, that.unitSystem);
  }

  @Override
  public int hashCode() {
    return Objects.hash(availableLanguages, currency, isoCode, market, name, unitSystem);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The languages available for the country.
     */
    private List<Language> availableLanguages;

    /**
     * The currency of the country.
     */
    private Currency currency;

    /**
     * The ISO code of the country.
     */
    private CountryCode isoCode;

    /**
     * The market that includes this country.
     */
    private Market market;

    /**
     * The name of the country.
     */
    private String name;

    /**
     * The unit system used in the country.
     */
    private UnitSystem unitSystem;

    public Country build() {
      Country result = new Country();
      result.availableLanguages = this.availableLanguages;
      result.currency = this.currency;
      result.isoCode = this.isoCode;
      result.market = this.market;
      result.name = this.name;
      result.unitSystem = this.unitSystem;
      return result;
    }

    /**
     * The languages available for the country.
     */
    public Builder availableLanguages(List<Language> availableLanguages) {
      this.availableLanguages = availableLanguages;
      return this;
    }

    /**
     * The currency of the country.
     */
    public Builder currency(Currency currency) {
      this.currency = currency;
      return this;
    }

    /**
     * The ISO code of the country.
     */
    public Builder isoCode(CountryCode isoCode) {
      this.isoCode = isoCode;
      return this;
    }

    /**
     * The market that includes this country.
     */
    public Builder market(Market market) {
      this.market = market;
      return this;
    }

    /**
     * The name of the country.
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * The unit system used in the country.
     */
    public Builder unitSystem(UnitSystem unitSystem) {
      this.unitSystem = unitSystem;
      return this;
    }
  }
}
