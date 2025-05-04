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
    return "MetafieldCapabilities{adminFilterable='" + adminFilterable + "', smartCollectionCondition='" + smartCollectionCondition + "', uniqueValues='" + uniqueValues + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MetafieldCapabilities that = (MetafieldCapabilities) o;
    return Objects.equals(adminFilterable, that.adminFilterable) &&
        Objects.equals(smartCollectionCondition, that.smartCollectionCondition) &&
        Objects.equals(uniqueValues, that.uniqueValues);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adminFilterable, smartCollectionCondition, uniqueValues);
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
