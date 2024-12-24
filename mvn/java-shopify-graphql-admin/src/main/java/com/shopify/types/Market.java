package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class Market implements MetafieldReferencer, com.shopify.types.HasMetafieldDefinitions, com.shopify.types.HasMetafields, com.shopify.types.Node {
  
  private MarketCatalogConnection catalogs;

  
  private Count catalogsCount;

  
  private MarketCurrencySettings currencySettings;

  
  private boolean enabled;

  
  private String handle;

  
  private String id;

  
  private Metafield metafield;

  
  private MetafieldDefinitionConnection metafieldDefinitions;

  
  private MetafieldConnection metafields;

  
  private String name;

  
  private PriceList priceList;

  
  private boolean primary;

  
  private PrivateMetafield privateMetafield;

  
  private PrivateMetafieldConnection privateMetafields;

  
  private MarketRegionConnection regions;

  
  private MarketWebPresence webPresence;

  
  private MarketWebPresenceConnection webPresences;

  public Market() {
  }

  
  public MarketCatalogConnection getCatalogs() {
    return catalogs;
  }

  public void setCatalogs(MarketCatalogConnection catalogs) {
    this.catalogs = catalogs;
  }

  
  public Count getCatalogsCount() {
    return catalogsCount;
  }

  public void setCatalogsCount(Count catalogsCount) {
    this.catalogsCount = catalogsCount;
  }

  
  public MarketCurrencySettings getCurrencySettings() {
    return currencySettings;
  }

  public void setCurrencySettings(MarketCurrencySettings currencySettings) {
    this.currencySettings = currencySettings;
  }

  
  public boolean getEnabled() {
    return enabled;
  }

  public void setEnabled(boolean enabled) {
    this.enabled = enabled;
  }

  
  public String getHandle() {
    return handle;
  }

  public void setHandle(String handle) {
    this.handle = handle;
  }

  
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  
  public Metafield getMetafield() {
    return metafield;
  }

  public void setMetafield(Metafield metafield) {
    this.metafield = metafield;
  }

  
  public MetafieldDefinitionConnection getMetafieldDefinitions() {
    return metafieldDefinitions;
  }

  public void setMetafieldDefinitions(MetafieldDefinitionConnection metafieldDefinitions) {
    this.metafieldDefinitions = metafieldDefinitions;
  }

  
  public MetafieldConnection getMetafields() {
    return metafields;
  }

  public void setMetafields(MetafieldConnection metafields) {
    this.metafields = metafields;
  }

  
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  
  public PriceList getPriceList() {
    return priceList;
  }

  public void setPriceList(PriceList priceList) {
    this.priceList = priceList;
  }

  
  public boolean getPrimary() {
    return primary;
  }

  public void setPrimary(boolean primary) {
    this.primary = primary;
  }

  
  public PrivateMetafield getPrivateMetafield() {
    return privateMetafield;
  }

  public void setPrivateMetafield(PrivateMetafield privateMetafield) {
    this.privateMetafield = privateMetafield;
  }

  
  public PrivateMetafieldConnection getPrivateMetafields() {
    return privateMetafields;
  }

  public void setPrivateMetafields(PrivateMetafieldConnection privateMetafields) {
    this.privateMetafields = privateMetafields;
  }

  
  public MarketRegionConnection getRegions() {
    return regions;
  }

  public void setRegions(MarketRegionConnection regions) {
    this.regions = regions;
  }

  
  public MarketWebPresence getWebPresence() {
    return webPresence;
  }

  public void setWebPresence(MarketWebPresence webPresence) {
    this.webPresence = webPresence;
  }

  
  public MarketWebPresenceConnection getWebPresences() {
    return webPresences;
  }

  public void setWebPresences(MarketWebPresenceConnection webPresences) {
    this.webPresences = webPresences;
  }

  @Override
  public String toString() {
    return "Market{catalogs='" + catalogs + "', catalogsCount='" + catalogsCount + "', currencySettings='" + currencySettings + "', enabled='" + enabled + "', handle='" + handle + "', id='" + id + "', metafield='" + metafield + "', metafieldDefinitions='" + metafieldDefinitions + "', metafields='" + metafields + "', name='" + name + "', priceList='" + priceList + "', primary='" + primary + "', privateMetafield='" + privateMetafield + "', privateMetafields='" + privateMetafields + "', regions='" + regions + "', webPresence='" + webPresence + "', webPresences='" + webPresences + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Market that = (Market) o;
    return Objects.equals(catalogs, that.catalogs) &&
        Objects.equals(catalogsCount, that.catalogsCount) &&
        Objects.equals(currencySettings, that.currencySettings) &&
        enabled == that.enabled &&
        Objects.equals(handle, that.handle) &&
        Objects.equals(id, that.id) &&
        Objects.equals(metafield, that.metafield) &&
        Objects.equals(metafieldDefinitions, that.metafieldDefinitions) &&
        Objects.equals(metafields, that.metafields) &&
        Objects.equals(name, that.name) &&
        Objects.equals(priceList, that.priceList) &&
        primary == that.primary &&
        Objects.equals(privateMetafield, that.privateMetafield) &&
        Objects.equals(privateMetafields, that.privateMetafields) &&
        Objects.equals(regions, that.regions) &&
        Objects.equals(webPresence, that.webPresence) &&
        Objects.equals(webPresences, that.webPresences);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalogs, catalogsCount, currencySettings, enabled, handle, id, metafield, metafieldDefinitions, metafields, name, priceList, primary, privateMetafield, privateMetafields, regions, webPresence, webPresences);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private MarketCatalogConnection catalogs;

    
    private Count catalogsCount;

    
    private MarketCurrencySettings currencySettings;

    
    private boolean enabled;

    
    private String handle;

    
    private String id;

    
    private Metafield metafield;

    
    private MetafieldDefinitionConnection metafieldDefinitions;

    
    private MetafieldConnection metafields;

    
    private String name;

    
    private PriceList priceList;

    
    private boolean primary;

    
    private PrivateMetafield privateMetafield;

    
    private PrivateMetafieldConnection privateMetafields;

    
    private MarketRegionConnection regions;

    
    private MarketWebPresence webPresence;

    
    private MarketWebPresenceConnection webPresences;

    public Market build() {
      Market result = new Market();
      result.catalogs = this.catalogs;
      result.catalogsCount = this.catalogsCount;
      result.currencySettings = this.currencySettings;
      result.enabled = this.enabled;
      result.handle = this.handle;
      result.id = this.id;
      result.metafield = this.metafield;
      result.metafieldDefinitions = this.metafieldDefinitions;
      result.metafields = this.metafields;
      result.name = this.name;
      result.priceList = this.priceList;
      result.primary = this.primary;
      result.privateMetafield = this.privateMetafield;
      result.privateMetafields = this.privateMetafields;
      result.regions = this.regions;
      result.webPresence = this.webPresence;
      result.webPresences = this.webPresences;
      return result;
    }

    
    public Builder catalogs(MarketCatalogConnection catalogs) {
      this.catalogs = catalogs;
      return this;
    }

    
    public Builder catalogsCount(Count catalogsCount) {
      this.catalogsCount = catalogsCount;
      return this;
    }

    
    public Builder currencySettings(MarketCurrencySettings currencySettings) {
      this.currencySettings = currencySettings;
      return this;
    }

    
    public Builder enabled(boolean enabled) {
      this.enabled = enabled;
      return this;
    }

    
    public Builder handle(String handle) {
      this.handle = handle;
      return this;
    }

    
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    
    public Builder metafield(Metafield metafield) {
      this.metafield = metafield;
      return this;
    }

    
    public Builder metafieldDefinitions(MetafieldDefinitionConnection metafieldDefinitions) {
      this.metafieldDefinitions = metafieldDefinitions;
      return this;
    }

    
    public Builder metafields(MetafieldConnection metafields) {
      this.metafields = metafields;
      return this;
    }

    
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    
    public Builder priceList(PriceList priceList) {
      this.priceList = priceList;
      return this;
    }

    
    public Builder primary(boolean primary) {
      this.primary = primary;
      return this;
    }

    
    public Builder privateMetafield(PrivateMetafield privateMetafield) {
      this.privateMetafield = privateMetafield;
      return this;
    }

    
    public Builder privateMetafields(PrivateMetafieldConnection privateMetafields) {
      this.privateMetafields = privateMetafields;
      return this;
    }

    
    public Builder regions(MarketRegionConnection regions) {
      this.regions = regions;
      return this;
    }

    
    public Builder webPresence(MarketWebPresence webPresence) {
      this.webPresence = webPresence;
      return this;
    }

    
    public Builder webPresences(MarketWebPresenceConnection webPresences) {
      this.webPresences = webPresences;
      return this;
    }
  }
}
