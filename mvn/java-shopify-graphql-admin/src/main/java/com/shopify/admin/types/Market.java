package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * A merchant-defined group of buyers identified by conditions such as their
 * region, retail location, or company location. Each market allows configuration
 * of a distinct, localized buyer experience. Customizations include, but are
 * not limited to,
 * [currency](https://shopify.dev/api/admin-graphql/current/mutations/marketCurrencySettingsUpdate),
 * [pricing and product availability](https://shopify.dev/apps/internationalization/product-price-lists),
 * [web presence](https://shopify.dev/api/admin-graphql/current/objects/MarketWebPresence),
 * and content translations.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class Market implements MetafieldReferencer, com.shopify.admin.types.HasMetafieldDefinitions, com.shopify.admin.types.HasMetafields, com.shopify.admin.types.Node {
  /**
   * Whether the market has a customization with the given ID.
   */
  private boolean assignedCustomization;

  /**
   * The catalogs that belong to the market.
   */
  private MarketCatalogConnection catalogs;

  /**
   * The number of catalogs that belong to the market.
   */
  private Count catalogsCount;

  /**
   * The market's direct children. Eventually consistent following a change in
   * market hierarchy. See [`marketRelationshipsStatus`](https://shopify.dev/docs/api/admin-graphql/latest/queries/marketRelationshipsStatus).
   */
  private MarketConnection childMarkets;

  /**
   * The number of direct child markets. Eventually consistent following a change
   * in market hierarchy. See [`marketRelationshipsStatus`](https://shopify.dev/docs/api/admin-graphql/latest/queries/marketRelationshipsStatus).
   */
  private Count childMarketsCount;

  /**
   * The conditions under which a visitor is in the market.
   */
  private MarketConditions conditions;

  /**
   * The market’s currency settings.
   */
  private MarketCurrencySettings currencySettings;

  /**
   * The delivery settings for this market.
   */
  private MarketDeliveryConfigurations delivery;

  /**
   * The discounts that are available in this market.
   */
  private DiscountNodeConnection discounts;

  /**
   * The number of discounts that are assigned to this market.
   */
  private Count discountsCount;

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
   * The market's direct parents. Eventually consistent following a change in
   * market hierarchy. See [`marketRelationshipsStatus`](https://shopify.dev/docs/api/admin-graphql/latest/queries/marketRelationshipsStatus).
   */
  private MarketConnection parentMarkets;

  /**
   * The number of direct parent markets. Eventually consistent following a change
   * in market hierarchy. See [`marketRelationshipsStatus`](https://shopify.dev/docs/api/admin-graphql/latest/queries/marketRelationshipsStatus).
   */
  private Count parentMarketsCount;

  /**
   * The inclusive pricing strategy for a market. This determines if prices include duties and / or taxes.
   */
  private MarketPriceInclusions priceInclusions;

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
   * The regions that comprise the market.
   */
  private MarketRegionConnection regions;

  /**
   * The return policy profile for this market.
   */
  private ReturnPolicyProfile returnPolicyProfile;

  /**
   * Status of the market. Replaces the enabled field.
   */
  private MarketStatus status;

  /**
   * The type of the market.
   */
  private MarketType type;

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
   * Whether the market has a customization with the given ID.
   */
  public boolean getAssignedCustomization() {
    return assignedCustomization;
  }

  public void setAssignedCustomization(boolean assignedCustomization) {
    this.assignedCustomization = assignedCustomization;
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
   * The market's direct children. Eventually consistent following a change in
   * market hierarchy. See [`marketRelationshipsStatus`](https://shopify.dev/docs/api/admin-graphql/latest/queries/marketRelationshipsStatus).
   */
  public MarketConnection getChildMarkets() {
    return childMarkets;
  }

  public void setChildMarkets(MarketConnection childMarkets) {
    this.childMarkets = childMarkets;
  }

  /**
   * The number of direct child markets. Eventually consistent following a change
   * in market hierarchy. See [`marketRelationshipsStatus`](https://shopify.dev/docs/api/admin-graphql/latest/queries/marketRelationshipsStatus).
   */
  public Count getChildMarketsCount() {
    return childMarketsCount;
  }

  public void setChildMarketsCount(Count childMarketsCount) {
    this.childMarketsCount = childMarketsCount;
  }

  /**
   * The conditions under which a visitor is in the market.
   */
  public MarketConditions getConditions() {
    return conditions;
  }

  public void setConditions(MarketConditions conditions) {
    this.conditions = conditions;
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
   * The delivery settings for this market.
   */
  public MarketDeliveryConfigurations getDelivery() {
    return delivery;
  }

  public void setDelivery(MarketDeliveryConfigurations delivery) {
    this.delivery = delivery;
  }

  /**
   * The discounts that are available in this market.
   */
  public DiscountNodeConnection getDiscounts() {
    return discounts;
  }

  public void setDiscounts(DiscountNodeConnection discounts) {
    this.discounts = discounts;
  }

  /**
   * The number of discounts that are assigned to this market.
   */
  public Count getDiscountsCount() {
    return discountsCount;
  }

  public void setDiscountsCount(Count discountsCount) {
    this.discountsCount = discountsCount;
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
   * The market's direct parents. Eventually consistent following a change in
   * market hierarchy. See [`marketRelationshipsStatus`](https://shopify.dev/docs/api/admin-graphql/latest/queries/marketRelationshipsStatus).
   */
  public MarketConnection getParentMarkets() {
    return parentMarkets;
  }

  public void setParentMarkets(MarketConnection parentMarkets) {
    this.parentMarkets = parentMarkets;
  }

  /**
   * The number of direct parent markets. Eventually consistent following a change
   * in market hierarchy. See [`marketRelationshipsStatus`](https://shopify.dev/docs/api/admin-graphql/latest/queries/marketRelationshipsStatus).
   */
  public Count getParentMarketsCount() {
    return parentMarketsCount;
  }

  public void setParentMarketsCount(Count parentMarketsCount) {
    this.parentMarketsCount = parentMarketsCount;
  }

  /**
   * The inclusive pricing strategy for a market. This determines if prices include duties and / or taxes.
   */
  public MarketPriceInclusions getPriceInclusions() {
    return priceInclusions;
  }

  public void setPriceInclusions(MarketPriceInclusions priceInclusions) {
    this.priceInclusions = priceInclusions;
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
   * The regions that comprise the market.
   */
  public MarketRegionConnection getRegions() {
    return regions;
  }

  public void setRegions(MarketRegionConnection regions) {
    this.regions = regions;
  }

  /**
   * The return policy profile for this market.
   */
  public ReturnPolicyProfile getReturnPolicyProfile() {
    return returnPolicyProfile;
  }

  public void setReturnPolicyProfile(ReturnPolicyProfile returnPolicyProfile) {
    this.returnPolicyProfile = returnPolicyProfile;
  }

  /**
   * Status of the market. Replaces the enabled field.
   */
  public MarketStatus getStatus() {
    return status;
  }

  public void setStatus(MarketStatus status) {
    this.status = status;
  }

  /**
   * The type of the market.
   */
  public MarketType getType() {
    return type;
  }

  public void setType(MarketType type) {
    this.type = type;
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
    return "Market{assignedCustomization='" + assignedCustomization + "', catalogs='" + catalogs + "', catalogsCount='" + catalogsCount + "', childMarkets='" + childMarkets + "', childMarketsCount='" + childMarketsCount + "', conditions='" + conditions + "', currencySettings='" + currencySettings + "', delivery='" + delivery + "', discounts='" + discounts + "', discountsCount='" + discountsCount + "', enabled='" + enabled + "', handle='" + handle + "', id='" + id + "', metafield='" + metafield + "', metafieldDefinitions='" + metafieldDefinitions + "', metafields='" + metafields + "', name='" + name + "', parentMarkets='" + parentMarkets + "', parentMarketsCount='" + parentMarketsCount + "', priceInclusions='" + priceInclusions + "', priceList='" + priceList + "', primary='" + primary + "', regions='" + regions + "', returnPolicyProfile='" + returnPolicyProfile + "', status='" + status + "', type='" + type + "', webPresence='" + webPresence + "', webPresences='" + webPresences + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Market that = (Market) o;
    return assignedCustomization == that.assignedCustomization &&
        Objects.equals(catalogs, that.catalogs) &&
        Objects.equals(catalogsCount, that.catalogsCount) &&
        Objects.equals(childMarkets, that.childMarkets) &&
        Objects.equals(childMarketsCount, that.childMarketsCount) &&
        Objects.equals(conditions, that.conditions) &&
        Objects.equals(currencySettings, that.currencySettings) &&
        Objects.equals(delivery, that.delivery) &&
        Objects.equals(discounts, that.discounts) &&
        Objects.equals(discountsCount, that.discountsCount) &&
        enabled == that.enabled &&
        Objects.equals(handle, that.handle) &&
        Objects.equals(id, that.id) &&
        Objects.equals(metafield, that.metafield) &&
        Objects.equals(metafieldDefinitions, that.metafieldDefinitions) &&
        Objects.equals(metafields, that.metafields) &&
        Objects.equals(name, that.name) &&
        Objects.equals(parentMarkets, that.parentMarkets) &&
        Objects.equals(parentMarketsCount, that.parentMarketsCount) &&
        Objects.equals(priceInclusions, that.priceInclusions) &&
        Objects.equals(priceList, that.priceList) &&
        primary == that.primary &&
        Objects.equals(regions, that.regions) &&
        Objects.equals(returnPolicyProfile, that.returnPolicyProfile) &&
        Objects.equals(status, that.status) &&
        Objects.equals(type, that.type) &&
        Objects.equals(webPresence, that.webPresence) &&
        Objects.equals(webPresences, that.webPresences);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assignedCustomization, catalogs, catalogsCount, childMarkets, childMarketsCount, conditions, currencySettings, delivery, discounts, discountsCount, enabled, handle, id, metafield, metafieldDefinitions, metafields, name, parentMarkets, parentMarketsCount, priceInclusions, priceList, primary, regions, returnPolicyProfile, status, type, webPresence, webPresences);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Whether the market has a customization with the given ID.
     */
    private boolean assignedCustomization;

    /**
     * The catalogs that belong to the market.
     */
    private MarketCatalogConnection catalogs;

    /**
     * The number of catalogs that belong to the market.
     */
    private Count catalogsCount;

    /**
     * The market's direct children. Eventually consistent following a change in
     * market hierarchy. See [`marketRelationshipsStatus`](https://shopify.dev/docs/api/admin-graphql/latest/queries/marketRelationshipsStatus).
     */
    private MarketConnection childMarkets;

    /**
     * The number of direct child markets. Eventually consistent following a change
     * in market hierarchy. See [`marketRelationshipsStatus`](https://shopify.dev/docs/api/admin-graphql/latest/queries/marketRelationshipsStatus).
     */
    private Count childMarketsCount;

    /**
     * The conditions under which a visitor is in the market.
     */
    private MarketConditions conditions;

    /**
     * The market’s currency settings.
     */
    private MarketCurrencySettings currencySettings;

    /**
     * The delivery settings for this market.
     */
    private MarketDeliveryConfigurations delivery;

    /**
     * The discounts that are available in this market.
     */
    private DiscountNodeConnection discounts;

    /**
     * The number of discounts that are assigned to this market.
     */
    private Count discountsCount;

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
     * The market's direct parents. Eventually consistent following a change in
     * market hierarchy. See [`marketRelationshipsStatus`](https://shopify.dev/docs/api/admin-graphql/latest/queries/marketRelationshipsStatus).
     */
    private MarketConnection parentMarkets;

    /**
     * The number of direct parent markets. Eventually consistent following a change
     * in market hierarchy. See [`marketRelationshipsStatus`](https://shopify.dev/docs/api/admin-graphql/latest/queries/marketRelationshipsStatus).
     */
    private Count parentMarketsCount;

    /**
     * The inclusive pricing strategy for a market. This determines if prices include duties and / or taxes.
     */
    private MarketPriceInclusions priceInclusions;

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
     * The regions that comprise the market.
     */
    private MarketRegionConnection regions;

    /**
     * The return policy profile for this market.
     */
    private ReturnPolicyProfile returnPolicyProfile;

    /**
     * Status of the market. Replaces the enabled field.
     */
    private MarketStatus status;

    /**
     * The type of the market.
     */
    private MarketType type;

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
      result.assignedCustomization = this.assignedCustomization;
      result.catalogs = this.catalogs;
      result.catalogsCount = this.catalogsCount;
      result.childMarkets = this.childMarkets;
      result.childMarketsCount = this.childMarketsCount;
      result.conditions = this.conditions;
      result.currencySettings = this.currencySettings;
      result.delivery = this.delivery;
      result.discounts = this.discounts;
      result.discountsCount = this.discountsCount;
      result.enabled = this.enabled;
      result.handle = this.handle;
      result.id = this.id;
      result.metafield = this.metafield;
      result.metafieldDefinitions = this.metafieldDefinitions;
      result.metafields = this.metafields;
      result.name = this.name;
      result.parentMarkets = this.parentMarkets;
      result.parentMarketsCount = this.parentMarketsCount;
      result.priceInclusions = this.priceInclusions;
      result.priceList = this.priceList;
      result.primary = this.primary;
      result.regions = this.regions;
      result.returnPolicyProfile = this.returnPolicyProfile;
      result.status = this.status;
      result.type = this.type;
      result.webPresence = this.webPresence;
      result.webPresences = this.webPresences;
      return result;
    }

    /**
     * Whether the market has a customization with the given ID.
     */
    public Builder assignedCustomization(boolean assignedCustomization) {
      this.assignedCustomization = assignedCustomization;
      return this;
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
     * The market's direct children. Eventually consistent following a change in
     * market hierarchy. See [`marketRelationshipsStatus`](https://shopify.dev/docs/api/admin-graphql/latest/queries/marketRelationshipsStatus).
     */
    public Builder childMarkets(MarketConnection childMarkets) {
      this.childMarkets = childMarkets;
      return this;
    }

    /**
     * The number of direct child markets. Eventually consistent following a change
     * in market hierarchy. See [`marketRelationshipsStatus`](https://shopify.dev/docs/api/admin-graphql/latest/queries/marketRelationshipsStatus).
     */
    public Builder childMarketsCount(Count childMarketsCount) {
      this.childMarketsCount = childMarketsCount;
      return this;
    }

    /**
     * The conditions under which a visitor is in the market.
     */
    public Builder conditions(MarketConditions conditions) {
      this.conditions = conditions;
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
     * The delivery settings for this market.
     */
    public Builder delivery(MarketDeliveryConfigurations delivery) {
      this.delivery = delivery;
      return this;
    }

    /**
     * The discounts that are available in this market.
     */
    public Builder discounts(DiscountNodeConnection discounts) {
      this.discounts = discounts;
      return this;
    }

    /**
     * The number of discounts that are assigned to this market.
     */
    public Builder discountsCount(Count discountsCount) {
      this.discountsCount = discountsCount;
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
     * The market's direct parents. Eventually consistent following a change in
     * market hierarchy. See [`marketRelationshipsStatus`](https://shopify.dev/docs/api/admin-graphql/latest/queries/marketRelationshipsStatus).
     */
    public Builder parentMarkets(MarketConnection parentMarkets) {
      this.parentMarkets = parentMarkets;
      return this;
    }

    /**
     * The number of direct parent markets. Eventually consistent following a change
     * in market hierarchy. See [`marketRelationshipsStatus`](https://shopify.dev/docs/api/admin-graphql/latest/queries/marketRelationshipsStatus).
     */
    public Builder parentMarketsCount(Count parentMarketsCount) {
      this.parentMarketsCount = parentMarketsCount;
      return this;
    }

    /**
     * The inclusive pricing strategy for a market. This determines if prices include duties and / or taxes.
     */
    public Builder priceInclusions(MarketPriceInclusions priceInclusions) {
      this.priceInclusions = priceInclusions;
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
     * The regions that comprise the market.
     */
    public Builder regions(MarketRegionConnection regions) {
      this.regions = regions;
      return this;
    }

    /**
     * The return policy profile for this market.
     */
    public Builder returnPolicyProfile(ReturnPolicyProfile returnPolicyProfile) {
      this.returnPolicyProfile = returnPolicyProfile;
      return this;
    }

    /**
     * Status of the market. Replaces the enabled field.
     */
    public Builder status(MarketStatus status) {
      this.status = status;
      return this;
    }

    /**
     * The type of the market.
     */
    public Builder type(MarketType type) {
      this.type = type;
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
