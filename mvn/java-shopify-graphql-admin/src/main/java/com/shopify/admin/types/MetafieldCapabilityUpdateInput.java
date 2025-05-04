package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for updating a metafield capability.
 */
public class MetafieldCapabilityUpdateInput {
  /**
   * The input for updating the smart collection condition capability.
   */
  private MetafieldCapabilitySmartCollectionConditionInput smartCollectionCondition;

  /**
   * The input for updating the admin filterable capability.
   */
  private MetafieldCapabilityAdminFilterableInput adminFilterable;

  /**
   * The input for updating the unique values capability.
   */
  private MetafieldCapabilityUniqueValuesInput uniqueValues;

  public MetafieldCapabilityUpdateInput() {
  }

  /**
   * The input for updating the smart collection condition capability.
   */
  public MetafieldCapabilitySmartCollectionConditionInput getSmartCollectionCondition() {
    return smartCollectionCondition;
  }

  public void setSmartCollectionCondition(
      MetafieldCapabilitySmartCollectionConditionInput smartCollectionCondition) {
    this.smartCollectionCondition = smartCollectionCondition;
  }

  /**
   * The input for updating the admin filterable capability.
   */
  public MetafieldCapabilityAdminFilterableInput getAdminFilterable() {
    return adminFilterable;
  }

  public void setAdminFilterable(MetafieldCapabilityAdminFilterableInput adminFilterable) {
    this.adminFilterable = adminFilterable;
  }

  /**
   * The input for updating the unique values capability.
   */
  public MetafieldCapabilityUniqueValuesInput getUniqueValues() {
    return uniqueValues;
  }

  public void setUniqueValues(MetafieldCapabilityUniqueValuesInput uniqueValues) {
    this.uniqueValues = uniqueValues;
  }

  @Override
  public String toString() {
    return "MetafieldCapabilityUpdateInput{smartCollectionCondition='" + smartCollectionCondition + "', adminFilterable='" + adminFilterable + "', uniqueValues='" + uniqueValues + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MetafieldCapabilityUpdateInput that = (MetafieldCapabilityUpdateInput) o;
    return Objects.equals(smartCollectionCondition, that.smartCollectionCondition) &&
        Objects.equals(adminFilterable, that.adminFilterable) &&
        Objects.equals(uniqueValues, that.uniqueValues);
  }

  @Override
  public int hashCode() {
    return Objects.hash(smartCollectionCondition, adminFilterable, uniqueValues);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The input for updating the smart collection condition capability.
     */
    private MetafieldCapabilitySmartCollectionConditionInput smartCollectionCondition;

    /**
     * The input for updating the admin filterable capability.
     */
    private MetafieldCapabilityAdminFilterableInput adminFilterable;

    /**
     * The input for updating the unique values capability.
     */
    private MetafieldCapabilityUniqueValuesInput uniqueValues;

    public MetafieldCapabilityUpdateInput build() {
      MetafieldCapabilityUpdateInput result = new MetafieldCapabilityUpdateInput();
      result.smartCollectionCondition = this.smartCollectionCondition;
      result.adminFilterable = this.adminFilterable;
      result.uniqueValues = this.uniqueValues;
      return result;
    }

    /**
     * The input for updating the smart collection condition capability.
     */
    public Builder smartCollectionCondition(
        MetafieldCapabilitySmartCollectionConditionInput smartCollectionCondition) {
      this.smartCollectionCondition = smartCollectionCondition;
      return this;
    }

    /**
     * The input for updating the admin filterable capability.
     */
    public Builder adminFilterable(MetafieldCapabilityAdminFilterableInput adminFilterable) {
      this.adminFilterable = adminFilterable;
      return this;
    }

    /**
     * The input for updating the unique values capability.
     */
    public Builder uniqueValues(MetafieldCapabilityUniqueValuesInput uniqueValues) {
      this.uniqueValues = uniqueValues;
      return this;
    }
  }
}
