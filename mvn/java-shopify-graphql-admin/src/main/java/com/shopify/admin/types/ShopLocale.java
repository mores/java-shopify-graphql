package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * A locale that's been enabled on a shop.
 */
public class ShopLocale {
  /**
   * The locale ISO code.
   */
  private String locale;

  /**
   * The market web presences that use the locale.
   */
  private List<MarketWebPresence> marketWebPresences;

  /**
   * The human-readable locale name.
   */
  private String name;

  /**
   * Whether the locale is the default locale for the shop.
   */
  private boolean primary;

  /**
   * Whether the locale is visible to buyers.
   */
  private boolean published;

  public ShopLocale() {
  }

  /**
   * The locale ISO code.
   */
  public String getLocale() {
    return locale;
  }

  public void setLocale(String locale) {
    this.locale = locale;
  }

  /**
   * The market web presences that use the locale.
   */
  public List<MarketWebPresence> getMarketWebPresences() {
    return marketWebPresences;
  }

  public void setMarketWebPresences(List<MarketWebPresence> marketWebPresences) {
    this.marketWebPresences = marketWebPresences;
  }

  /**
   * The human-readable locale name.
   */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  /**
   * Whether the locale is the default locale for the shop.
   */
  public boolean getPrimary() {
    return primary;
  }

  public void setPrimary(boolean primary) {
    this.primary = primary;
  }

  /**
   * Whether the locale is visible to buyers.
   */
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
    /**
     * The locale ISO code.
     */
    private String locale;

    /**
     * The market web presences that use the locale.
     */
    private List<MarketWebPresence> marketWebPresences;

    /**
     * The human-readable locale name.
     */
    private String name;

    /**
     * Whether the locale is the default locale for the shop.
     */
    private boolean primary;

    /**
     * Whether the locale is visible to buyers.
     */
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

    /**
     * The locale ISO code.
     */
    public Builder locale(String locale) {
      this.locale = locale;
      return this;
    }

    /**
     * The market web presences that use the locale.
     */
    public Builder marketWebPresences(List<MarketWebPresence> marketWebPresences) {
      this.marketWebPresences = marketWebPresences;
      return this;
    }

    /**
     * The human-readable locale name.
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Whether the locale is the default locale for the shop.
     */
    public Builder primary(boolean primary) {
      this.primary = primary;
      return this;
    }

    /**
     * Whether the locale is visible to buyers.
     */
    public Builder published(boolean published) {
      this.published = published;
      return this;
    }
  }
}
