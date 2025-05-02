package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * A currency.
 */
public class Currency {
  /**
   * The ISO code of the currency.
   */
  private CurrencyCode isoCode;

  /**
   * The name of the currency.
   */
  private String name;

  /**
   * The symbol of the currency.
   */
  private String symbol;

  public Currency() {
  }

  /**
   * The ISO code of the currency.
   */
  public CurrencyCode getIsoCode() {
    return isoCode;
  }

  public void setIsoCode(CurrencyCode isoCode) {
    this.isoCode = isoCode;
  }

  /**
   * The name of the currency.
   */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  /**
   * The symbol of the currency.
   */
  public String getSymbol() {
    return symbol;
  }

  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }

  @Override
  public String toString() {
    return "Currency{isoCode='" + isoCode + "', name='" + name + "', symbol='" + symbol + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Currency that = (Currency) o;
    return Objects.equals(isoCode, that.isoCode) &&
        Objects.equals(name, that.name) &&
        Objects.equals(symbol, that.symbol);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isoCode, name, symbol);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The ISO code of the currency.
     */
    private CurrencyCode isoCode;

    /**
     * The name of the currency.
     */
    private String name;

    /**
     * The symbol of the currency.
     */
    private String symbol;

    public Currency build() {
      Currency result = new Currency();
      result.isoCode = this.isoCode;
      result.name = this.name;
      result.symbol = this.symbol;
      return result;
    }

    /**
     * The ISO code of the currency.
     */
    public Builder isoCode(CurrencyCode isoCode) {
      this.isoCode = isoCode;
      return this;
    }

    /**
     * The name of the currency.
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * The symbol of the currency.
     */
    public Builder symbol(String symbol) {
      this.symbol = symbol;
      return this;
    }
  }
}
