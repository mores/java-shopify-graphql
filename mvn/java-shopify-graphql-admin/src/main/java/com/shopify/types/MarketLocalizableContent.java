package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class MarketLocalizableContent {
  
  private String digest;

  
  private String key;

  
  private String value;

  public MarketLocalizableContent() {
  }

  
  public String getDigest() {
    return digest;
  }

  public void setDigest(String digest) {
    this.digest = digest;
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

  @Override
  public String toString() {
    return "MarketLocalizableContent{digest='" + digest + "', key='" + key + "', value='" + value + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MarketLocalizableContent that = (MarketLocalizableContent) o;
    return Objects.equals(digest, that.digest) &&
        Objects.equals(key, that.key) &&
        Objects.equals(value, that.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(digest, key, value);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String digest;

    
    private String key;

    
    private String value;

    public MarketLocalizableContent build() {
      MarketLocalizableContent result = new MarketLocalizableContent();
      result.digest = this.digest;
      result.key = this.key;
      result.value = this.value;
      return result;
    }

    
    public Builder digest(String digest) {
      this.digest = digest;
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
  }
}
