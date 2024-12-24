package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class CurrencyFormats {
  
  private String moneyFormat;

  
  private String moneyInEmailsFormat;

  
  private String moneyWithCurrencyFormat;

  
  private String moneyWithCurrencyInEmailsFormat;

  public CurrencyFormats() {
  }

  
  public String getMoneyFormat() {
    return moneyFormat;
  }

  public void setMoneyFormat(String moneyFormat) {
    this.moneyFormat = moneyFormat;
  }

  
  public String getMoneyInEmailsFormat() {
    return moneyInEmailsFormat;
  }

  public void setMoneyInEmailsFormat(String moneyInEmailsFormat) {
    this.moneyInEmailsFormat = moneyInEmailsFormat;
  }

  
  public String getMoneyWithCurrencyFormat() {
    return moneyWithCurrencyFormat;
  }

  public void setMoneyWithCurrencyFormat(String moneyWithCurrencyFormat) {
    this.moneyWithCurrencyFormat = moneyWithCurrencyFormat;
  }

  
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
    
    private String moneyFormat;

    
    private String moneyInEmailsFormat;

    
    private String moneyWithCurrencyFormat;

    
    private String moneyWithCurrencyInEmailsFormat;

    public CurrencyFormats build() {
      CurrencyFormats result = new CurrencyFormats();
      result.moneyFormat = this.moneyFormat;
      result.moneyInEmailsFormat = this.moneyInEmailsFormat;
      result.moneyWithCurrencyFormat = this.moneyWithCurrencyFormat;
      result.moneyWithCurrencyInEmailsFormat = this.moneyWithCurrencyInEmailsFormat;
      return result;
    }

    
    public Builder moneyFormat(String moneyFormat) {
      this.moneyFormat = moneyFormat;
      return this;
    }

    
    public Builder moneyInEmailsFormat(String moneyInEmailsFormat) {
      this.moneyInEmailsFormat = moneyInEmailsFormat;
      return this;
    }

    
    public Builder moneyWithCurrencyFormat(String moneyWithCurrencyFormat) {
      this.moneyWithCurrencyFormat = moneyWithCurrencyFormat;
      return this;
    }

    
    public Builder moneyWithCurrencyInEmailsFormat(String moneyWithCurrencyInEmailsFormat) {
      this.moneyWithCurrencyInEmailsFormat = moneyWithCurrencyInEmailsFormat;
      return this;
    }
  }
}
