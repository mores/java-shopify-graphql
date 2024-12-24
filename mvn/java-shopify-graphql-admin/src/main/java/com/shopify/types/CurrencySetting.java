package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Objects;


public class CurrencySetting {
  
  private CurrencyCode currencyCode;

  
  private String currencyName;

  
  private boolean enabled;

  
  private OffsetDateTime rateUpdatedAt;

  public CurrencySetting() {
  }

  
  public CurrencyCode getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(CurrencyCode currencyCode) {
    this.currencyCode = currencyCode;
  }

  
  public String getCurrencyName() {
    return currencyName;
  }

  public void setCurrencyName(String currencyName) {
    this.currencyName = currencyName;
  }

  
  public boolean getEnabled() {
    return enabled;
  }

  public void setEnabled(boolean enabled) {
    this.enabled = enabled;
  }

  
  public OffsetDateTime getRateUpdatedAt() {
    return rateUpdatedAt;
  }

  public void setRateUpdatedAt(OffsetDateTime rateUpdatedAt) {
    this.rateUpdatedAt = rateUpdatedAt;
  }

  @Override
  public String toString() {
    return "CurrencySetting{currencyCode='" + currencyCode + "', currencyName='" + currencyName + "', enabled='" + enabled + "', rateUpdatedAt='" + rateUpdatedAt + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CurrencySetting that = (CurrencySetting) o;
    return Objects.equals(currencyCode, that.currencyCode) &&
        Objects.equals(currencyName, that.currencyName) &&
        enabled == that.enabled &&
        Objects.equals(rateUpdatedAt, that.rateUpdatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currencyCode, currencyName, enabled, rateUpdatedAt);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private CurrencyCode currencyCode;

    
    private String currencyName;

    
    private boolean enabled;

    
    private OffsetDateTime rateUpdatedAt;

    public CurrencySetting build() {
      CurrencySetting result = new CurrencySetting();
      result.currencyCode = this.currencyCode;
      result.currencyName = this.currencyName;
      result.enabled = this.enabled;
      result.rateUpdatedAt = this.rateUpdatedAt;
      return result;
    }

    
    public Builder currencyCode(CurrencyCode currencyCode) {
      this.currencyCode = currencyCode;
      return this;
    }

    
    public Builder currencyName(String currencyName) {
      this.currencyName = currencyName;
      return this;
    }

    
    public Builder enabled(boolean enabled) {
      this.enabled = enabled;
      return this;
    }

    
    public Builder rateUpdatedAt(OffsetDateTime rateUpdatedAt) {
      this.rateUpdatedAt = rateUpdatedAt;
      return this;
    }
  }
}
