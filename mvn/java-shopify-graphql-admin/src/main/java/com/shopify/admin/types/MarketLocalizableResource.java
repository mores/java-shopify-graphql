package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * A resource that has market localizable fields.
 */
public class MarketLocalizableResource {
  /**
   * The market localizable content.
   */
  private List<MarketLocalizableContent> marketLocalizableContent;

  /**
   * Market localizations for the market localizable content.
   */
  private List<MarketLocalization> marketLocalizations;

  /**
   * The GID of the resource.
   */
  private String resourceId;

  public MarketLocalizableResource() {
  }

  /**
   * The market localizable content.
   */
  public List<MarketLocalizableContent> getMarketLocalizableContent() {
    return marketLocalizableContent;
  }

  public void setMarketLocalizableContent(List<MarketLocalizableContent> marketLocalizableContent) {
    this.marketLocalizableContent = marketLocalizableContent;
  }

  /**
   * Market localizations for the market localizable content.
   */
  public List<MarketLocalization> getMarketLocalizations() {
    return marketLocalizations;
  }

  public void setMarketLocalizations(List<MarketLocalization> marketLocalizations) {
    this.marketLocalizations = marketLocalizations;
  }

  /**
   * The GID of the resource.
   */
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
    /**
     * The market localizable content.
     */
    private List<MarketLocalizableContent> marketLocalizableContent;

    /**
     * Market localizations for the market localizable content.
     */
    private List<MarketLocalization> marketLocalizations;

    /**
     * The GID of the resource.
     */
    private String resourceId;

    public MarketLocalizableResource build() {
      MarketLocalizableResource result = new MarketLocalizableResource();
      result.marketLocalizableContent = this.marketLocalizableContent;
      result.marketLocalizations = this.marketLocalizations;
      result.resourceId = this.resourceId;
      return result;
    }

    /**
     * The market localizable content.
     */
    public Builder marketLocalizableContent(
        List<MarketLocalizableContent> marketLocalizableContent) {
      this.marketLocalizableContent = marketLocalizableContent;
      return this;
    }

    /**
     * Market localizations for the market localizable content.
     */
    public Builder marketLocalizations(List<MarketLocalization> marketLocalizations) {
      this.marketLocalizations = marketLocalizations;
      return this;
    }

    /**
     * The GID of the resource.
     */
    public Builder resourceId(String resourceId) {
      this.resourceId = resourceId;
      return this;
    }
  }
}
