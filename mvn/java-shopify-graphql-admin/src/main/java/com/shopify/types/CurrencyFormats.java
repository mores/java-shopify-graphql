package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Currency formats configured for the merchant. These formats are available to use within Liquid.
 */
public class CurrencyFormats {
  /**
   * Money without currency in HTML.
   */
  private String moneyFormat;

  /**
   * Money without currency in emails.
   */
  private String moneyInEmailsFormat;

  /**
   * Money with currency in HTML.
   */
  private String moneyWithCurrencyFormat;

  /**
   * Money with currency in emails.
   */
  private String moneyWithCurrencyInEmailsFormat;

  public CurrencyFormats() {
  }

  /**
   * Money without currency in HTML.
   */
  public String getMoneyFormat() {
    return moneyFormat;
  }

  public void setMoneyFormat(String moneyFormat) {
    this.moneyFormat = moneyFormat;
  }

  /**
   * Money without currency in emails.
   */
  public String getMoneyInEmailsFormat() {
    return moneyInEmailsFormat;
  }

  public void setMoneyInEmailsFormat(String moneyInEmailsFormat) {
    this.moneyInEmailsFormat = moneyInEmailsFormat;
  }

  /**
   * Money with currency in HTML.
   */
  public String getMoneyWithCurrencyFormat() {
    return moneyWithCurrencyFormat;
  }

  public void setMoneyWithCurrencyFormat(String moneyWithCurrencyFormat) {
    this.moneyWithCurrencyFormat = moneyWithCurrencyFormat;
  }

  /**
   * Money with currency in emails.
   */
  public String getMoneyWithCurrencyInEmailsFormat() {
    return moneyWithCurrencyInEmailsFormat;
  }

  public void setMoneyWithCurrencyInEmailsFormat(String moneyWithCurrencyInEmailsFormat) {
    this.moneyWithCurrencyInEmailsFormat = moneyWithCurrencyInEmailsFormat;
  }

  @Override
  public String toString() {
    return "CurrencyFormats{moneyFormat='" + moneyFormat + "', moneyInEmailsFormat='" + moneyInEmailsFormat + "', moneyWithCurrencyFormat='" + moneyWithCurrencyFormat + "', moneyWithCurrencyInEmailsFormat='" + moneyWithCurrencyInEmailsFormat + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CurrencyFormats that = (CurrencyFormats) o;
    return Objects.equals(moneyFormat, that.moneyFormat) &&
        Objects.equals(moneyInEmailsFormat, that.moneyInEmailsFormat) &&
        Objects.equals(moneyWithCurrencyFormat, that.moneyWithCurrencyFormat) &&
        Objects.equals(moneyWithCurrencyInEmailsFormat, that.moneyWithCurrencyInEmailsFormat);
  }

  @Override
  public int hashCode() {
    return Objects.hash(moneyFormat, moneyInEmailsFormat, moneyWithCurrencyFormat, moneyWithCurrencyInEmailsFormat);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Money without currency in HTML.
     */
    private String moneyFormat;

    /**
     * Money without currency in emails.
     */
    private String moneyInEmailsFormat;

    /**
     * Money with currency in HTML.
     */
    private String moneyWithCurrencyFormat;

    /**
     * Money with currency in emails.
     */
    private String moneyWithCurrencyInEmailsFormat;

    public CurrencyFormats build() {
      CurrencyFormats result = new CurrencyFormats();
      result.moneyFormat = this.moneyFormat;
      result.moneyInEmailsFormat = this.moneyInEmailsFormat;
      result.moneyWithCurrencyFormat = this.moneyWithCurrencyFormat;
      result.moneyWithCurrencyInEmailsFormat = this.moneyWithCurrencyInEmailsFormat;
      return result;
    }

    /**
     * Money without currency in HTML.
     */
    public Builder moneyFormat(String moneyFormat) {
      this.moneyFormat = moneyFormat;
      return this;
    }

    /**
     * Money without currency in emails.
     */
    public Builder moneyInEmailsFormat(String moneyInEmailsFormat) {
      this.moneyInEmailsFormat = moneyInEmailsFormat;
      return this;
    }

    /**
     * Money with currency in HTML.
     */
    public Builder moneyWithCurrencyFormat(String moneyWithCurrencyFormat) {
      this.moneyWithCurrencyFormat = moneyWithCurrencyFormat;
      return this;
    }

    /**
     * Money with currency in emails.
     */
    public Builder moneyWithCurrencyInEmailsFormat(String moneyWithCurrencyInEmailsFormat) {
      this.moneyWithCurrencyInEmailsFormat = moneyWithCurrencyInEmailsFormat;
      return this;
    }
  }
}
