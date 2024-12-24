package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Objects;


public class Translation {
  
  private String key;

  
  private String locale;

  
  private Market market;

  
  private boolean outdated;

  
  private OffsetDateTime updatedAt;

  
  private String value;

  public Translation() {
  }

  
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  
  public String getLocale() {
    return locale;
  }

  public void setLocale(String locale) {
    this.locale = locale;
  }

  
  public Market getMarket() {
    return market;
  }

  public void setMarket(Market market) {
    this.market = market;
  }

  
  public boolean getOutdated() {
    return outdated;
  }

  public void setOutdated(boolean outdated) {
    this.outdated = outdated;
  }

  
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return "Translation{key='" + key + "', locale='" + locale + "', market='" + market + "', outdated='" + outdated + "', updatedAt='" + updatedAt + "', value='" + value + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Translation that = (Translation) o;
    return Objects.equals(key, that.key) &&
        Objects.equals(locale, that.locale) &&
        Objects.equals(market, that.market) &&
        outdated == that.outdated &&
        Objects.equals(updatedAt, that.updatedAt) &&
        Objects.equals(value, that.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, locale, market, outdated, updatedAt, value);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String key;

    
    private String locale;

    
    private Market market;

    
    private boolean outdated;

    
    private OffsetDateTime updatedAt;

    
    private String value;

    public Translation build() {
      Translation result = new Translation();
      result.key = this.key;
      result.locale = this.locale;
      result.market = this.market;
      result.outdated = this.outdated;
      result.updatedAt = this.updatedAt;
      result.value = this.value;
      return result;
    }

    
    public Builder key(String key) {
      this.key = key;
      return this;
    }

    
    public Builder locale(String locale) {
      this.locale = locale;
      return this;
    }

    
    public Builder market(Market market) {
      this.market = market;
      return this;
    }

    
    public Builder outdated(boolean outdated) {
      this.outdated = outdated;
      return this;
    }

    
    public Builder updatedAt(OffsetDateTime updatedAt) {
      this.updatedAt = updatedAt;
      return this;
    }

    
    public Builder value(String value) {
      this.value = value;
      return this;
    }
  }
}
