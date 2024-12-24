package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class MarketLocalizableResource {
  
  private List<MarketLocalizableContent> marketLocalizableContent;

  
  private List<MarketLocalization> marketLocalizations;

  
  private String resourceId;

  public MarketLocalizableResource() {
  }

  
  public List<MarketLocalizableContent> getMarketLocalizableContent() {
    return marketLocalizableContent;
  }

  public void setMarketLocalizableContent(List<MarketLocalizableContent> marketLocalizableContent) {
    this.marketLocalizableContent = marketLocalizableContent;
  }

  
  public List<MarketLocalization> getMarketLocalizations() {
    return marketLocalizations;
  }

  public void setMarketLocalizations(List<MarketLocalization> marketLocalizations) {
    this.marketLocalizations = marketLocalizations;
  }

  
  public String getResourceId() {
    return resourceId;
  }

  public void setResourceId(String resourceId) {
    this.resourceId = resourceId;
  }

  @Override
  public String toString() {
    return "MarketLocalizableResource{marketLocalizableContent='" + marketLocalizableContent + "', marketLocalizations='" + marketLocalizations + "', resourceId='" + resourceId + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MarketLocalizableResource that = (MarketLocalizableResource) o;
    return Objects.equals(marketLocalizableContent, that.marketLocalizableContent) &&
        Objects.equals(marketLocalizations, that.marketLocalizations) &&
        Objects.equals(resourceId, that.resourceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(marketLocalizableContent, marketLocalizations, resourceId);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private List<MarketLocalizableContent> marketLocalizableContent;

    
    private List<MarketLocalization> marketLocalizations;

    
    private String resourceId;

    public MarketLocalizableResource build() {
      MarketLocalizableResource result = new MarketLocalizableResource();
      result.marketLocalizableContent = this.marketLocalizableContent;
      result.marketLocalizations = this.marketLocalizations;
      result.resourceId = this.resourceId;
      return result;
    }

    
    public Builder marketLocalizableContent(
        List<MarketLocalizableContent> marketLocalizableContent) {
      this.marketLocalizableContent = marketLocalizableContent;
      return this;
    }

    
    public Builder marketLocalizations(List<MarketLocalization> marketLocalizations) {
      this.marketLocalizations = marketLocalizations;
      return this;
    }

    
    public Builder resourceId(String resourceId) {
      this.resourceId = resourceId;
      return this;
    }
  }
}
