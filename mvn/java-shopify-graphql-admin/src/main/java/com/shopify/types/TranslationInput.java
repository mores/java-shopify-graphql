package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class TranslationInput {
  
  private String locale;

  
  private String key;

  
  private String value;

  
  private String translatableContentDigest;

  
  private String marketId;

  public TranslationInput() {
  }

  
  public String getLocale() {
    return locale;
  }

  public void setLocale(String locale) {
    this.locale = locale;
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

  
  public String getTranslatableContentDigest() {
    return translatableContentDigest;
  }

  public void setTranslatableContentDigest(String translatableContentDigest) {
    this.translatableContentDigest = translatableContentDigest;
  }

  
  public String getMarketId() {
    return marketId;
  }

  public void setMarketId(String marketId) {
    this.marketId = marketId;
  }

  @Override
  public String toString() {
    return "TranslationInput{locale='" + locale + "', key='" + key + "', value='" + value + "', translatableContentDigest='" + translatableContentDigest + "', marketId='" + marketId + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    TranslationInput that = (TranslationInput) o;
    return Objects.equals(locale, that.locale) &&
        Objects.equals(key, that.key) &&
        Objects.equals(value, that.value) &&
        Objects.equals(translatableContentDigest, that.translatableContentDigest) &&
        Objects.equals(marketId, that.marketId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(locale, key, value, translatableContentDigest, marketId);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String locale;

    
    private String key;

    
    private String value;

    
    private String translatableContentDigest;

    
    private String marketId;

    public TranslationInput build() {
      TranslationInput result = new TranslationInput();
      result.locale = this.locale;
      result.key = this.key;
      result.value = this.value;
      result.translatableContentDigest = this.translatableContentDigest;
      result.marketId = this.marketId;
      return result;
    }

    
    public Builder locale(String locale) {
      this.locale = locale;
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

    
    public Builder translatableContentDigest(String translatableContentDigest) {
      this.translatableContentDigest = translatableContentDigest;
      return this;
    }

    
    public Builder marketId(String marketId) {
      this.marketId = marketId;
      return this;
    }
  }
}
