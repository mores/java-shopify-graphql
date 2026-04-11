package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Provides the capabilities of a metafield definition.
 */
public class MetafieldCapabilities {
  /**
   * Indicate whether a metafield definition is configured for filtering.
   */
  private MetafieldCapabilityAdminFilterable adminFilterable;

  /**
   * Indicate whether a metafield definition can be queried in analytics.
   */
  private MetafieldCapabilityAnalyticsQueryable analyticsQueryable;

  /**
   * The capability configuration for automatically copying values from a cart
   * metafield to the corresponding order metafield when an order is created.
   */
  private MetafieldCapabilityCartToOrderCopyable cartToOrderCopyable;

  /**
   * Indicate whether a metafield definition can be used as a smart collection condition.
   */
  private MetafieldCapabilitySmartCollectionCondition smartCollectionCondition;

  /**
   * Indicate whether the metafield values for a metafield definition are required to be unique.
   */
  private MetafieldCapabilityUniqueValues uniqueValues;

  public MetafieldCapabilities() {
  }

  /**
   * Indicate whether a metafield definition is configured for filtering.
   */
  public MetafieldCapabilityAdminFilterable getAdminFilterable() {
    return adminFilterable;
  }

  public void setAdminFilterable(MetafieldCapabilityAdminFilterable adminFilterable) {
    this.adminFilterable = adminFilterable;
  }

  /**
   * Indicate whether a metafield definition can be queried in analytics.
   */
  public MetafieldCapabilityAnalyticsQueryable getAnalyticsQueryable() {
    return analyticsQueryable;
  }

  public void setAnalyticsQueryable(MetafieldCapabilityAnalyticsQueryable analyticsQueryable) {
    this.analyticsQueryable = analyticsQueryable;
  }

  /**
   * The capability configuration for automatically copying values from a cart
   * metafield to the corresponding order metafield when an order is created.
   */
  public MetafieldCapabilityCartToOrderCopyable getCartToOrderCopyable() {
    return cartToOrderCopyable;
  }

  public void setCartToOrderCopyable(MetafieldCapabilityCartToOrderCopyable cartToOrderCopyable) {
    this.cartToOrderCopyable = cartToOrderCopyable;
  }

  /**
   * Indicate whether a metafield definition can be used as a smart collection condition.
   */
  public MetafieldCapabilitySmartCollectionCondition getSmartCollectionCondition() {
    return smartCollectionCondition;
  }

  public void setSmartCollectionCondition(
      MetafieldCapabilitySmartCollectionCondition smartCollectionCondition) {
    this.smartCollectionCondition = smartCollectionCondition;
  }

  /**
   * Indicate whether the metafield values for a metafield definition are required to be unique.
   */
  public MetafieldCapabilityUniqueValues getUniqueValues() {
    return uniqueValues;
  }

  public void setUniqueValues(MetafieldCapabilityUniqueValues uniqueValues) {
    this.uniqueValues = uniqueValues;
  }

  @Override
  public String toString() {
    return "MetafieldCapabilities{adminFilterable='" + adminFilterable + "', analyticsQueryable='" + analyticsQueryable + "', cartToOrderCopyable='" + cartToOrderCopyable + "', smartCollectionCondition='" + smartCollectionCondition + "', uniqueValues='" + uniqueValues + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MetafieldCapabilities that = (MetafieldCapabilities) o;
    return Objects.equals(adminFilterable, that.adminFilterable) &&
        Objects.equals(analyticsQueryable, that.analyticsQueryable) &&
        Objects.equals(cartToOrderCopyable, that.cartToOrderCopyable) &&
        Objects.equals(smartCollectionCondition, that.smartCollectionCondition) &&
        Objects.equals(uniqueValues, that.uniqueValues);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adminFilterable, analyticsQueryable, cartToOrderCopyable, smartCollectionCondition, uniqueValues);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Indicate whether a metafield definition is configured for filtering.
     */
    private MetafieldCapabilityAdminFilterable adminFilterable;

    /**
     * Indicate whether a metafield definition can be queried in analytics.
     */
    private MetafieldCapabilityAnalyticsQueryable analyticsQueryable;

    /**
     * The capability configuration for automatically copying values from a cart
     * metafield to the corresponding order metafield when an order is created.
     */
    private MetafieldCapabilityCartToOrderCopyable cartToOrderCopyable;

    /**
     * Indicate whether a metafield definition can be used as a smart collection condition.
     */
    private MetafieldCapabilitySmartCollectionCondition smartCollectionCondition;

    /**
     * Indicate whether the metafield values for a metafield definition are required to be unique.
     */
    private MetafieldCapabilityUniqueValues uniqueValues;

    public MetafieldCapabilities build() {
      MetafieldCapabilities result = new MetafieldCapabilities();
      result.adminFilterable = this.adminFilterable;
      result.analyticsQueryable = this.analyticsQueryable;
      result.cartToOrderCopyable = this.cartToOrderCopyable;
      result.smartCollectionCondition = this.smartCollectionCondition;
      result.uniqueValues = this.uniqueValues;
      return result;
    }

    /**
     * Indicate whether a metafield definition is configured for filtering.
     */
    public Builder adminFilterable(MetafieldCapabilityAdminFilterable adminFilterable) {
      this.adminFilterable = adminFilterable;
      return this;
    }

    /**
     * Indicate whether a metafield definition can be queried in analytics.
     */
    public Builder analyticsQueryable(MetafieldCapabilityAnalyticsQueryable analyticsQueryable) {
      this.analyticsQueryable = analyticsQueryable;
      return this;
    }

    /**
     * The capability configuration for automatically copying values from a cart
     * metafield to the corresponding order metafield when an order is created.
     */
    public Builder cartToOrderCopyable(MetafieldCapabilityCartToOrderCopyable cartToOrderCopyable) {
      this.cartToOrderCopyable = cartToOrderCopyable;
      return this;
    }

    /**
     * Indicate whether a metafield definition can be used as a smart collection condition.
     */
    public Builder smartCollectionCondition(
        MetafieldCapabilitySmartCollectionCondition smartCollectionCondition) {
      this.smartCollectionCondition = smartCollectionCondition;
      return this;
    }

    /**
     * Indicate whether the metafield values for a metafield definition are required to be unique.
     */
    public Builder uniqueValues(MetafieldCapabilityUniqueValues uniqueValues) {
      this.uniqueValues = uniqueValues;
      return this;
    }
  }
}
