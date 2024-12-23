package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * A market is a group of one or more regions that you want to target for international sales.
 * By creating a market, you can configure a distinct, localized shopping experience for
 * customers from a specific area of the world. For example, you can
 * [change currency](https://shopify.dev/api/admin-graphql/current/mutations/marketCurrencySettingsUpdate),
 * [configure international pricing](https://shopify.dev/apps/internationalization/product-price-lists),
 * or [add market-specific domains or subfolders](https://shopify.dev/api/admin-graphql/current/objects/MarketWebPresence).
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class Market implements MetafieldReferencer, com.shopify.types.HasMetafieldDefinitions, com.shopify.types.HasMetafields, com.shopify.types.Node {
  /**
   * The catalogs that belong to the market.
   */
  private MarketCatalogConnection catalogs;

  /**
   * The number of catalogs that belong to the market.
   */
  private Count catalogsCount;

  /**
   * The market’s currency settings.
   */
  private MarketCurrencySettings currencySettings;

  /**
   * Whether the market is enabled to receive visitors and sales. **Note**: Regions in inactive
   * markets can't be selected on the storefront or in checkout.
   */
  private boolean enabled;

  /**
   * A short, human-readable unique identifier for the market. This is changeable by the merchant.
   */
  private String handle;

  /**
   * A globally-unique ID.
   */
  private String id;

  /**
   * A [custom field](https://shopify.dev/docs/apps/build/custom-data),
   * including its `namespace` and `key`, that's associated with a Shopify resource
   * for the purposes of adding and storing additional information.
   */
  private Metafield metafield;

  /**
   * List of metafield definitions.
   */
  private MetafieldDefinitionConnection metafieldDefinitions;

  /**
   * A list of [custom fields](https://shopify.dev/docs/apps/build/custom-data)
   * that a merchant associates with a Shopify resource.
   */
  private MetafieldConnection metafields;

  /**
   * The name of the market. Not shown to customers.
   */
  private String name;

  /**
   * The market’s price list, which specifies a percentage-based price adjustment as well as
   * fixed price overrides for specific variants.
   *   
   * Markets with multiple catalogs can have multiple price lists. To query which price lists are connected to
   * a market, please query for price lists through the catalogs connection.
   */
  private PriceList priceList;

  /**
   * Whether the market is the shop’s primary market.
   */
  private boolean primary;

  /**
   * Returns a private metafield by namespace and key that belongs to the resource.
   */
  private PrivateMetafield privateMetafield;

  /**
   * List of private metafields that belong to the resource.
   */
  private PrivateMetafieldConnection privateMetafields;

  /**
   * The regions that comprise the market.
   */
  private MarketRegionConnection regions;

  /**
   * The market’s web presence, which defines its SEO strategy. This can be a different domain,
   * subdomain, or subfolders of the primary domain. Each web presence comprises one or more
   * language variants. If a market doesn't have its own web presence, then the market is accessible on the
   * primary market's domains using [country
   * selectors](https://shopify.dev/themes/internationalization/multiple-currencies-languages#the-country-selector).
   * If it's the primary market and it has multiple web presences, then this field will return the primary domain web presence.
   */
  private MarketWebPresence webPresence;

  /**
   * The market’s web presences, which defines its SEO strategy. This can be a different domain,
   * subdomain, or subfolders of the primary domain. Each web presence comprises one or more
   * language variants. If a market doesn't have any web presences, then the market is accessible on the
   * primary market's domains using [country
   * selectors](https://shopify.dev/themes/internationalization/multiple-currencies-languages#the-country-selector).
   */
  private MarketWebPresenceConnection webPresences;

  public Market() {
  }

  /**
   * The catalogs that belong to the market.
   */
  public MarketCatalogConnection getCatalogs() {
    return catalogs;
  }

  public void setCatalogs(MarketCatalogConnection catalogs) {
    this.catalogs = catalogs;
  }

  /**
   * The number of catalogs that belong to the market.
   */
  public Count getCatalogsCount() {
    return catalogsCount;
  }

  public void setCatalogsCount(Count catalogsCount) {
    this.catalogsCount = catalogsCount;
  }

  /**
   * The market’s currency settings.
   */
  public MarketCurrencySettings getCurrencySettings() {
    return currencySettings;
  }

  public void setCurrencySettings(MarketCurrencySettings currencySettings) {
    this.currencySettings = currencySettings;
  }

  /**
   * Whether the market is enabled to receive visitors and sales. **Note**: Regions in inactive
   * markets can't be selected on the storefront or in checkout.
   */
  public boolean getEnabled() {
    return enabled;
  }

  public void setEnabled(boolean enabled) {
    this.enabled = enabled;
  }

  /**
   * A short, human-readable unique identifier for the market. This is changeable by the merchant.
   */
  public String getHandle() {
    return handle;
  }

  public void setHandle(String handle) {
    this.handle = handle;
  }

  /**
   * A globally-unique ID.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * A [custom field](https://shopify.dev/docs/apps/build/custom-data),
   * including its `namespace` and `key`, that's associated with a Shopify resource
   * for the purposes of adding and storing additional information.
   */
  public Metafield getMetafield() {
    return metafield;
  }

  public void setMetafield(Metafield metafield) {
    this.metafield = metafield;
  }

  /**
   * List of metafield definitions.
   */
  public MetafieldDefinitionConnection getMetafieldDefinitions() {
    return metafieldDefinitions;
  }

  public void setMetafieldDefinitions(MetafieldDefinitionConnection metafieldDefinitions) {
    this.metafieldDefinitions = metafieldDefinitions;
  }

  /**
   * A list of [custom fields](https://shopify.dev/docs/apps/build/custom-data)
   * that a merchant associates with a Shopify resource.
   */
  public MetafieldConnection getMetafields() {
    return metafields;
  }

  public void setMetafields(MetafieldConnection metafields) {
    this.metafields = metafields;
  }

  /**
   * The name of the market. Not shown to customers.
   */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  /**
   * The market’s price list, which specifies a percentage-based price adjustment as well as
   * fixed price overrides for specific variants.
   *   
   * Markets with multiple catalogs can have multiple price lists. To query which price lists are connected to
   * a market, please query for price lists through the catalogs connection.
   */
  public PriceList getPriceList() {
    return priceList;
  }

  public void setPriceList(PriceList priceList) {
    this.priceList = priceList;
  }

  /**
   * Whether the market is the shop’s primary market.
   */
  public boolean getPrimary() {
    return primary;
  }

  public void setPrimary(boolean primary) {
    this.primary = primary;
  }

  /**
   * Returns a private metafield by namespace and key that belongs to the resource.
   */
  public PrivateMetafield getPrivateMetafield() {
    return privateMetafield;
  }

  public void setPrivateMetafield(PrivateMetafield privateMetafield) {
    this.privateMetafield = privateMetafield;
  }

  /**
   * List of private metafields that belong to the resource.
   */
  public PrivateMetafieldConnection getPrivateMetafields() {
    return privateMetafields;
  }

  public void setPrivateMetafields(PrivateMetafieldConnection privateMetafields) {
    this.privateMetafields = privateMetafields;
  }

  /**
   * The regions that comprise the market.
   */
  public MarketRegionConnection getRegions() {
    return regions;
  }

  public void setRegions(MarketRegionConnection regions) {
    this.regions = regions;
  }

  /**
   * The market’s web presence, which defines its SEO strategy. This can be a different domain,
   * subdomain, or subfolders of the primary domain. Each web presence comprises one or more
   * language variants. If a market doesn't have its own web presence, then the market is accessible on the
   * primary market's domains using [country
   * selectors](https://shopify.dev/themes/internationalization/multiple-currencies-languages#the-country-selector).
   * If it's the primary market and it has multiple web presences, then this field will return the primary domain web presence.
   */
  public MarketWebPresence getWebPresence() {
    return webPresence;
  }

  public void setWebPresence(MarketWebPresence webPresence) {
    this.webPresence = webPresence;
  }

  /**
   * The market’s web presences, which defines its SEO strategy. This can be a different domain,
   * subdomain, or subfolders of the primary domain. Each web presence comprises one or more
   * language variants. If a market doesn't have any web presences, then the market is accessible on the
   * primary market's domains using [country
   * selectors](https://shopify.dev/themes/internationalization/multiple-currencies-languages#the-country-selector).
   */
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
    /**
     * The catalogs that belong to the market.
     */
    private MarketCatalogConnection catalogs;

    /**
     * The number of catalogs that belong to the market.
     */
    private Count catalogsCount;

    /**
     * The market’s currency settings.
     */
    private MarketCurrencySettings currencySettings;

    /**
     * Whether the market is enabled to receive visitors and sales. **Note**: Regions in inactive
     * markets can't be selected on the storefront or in checkout.
     */
    private boolean enabled;

    /**
     * A short, human-readable unique identifier for the market. This is changeable by the merchant.
     */
    private String handle;

    /**
     * A globally-unique ID.
     */
    private String id;

    /**
     * A [custom field](https://shopify.dev/docs/apps/build/custom-data),
     * including its `namespace` and `key`, that's associated with a Shopify resource
     * for the purposes of adding and storing additional information.
     */
    private Metafield metafield;

    /**
     * List of metafield definitions.
     */
    private MetafieldDefinitionConnection metafieldDefinitions;

    /**
     * A list of [custom fields](https://shopify.dev/docs/apps/build/custom-data)
     * that a merchant associates with a Shopify resource.
     */
    private MetafieldConnection metafields;

    /**
     * The name of the market. Not shown to customers.
     */
    private String name;

    /**
     * The market’s price list, which specifies a percentage-based price adjustment as well as
     * fixed price overrides for specific variants.
     *   
     * Markets with multiple catalogs can have multiple price lists. To query which price lists are connected to
     * a market, please query for price lists through the catalogs connection.
     */
    private PriceList priceList;

    /**
     * Whether the market is the shop’s primary market.
     */
    private boolean primary;

    /**
     * Returns a private metafield by namespace and key that belongs to the resource.
     */
    private PrivateMetafield privateMetafield;

    /**
     * List of private metafields that belong to the resource.
     */
    private PrivateMetafieldConnection privateMetafields;

    /**
     * The regions that comprise the market.
     */
    private MarketRegionConnection regions;

    /**
     * The market’s web presence, which defines its SEO strategy. This can be a different domain,
     * subdomain, or subfolders of the primary domain. Each web presence comprises one or more
     * language variants. If a market doesn't have its own web presence, then the market is accessible on the
     * primary market's domains using [country
     * selectors](https://shopify.dev/themes/internationalization/multiple-currencies-languages#the-country-selector).
     * If it's the primary market and it has multiple web presences, then this field will return the primary domain web presence.
     */
    private MarketWebPresence webPresence;

    /**
     * The market’s web presences, which defines its SEO strategy. This can be a different domain,
     * subdomain, or subfolders of the primary domain. Each web presence comprises one or more
     * language variants. If a market doesn't have any web presences, then the market is accessible on the
     * primary market's domains using [country
     * selectors](https://shopify.dev/themes/internationalization/multiple-currencies-languages#the-country-selector).
     */
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

    /**
     * The catalogs that belong to the market.
     */
    public Builder catalogs(MarketCatalogConnection catalogs) {
      this.catalogs = catalogs;
      return this;
    }

    /**
     * The number of catalogs that belong to the market.
     */
    public Builder catalogsCount(Count catalogsCount) {
      this.catalogsCount = catalogsCount;
      return this;
    }

    /**
     * The market’s currency settings.
     */
    public Builder currencySettings(MarketCurrencySettings currencySettings) {
      this.currencySettings = currencySettings;
      return this;
    }

    /**
     * Whether the market is enabled to receive visitors and sales. **Note**: Regions in inactive
     * markets can't be selected on the storefront or in checkout.
     */
    public Builder enabled(boolean enabled) {
      this.enabled = enabled;
      return this;
    }

    /**
     * A short, human-readable unique identifier for the market. This is changeable by the merchant.
     */
    public Builder handle(String handle) {
      this.handle = handle;
      return this;
    }

    /**
     * A globally-unique ID.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * A [custom field](https://shopify.dev/docs/apps/build/custom-data),
     * including its `namespace` and `key`, that's associated with a Shopify resource
     * for the purposes of adding and storing additional information.
     */
    public Builder metafield(Metafield metafield) {
      this.metafield = metafield;
      return this;
    }

    /**
     * List of metafield definitions.
     */
    public Builder metafieldDefinitions(MetafieldDefinitionConnection metafieldDefinitions) {
      this.metafieldDefinitions = metafieldDefinitions;
      return this;
    }

    /**
     * A list of [custom fields](https://shopify.dev/docs/apps/build/custom-data)
     * that a merchant associates with a Shopify resource.
     */
    public Builder metafields(MetafieldConnection metafields) {
      this.metafields = metafields;
      return this;
    }

    /**
     * The name of the market. Not shown to customers.
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * The market’s price list, which specifies a percentage-based price adjustment as well as
     * fixed price overrides for specific variants.
     *   
     * Markets with multiple catalogs can have multiple price lists. To query which price lists are connected to
     * a market, please query for price lists through the catalogs connection.
     */
    public Builder priceList(PriceList priceList) {
      this.priceList = priceList;
      return this;
    }

    /**
     * Whether the market is the shop’s primary market.
     */
    public Builder primary(boolean primary) {
      this.primary = primary;
      return this;
    }

    /**
     * Returns a private metafield by namespace and key that belongs to the resource.
     */
    public Builder privateMetafield(PrivateMetafield privateMetafield) {
      this.privateMetafield = privateMetafield;
      return this;
    }

    /**
     * List of private metafields that belong to the resource.
     */
    public Builder privateMetafields(PrivateMetafieldConnection privateMetafields) {
      this.privateMetafields = privateMetafields;
      return this;
    }

    /**
     * The regions that comprise the market.
     */
    public Builder regions(MarketRegionConnection regions) {
      this.regions = regions;
      return this;
    }

    /**
     * The market’s web presence, which defines its SEO strategy. This can be a different domain,
     * subdomain, or subfolders of the primary domain. Each web presence comprises one or more
     * language variants. If a market doesn't have its own web presence, then the market is accessible on the
     * primary market's domains using [country
     * selectors](https://shopify.dev/themes/internationalization/multiple-currencies-languages#the-country-selector).
     * If it's the primary market and it has multiple web presences, then this field will return the primary domain web presence.
     */
    public Builder webPresence(MarketWebPresence webPresence) {
      this.webPresence = webPresence;
      return this;
    }

    /**
     * The market’s web presences, which defines its SEO strategy. This can be a different domain,
     * subdomain, or subfolders of the primary domain. Each web presence comprises one or more
     * language variants. If a market doesn't have any web presences, then the market is accessible on the
     * primary market's domains using [country
     * selectors](https://shopify.dev/themes/internationalization/multiple-currencies-languages#the-country-selector).
     */
    public Builder webPresences(MarketWebPresenceConnection webPresences) {
      this.webPresences = webPresences;
      return this;
    }
  }
}
