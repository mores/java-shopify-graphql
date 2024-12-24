package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class MarketLocalizationRegisterInput {
  
  private String marketId;

  
  private String key;

  
  private String value;

  
  private String marketLocalizableContentDigest;

  public MarketLocalizationRegisterInput() {
  }

  
  public String getMarketId() {
    return marketId;
  }

  public void setMarketId(String marketId) {
    this.marketId = marketId;
  }

  
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  
  public String getMarketLocalizableContentDigest() {
    return marketLocalizableContentDigest;
  }

  public void setMarketLocalizableContentDigest(String marketLocalizableContentDigest) {
    this.marketLocalizableContentDigest = marketLocalizableContentDigest;
  }

  @Override
  public String toString() {
    return "MarketLocalizationRegisterInput{marketId='" + marketId + "', key='" + key + "', value='" + value + "', marketLocalizableContentDigest='" + marketLocalizableContentDigest + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MarketLocalizationRegisterInput that = (MarketLocalizationRegisterInput) o;
    return Objects.equals(marketId, that.marketId) &&
        Objects.equals(key, that.key) &&
        Objects.equals(value, that.value) &&
        Objects.equals(marketLocalizableContentDigest, that.marketLocalizableContentDigest);
  }

  @Override
  public int hashCode() {
    return Objects.hash(marketId, key, value, marketLocalizableContentDigest);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String marketId;

    
    private String key;

    
    private String value;

    
    private String marketLocalizableContentDigest;

    public MarketLocalizationRegisterInput build() {
      MarketLocalizationRegisterInput result = new MarketLocalizationRegisterInput();
      result.marketId = this.marketId;
      result.key = this.key;
      result.value = this.value;
      result.marketLocalizableContentDigest = this.marketLocalizableContentDigest;
      return result;
    }

    
    public Builder marketId(String marketId) {
      this.marketId = marketId;
      return this;
    }

    
    public Builder key(String key) {
      this.key = key;
      return this;
    }

    
    public Builder value(String value) {
      this.value = value;
      return this;
    }

    
    public Builder marketLocalizableContentDigest(String marketLocalizableContentDigest) {
      this.marketLocalizableContentDigest = marketLocalizableContentDigest;
      return this;
    }
  }
}
