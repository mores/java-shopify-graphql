package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The resolved values based on the markets configuration for a buyer signal.
 * Resolved values include the resolved catalogs, web presences, currency, and
 * price inclusivity.
 */
public class MarketsResolvedValues {
  /**
   * The resolved catalogs.
   */
  private MarketCatalogConnection catalogs;

  /**
   * The resolved currency code.
   */
  private CurrencyCode currencyCode;

  /**
   * The resolved price inclusivity attributes.
   */
  private ResolvedPriceInclusivity priceInclusivity;

  /**
   * The resolved web presences ordered by priority.
   */
  private MarketWebPresenceConnection webPresences;

  public MarketsResolvedValues() {
  }

  /**
   * The resolved catalogs.
   */
  public MarketCatalogConnection getCatalogs() {
    return catalogs;
  }

  public void setCatalogs(MarketCatalogConnection catalogs) {
    this.catalogs = catalogs;
  }

  /**
   * The resolved currency code.
   */
  public CurrencyCode getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(CurrencyCode currencyCode) {
    this.currencyCode = currencyCode;
  }

  /**
   * The resolved price inclusivity attributes.
   */
  public ResolvedPriceInclusivity getPriceInclusivity() {
    return priceInclusivity;
  }

  public void setPriceInclusivity(ResolvedPriceInclusivity priceInclusivity) {
    this.priceInclusivity = priceInclusivity;
  }

  /**
   * The resolved web presences ordered by priority.
   */
  public MarketWebPresenceConnection getWebPresences() {
    return webPresences;
  }

  public void setWebPresences(MarketWebPresenceConnection webPresences) {
    this.webPresences = webPresences;
  }

  @Override
  public String toString() {
    return "MarketsResolvedValues{catalogs='" + catalogs + "', currencyCode='" + currencyCode + "', priceInclusivity='" + priceInclusivity + "', webPresences='" + webPresences + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MarketsResolvedValues that = (MarketsResolvedValues) o;
    return Objects.equals(catalogs, that.catalogs) &&
        Objects.equals(currencyCode, that.currencyCode) &&
        Objects.equals(priceInclusivity, that.priceInclusivity) &&
        Objects.equals(webPresences, that.webPresences);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalogs, currencyCode, priceInclusivity, webPresences);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The resolved catalogs.
     */
    private MarketCatalogConnection catalogs;

    /**
     * The resolved currency code.
     */
    private CurrencyCode currencyCode;

    /**
     * The resolved price inclusivity attributes.
     */
    private ResolvedPriceInclusivity priceInclusivity;

    /**
     * The resolved web presences ordered by priority.
     */
    private MarketWebPresenceConnection webPresences;

    public MarketsResolvedValues build() {
      MarketsResolvedValues result = new MarketsResolvedValues();
      result.catalogs = this.catalogs;
      result.currencyCode = this.currencyCode;
      result.priceInclusivity = this.priceInclusivity;
      result.webPresences = this.webPresences;
      return result;
    }

    /**
     * The resolved catalogs.
     */
    public Builder catalogs(MarketCatalogConnection catalogs) {
      this.catalogs = catalogs;
      return this;
    }

    /**
     * The resolved currency code.
     */
    public Builder currencyCode(CurrencyCode currencyCode) {
      this.currencyCode = currencyCode;
      return this;
    }

    /**
     * The resolved price inclusivity attributes.
     */
    public Builder priceInclusivity(ResolvedPriceInclusivity priceInclusivity) {
      this.priceInclusivity = priceInclusivity;
      return this;
    }

    /**
     * The resolved web presences ordered by priority.
     */
    public Builder webPresences(MarketWebPresenceConnection webPresences) {
      this.webPresences = webPresences;
      return this;
    }
  }
}
