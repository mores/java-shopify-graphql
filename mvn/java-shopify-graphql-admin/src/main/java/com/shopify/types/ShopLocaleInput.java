package com.shopify.types;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class ShopLocaleInput {
  
  private Boolean published;

  
  private List<String> marketWebPresenceIds;

  public ShopLocaleInput() {
  }

  
  public Boolean getPublished() {
    return published;
  }

  public void setPublished(Boolean published) {
    this.published = published;
  }

  
  public List<String> getMarketWebPresenceIds() {
    return marketWebPresenceIds;
  }

  public void setMarketWebPresenceIds(List<String> marketWebPresenceIds) {
    this.marketWebPresenceIds = marketWebPresenceIds;
  }

  @Override
  public String toString() {
    return "ShopLocaleInput{published='" + published + "', marketWebPresenceIds='" + marketWebPresenceIds + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ShopLocaleInput that = (ShopLocaleInput) o;
    return Objects.equals(published, that.published) &&
        Objects.equals(marketWebPresenceIds, that.marketWebPresenceIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(published, marketWebPresenceIds);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private Boolean published;

    
    private List<String> marketWebPresenceIds;

    public ShopLocaleInput build() {
      ShopLocaleInput result = new ShopLocaleInput();
      result.published = this.published;
      result.marketWebPresenceIds = this.marketWebPresenceIds;
      return result;
    }

    
    public Builder published(Boolean published) {
      this.published = published;
      return this;
    }

    
    public Builder marketWebPresenceIds(List<String> marketWebPresenceIds) {
      this.marketWebPresenceIds = marketWebPresenceIds;
      return this;
    }
  }
}
