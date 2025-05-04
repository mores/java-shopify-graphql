package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * The market’s web presence, which defines its SEO strategy. This can be a different domain
 * (e.g. `example.ca`), subdomain (e.g. `ca.example.com`), or subfolders of the primary
 * domain (e.g. `example.com/en-ca`). Each web presence comprises one or more language
 * variants. If a market does not have its own web presence, it is accessible on the shop’s
 * primary domain via [country
 * selectors](https://shopify.dev/themes/internationalization/multiple-currencies-languages#the-country-selector).
 *
 * Note: while the domain/subfolders defined by a market’s web presence are not applicable to
 * custom storefronts, which must manage their own domains and routing, the languages chosen
 * here do govern [the languages available on the Storefront
 * API](https://shopify.dev/custom-storefronts/internationalization/multiple-languages) for the countries in
 * this market.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class MarketWebPresence implements com.shopify.admin.types.Node {
  /**
   * The ShopLocale object for the alternate locales. When a domain is used, these locales will be
   * available as language-specific subfolders. For example, if English is an
   * alternate locale, and `example.ca` is the market’s domain, then
   * `example.ca/en` will load in English.
   */
  private List<ShopLocale> alternateLocales;

  /**
   * The ShopLocale object for the default locale. When a domain is used, this is the locale that will
   * be used when the domain root is accessed. For example, if French is the default locale,
   * and `example.ca` is the market’s domain, then `example.ca` will load in French.
   */
  private ShopLocale defaultLocale;

  /**
   * The web presence’s domain.
   * This field will be null if `subfolderSuffix` isn't null.
   */
  private Domain domain;

  /**
   * A globally-unique ID.
   */
  private String id;

  /**
   * The associated market. This can be null for a web presence that isn't associated with a market.
   */
  private Market market;

  /**
   * The associated markets for this web presence.
   */
  private MarketConnection markets;

  /**
   * The list of root URLs for each of the web presence’s locales. As of version
   * `2024-04` this value will no longer have a trailing slash.
   */
  private List<MarketWebPresenceRootUrl> rootUrls;

  /**
   * The market-specific suffix of the subfolders defined by the web presence.
   * Example: in `/en-us` the subfolder suffix is `us`. This field will be null if
   * `domain` isn't null.
   */
  private String subfolderSuffix;

  public MarketWebPresence() {
  }

  /**
   * The ShopLocale object for the alternate locales. When a domain is used, these locales will be
   * available as language-specific subfolders. For example, if English is an
   * alternate locale, and `example.ca` is the market’s domain, then
   * `example.ca/en` will load in English.
   */
  public List<ShopLocale> getAlternateLocales() {
    return alternateLocales;
  }

  public void setAlternateLocales(List<ShopLocale> alternateLocales) {
    this.alternateLocales = alternateLocales;
  }

  /**
   * The ShopLocale object for the default locale. When a domain is used, this is the locale that will
   * be used when the domain root is accessed. For example, if French is the default locale,
   * and `example.ca` is the market’s domain, then `example.ca` will load in French.
   */
  public ShopLocale getDefaultLocale() {
    return defaultLocale;
  }

  public void setDefaultLocale(ShopLocale defaultLocale) {
    this.defaultLocale = defaultLocale;
  }

  /**
   * The web presence’s domain.
   * This field will be null if `subfolderSuffix` isn't null.
   */
  public Domain getDomain() {
    return domain;
  }

  public void setDomain(Domain domain) {
    this.domain = domain;
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
   * The associated market. This can be null for a web presence that isn't associated with a market.
   */
  public Market getMarket() {
    return market;
  }

  public void setMarket(Market market) {
    this.market = market;
  }

  /**
   * The associated markets for this web presence.
   */
  public MarketConnection getMarkets() {
    return markets;
  }

  public void setMarkets(MarketConnection markets) {
    this.markets = markets;
  }

  /**
   * The list of root URLs for each of the web presence’s locales. As of version
   * `2024-04` this value will no longer have a trailing slash.
   */
  public List<MarketWebPresenceRootUrl> getRootUrls() {
    return rootUrls;
  }

  public void setRootUrls(List<MarketWebPresenceRootUrl> rootUrls) {
    this.rootUrls = rootUrls;
  }

  /**
   * The market-specific suffix of the subfolders defined by the web presence.
   * Example: in `/en-us` the subfolder suffix is `us`. This field will be null if
   * `domain` isn't null.
   */
  public String getSubfolderSuffix() {
    return subfolderSuffix;
  }

  public void setSubfolderSuffix(String subfolderSuffix) {
    this.subfolderSuffix = subfolderSuffix;
  }

  @Override
  public String toString() {
    return "MarketWebPresence{alternateLocales='" + alternateLocales + "', defaultLocale='" + defaultLocale + "', domain='" + domain + "', id='" + id + "', market='" + market + "', markets='" + markets + "', rootUrls='" + rootUrls + "', subfolderSuffix='" + subfolderSuffix + "'}";
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
        Objects.equals(markets, that.markets) &&
        Objects.equals(rootUrls, that.rootUrls) &&
        Objects.equals(subfolderSuffix, that.subfolderSuffix);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alternateLocales, defaultLocale, domain, id, market, markets, rootUrls, subfolderSuffix);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The ShopLocale object for the alternate locales. When a domain is used, these locales will be
     * available as language-specific subfolders. For example, if English is an
     * alternate locale, and `example.ca` is the market’s domain, then
     * `example.ca/en` will load in English.
     */
    private List<ShopLocale> alternateLocales;

    /**
     * The ShopLocale object for the default locale. When a domain is used, this is the locale that will
     * be used when the domain root is accessed. For example, if French is the default locale,
     * and `example.ca` is the market’s domain, then `example.ca` will load in French.
     */
    private ShopLocale defaultLocale;

    /**
     * The web presence’s domain.
     * This field will be null if `subfolderSuffix` isn't null.
     */
    private Domain domain;

    /**
     * A globally-unique ID.
     */
    private String id;

    /**
     * The associated market. This can be null for a web presence that isn't associated with a market.
     */
    private Market market;

    /**
     * The associated markets for this web presence.
     */
    private MarketConnection markets;

    /**
     * The list of root URLs for each of the web presence’s locales. As of version
     * `2024-04` this value will no longer have a trailing slash.
     */
    private List<MarketWebPresenceRootUrl> rootUrls;

    /**
     * The market-specific suffix of the subfolders defined by the web presence.
     * Example: in `/en-us` the subfolder suffix is `us`. This field will be null if
     * `domain` isn't null.
     */
    private String subfolderSuffix;

    public MarketWebPresence build() {
      MarketWebPresence result = new MarketWebPresence();
      result.alternateLocales = this.alternateLocales;
      result.defaultLocale = this.defaultLocale;
      result.domain = this.domain;
      result.id = this.id;
      result.market = this.market;
      result.markets = this.markets;
      result.rootUrls = this.rootUrls;
      result.subfolderSuffix = this.subfolderSuffix;
      return result;
    }

    /**
     * The ShopLocale object for the alternate locales. When a domain is used, these locales will be
     * available as language-specific subfolders. For example, if English is an
     * alternate locale, and `example.ca` is the market’s domain, then
     * `example.ca/en` will load in English.
     */
    public Builder alternateLocales(List<ShopLocale> alternateLocales) {
      this.alternateLocales = alternateLocales;
      return this;
    }

    /**
     * The ShopLocale object for the default locale. When a domain is used, this is the locale that will
     * be used when the domain root is accessed. For example, if French is the default locale,
     * and `example.ca` is the market’s domain, then `example.ca` will load in French.
     */
    public Builder defaultLocale(ShopLocale defaultLocale) {
      this.defaultLocale = defaultLocale;
      return this;
    }

    /**
     * The web presence’s domain.
     * This field will be null if `subfolderSuffix` isn't null.
     */
    public Builder domain(Domain domain) {
      this.domain = domain;
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
     * The associated market. This can be null for a web presence that isn't associated with a market.
     */
    public Builder market(Market market) {
      this.market = market;
      return this;
    }

    /**
     * The associated markets for this web presence.
     */
    public Builder markets(MarketConnection markets) {
      this.markets = markets;
      return this;
    }

    /**
     * The list of root URLs for each of the web presence’s locales. As of version
     * `2024-04` this value will no longer have a trailing slash.
     */
    public Builder rootUrls(List<MarketWebPresenceRootUrl> rootUrls) {
      this.rootUrls = rootUrls;
      return this;
    }

    /**
     * The market-specific suffix of the subfolders defined by the web presence.
     * Example: in `/en-us` the subfolder suffix is `us`. This field will be null if
     * `domain` isn't null.
     */
    public Builder subfolderSuffix(String subfolderSuffix) {
      this.subfolderSuffix = subfolderSuffix;
      return this;
    }
  }
}
