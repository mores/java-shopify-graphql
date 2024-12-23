package com.shopify.types;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * The input fields for a shop locale.
 */
public class ShopLocaleInput {
  /**
   * Whether the locale is published. Only published locales are visible to the buyer.
   */
  private Boolean published;

  /**
   * The market web presences on which the locale should be enabled. Pass in an
   * empty array to remove the locale across all market web presences.
   */
  private List<String> marketWebPresenceIds;

  public ShopLocaleInput() {
  }

  /**
   * Whether the locale is published. Only published locales are visible to the buyer.
   */
  public Boolean getPublished() {
    return published;
  }

  public void setPublished(Boolean published) {
    this.published = published;
  }

  /**
   * The market web presences on which the locale should be enabled. Pass in an
   * empty array to remove the locale across all market web presences.
   */
  public List<String> getMarketWebPresenceIds() {
    return marketWebPresenceIds;
  }

  public void setMarketWebPresenceIds(List<String> marketWebPresenceIds) {
    this.marketWebPresenceIds = marketWebPresenceIds;
  }

  @Override
  public String toString() {
    return "ShopLocaleInput{published='" + published + "', marketWebPresenceIds='" + marketWebPresenceIds + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ShopLocaleInput that = (ShopLocaleInput) o;
    return Objects.equals(published, that.published) &&
        Objects.equals(marketWebPresenceIds, that.marketWebPresenceIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(published, marketWebPresenceIds);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Whether the locale is published. Only published locales are visible to the buyer.
     */
    private Boolean published;

    /**
     * The market web presences on which the locale should be enabled. Pass in an
     * empty array to remove the locale across all market web presences.
     */
    private List<String> marketWebPresenceIds;

    public ShopLocaleInput build() {
      ShopLocaleInput result = new ShopLocaleInput();
      result.published = this.published;
      result.marketWebPresenceIds = this.marketWebPresenceIds;
      return result;
    }

    /**
     * Whether the locale is published. Only published locales are visible to the buyer.
     */
    public Builder published(Boolean published) {
      this.published = published;
      return this;
    }

    /**
     * The market web presences on which the locale should be enabled. Pass in an
     * empty array to remove the locale across all market web presences.
     */
    public Builder marketWebPresenceIds(List<String> marketWebPresenceIds) {
      this.marketWebPresenceIds = marketWebPresenceIds;
      return this;
    }
  }
}
