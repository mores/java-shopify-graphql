package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class MarketWebPresence implements com.shopify.types.Node {
  
  private List<ShopLocale> alternateLocales;

  
  private ShopLocale defaultLocale;

  
  private Domain domain;

  
  private String id;

  
  private Market market;

  
  private List<MarketWebPresenceRootUrl> rootUrls;

  
  private String subfolderSuffix;

  public MarketWebPresence() {
  }

  
  public List<ShopLocale> getAlternateLocales() {
    return alternateLocales;
  }

  public void setAlternateLocales(List<ShopLocale> alternateLocales) {
    this.alternateLocales = alternateLocales;
  }

  
  public ShopLocale getDefaultLocale() {
    return defaultLocale;
  }

  public void setDefaultLocale(ShopLocale defaultLocale) {
    this.defaultLocale = defaultLocale;
  }

  
  public Domain getDomain() {
    return domain;
  }

  public void setDomain(Domain domain) {
    this.domain = domain;
  }

  
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  
  public Market getMarket() {
    return market;
  }

  public void setMarket(Market market) {
    this.market = market;
  }

  
  public List<MarketWebPresenceRootUrl> getRootUrls() {
    return rootUrls;
  }

  public void setRootUrls(List<MarketWebPresenceRootUrl> rootUrls) {
    this.rootUrls = rootUrls;
  }

  
  public String getSubfolderSuffix() {
    return subfolderSuffix;
  }

  public void setSubfolderSuffix(String subfolderSuffix) {
    this.subfolderSuffix = subfolderSuffix;
  }

  @Override
  public String toString() {
    return "MarketWebPresence{alternateLocales='" + alternateLocales + "', defaultLocale='" + defaultLocale + "', domain='" + domain + "', id='" + id + "', market='" + market + "', rootUrls='" + rootUrls + "', subfolderSuffix='" + subfolderSuffix + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MarketWebPresence that = (MarketWebPresence) o;
    return Objects.equals(alternateLocales, that.alternateLocales) &&
        Objects.equals(defaultLocale, that.defaultLocale) &&
        Objects.equals(domain, that.domain) &&
        Objects.equals(id, that.id) &&
        Objects.equals(market, that.market) &&
        Objects.equals(rootUrls, that.rootUrls) &&
        Objects.equals(subfolderSuffix, that.subfolderSuffix);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alternateLocales, defaultLocale, domain, id, market, rootUrls, subfolderSuffix);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private List<ShopLocale> alternateLocales;

    
    private ShopLocale defaultLocale;

    
    private Domain domain;

    
    private String id;

    
    private Market market;

    
    private List<MarketWebPresenceRootUrl> rootUrls;

    
    private String subfolderSuffix;

    public MarketWebPresence build() {
      MarketWebPresence result = new MarketWebPresence();
      result.alternateLocales = this.alternateLocales;
      result.defaultLocale = this.defaultLocale;
      result.domain = this.domain;
      result.id = this.id;
      result.market = this.market;
      result.rootUrls = this.rootUrls;
      result.subfolderSuffix = this.subfolderSuffix;
      return result;
    }

    
    public Builder alternateLocales(List<ShopLocale> alternateLocales) {
      this.alternateLocales = alternateLocales;
      return this;
    }

    
    public Builder defaultLocale(ShopLocale defaultLocale) {
      this.defaultLocale = defaultLocale;
      return this;
    }

    
    public Builder domain(Domain domain) {
      this.domain = domain;
      return this;
    }

    
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    
    public Builder market(Market market) {
      this.market = market;
      return this;
    }

    
    public Builder rootUrls(List<MarketWebPresenceRootUrl> rootUrls) {
      this.rootUrls = rootUrls;
      return this;
    }

    
    public Builder subfolderSuffix(String subfolderSuffix) {
      this.subfolderSuffix = subfolderSuffix;
      return this;
    }
  }
}
