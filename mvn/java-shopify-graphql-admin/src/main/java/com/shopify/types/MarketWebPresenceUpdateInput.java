package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class MarketWebPresenceUpdateInput {
  
  private String domainId;

  
  private String defaultLocale;

  
  private List<String> alternateLocales;

  
  private String subfolderSuffix;

  public MarketWebPresenceUpdateInput() {
  }

  
  public String getDomainId() {
    return domainId;
  }

  public void setDomainId(String domainId) {
    this.domainId = domainId;
  }

  
  public String getDefaultLocale() {
    return defaultLocale;
  }

  public void setDefaultLocale(String defaultLocale) {
    this.defaultLocale = defaultLocale;
  }

  
  public List<String> getAlternateLocales() {
    return alternateLocales;
  }

  public void setAlternateLocales(List<String> alternateLocales) {
    this.alternateLocales = alternateLocales;
  }

  
  public String getSubfolderSuffix() {
    return subfolderSuffix;
  }

  public void setSubfolderSuffix(String subfolderSuffix) {
    this.subfolderSuffix = subfolderSuffix;
  }

  @Override
  public String toString() {
    return "MarketWebPresenceUpdateInput{domainId='" + domainId + "', defaultLocale='" + defaultLocale + "', alternateLocales='" + alternateLocales + "', subfolderSuffix='" + subfolderSuffix + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MarketWebPresenceUpdateInput that = (MarketWebPresenceUpdateInput) o;
    return Objects.equals(domainId, that.domainId) &&
        Objects.equals(defaultLocale, that.defaultLocale) &&
        Objects.equals(alternateLocales, that.alternateLocales) &&
        Objects.equals(subfolderSuffix, that.subfolderSuffix);
  }

  @Override
  public int hashCode() {
    return Objects.hash(domainId, defaultLocale, alternateLocales, subfolderSuffix);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String domainId;

    
    private String defaultLocale;

    
    private List<String> alternateLocales;

    
    private String subfolderSuffix;

    public MarketWebPresenceUpdateInput build() {
      MarketWebPresenceUpdateInput result = new MarketWebPresenceUpdateInput();
      result.domainId = this.domainId;
      result.defaultLocale = this.defaultLocale;
      result.alternateLocales = this.alternateLocales;
      result.subfolderSuffix = this.subfolderSuffix;
      return result;
    }

    
    public Builder domainId(String domainId) {
      this.domainId = domainId;
      return this;
    }

    
    public Builder defaultLocale(String defaultLocale) {
      this.defaultLocale = defaultLocale;
      return this;
    }

    
    public Builder alternateLocales(List<String> alternateLocales) {
      this.alternateLocales = alternateLocales;
      return this;
    }

    
    public Builder subfolderSuffix(String subfolderSuffix) {
      this.subfolderSuffix = subfolderSuffix;
      return this;
    }
  }
}
