package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class ShopLocale {
  
  private String locale;

  
  private List<MarketWebPresence> marketWebPresences;

  
  private String name;

  
  private boolean primary;

  
  private boolean published;

  public ShopLocale() {
  }

  
  public String getLocale() {
    return locale;
  }

  public void setLocale(String locale) {
    this.locale = locale;
  }

  
  public List<MarketWebPresence> getMarketWebPresences() {
    return marketWebPresences;
  }

  public void setMarketWebPresences(List<MarketWebPresence> marketWebPresences) {
    this.marketWebPresences = marketWebPresences;
  }

  
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  
  public boolean getPrimary() {
    return primary;
  }

  public void setPrimary(boolean primary) {
    this.primary = primary;
  }

  
  public boolean getPublished() {
    return published;
  }

  public void setPublished(boolean published) {
    this.published = published;
  }

  @Override
  public String toString() {
    return "ShopLocale{locale='" + locale + "', marketWebPresences='" + marketWebPresences + "', name='" + name + "', primary='" + primary + "', published='" + published + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ShopLocale that = (ShopLocale) o;
    return Objects.equals(locale, that.locale) &&
        Objects.equals(marketWebPresences, that.marketWebPresences) &&
        Objects.equals(name, that.name) &&
        primary == that.primary &&
        published == that.published;
  }

  @Override
  public int hashCode() {
    return Objects.hash(locale, marketWebPresences, name, primary, published);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String locale;

    
    private List<MarketWebPresence> marketWebPresences;

    
    private String name;

    
    private boolean primary;

    
    private boolean published;

    public ShopLocale build() {
      ShopLocale result = new ShopLocale();
      result.locale = this.locale;
      result.marketWebPresences = this.marketWebPresences;
      result.name = this.name;
      result.primary = this.primary;
      result.published = this.published;
      return result;
    }

    
    public Builder locale(String locale) {
      this.locale = locale;
      return this;
    }

    
    public Builder marketWebPresences(List<MarketWebPresence> marketWebPresences) {
      this.marketWebPresences = marketWebPresences;
      return this;
    }

    
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    
    public Builder primary(boolean primary) {
      this.primary = primary;
      return this;
    }

    
    public Builder published(boolean published) {
      this.published = published;
      return this;
    }
  }
}
