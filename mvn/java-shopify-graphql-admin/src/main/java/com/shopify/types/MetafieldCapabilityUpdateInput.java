package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class MetafieldCapabilityUpdateInput {
  
  private MetafieldCapabilitySmartCollectionConditionInput smartCollectionCondition;

  
  private MetafieldCapabilityAdminFilterableInput adminFilterable;

  public MetafieldCapabilityUpdateInput() {
  }

  
  public MetafieldCapabilitySmartCollectionConditionInput getSmartCollectionCondition() {
    return smartCollectionCondition;
  }

  public void setSmartCollectionCondition(
      MetafieldCapabilitySmartCollectionConditionInput smartCollectionCondition) {
    this.smartCollectionCondition = smartCollectionCondition;
  }

  
  public MetafieldCapabilityAdminFilterableInput getAdminFilterable() {
    return adminFilterable;
  }

  public void setAdminFilterable(MetafieldCapabilityAdminFilterableInput adminFilterable) {
    this.adminFilterable = adminFilterable;
  }

  @Override
  public String toString() {
    return "MetafieldCapabilityUpdateInput{smartCollectionCondition='" + smartCollectionCondition + "', adminFilterable='" + adminFilterable + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MetafieldCapabilityUpdateInput that = (MetafieldCapabilityUpdateInput) o;
    return Objects.equals(smartCollectionCondition, that.smartCollectionCondition) &&
        Objects.equals(adminFilterable, that.adminFilterable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(smartCollectionCondition, adminFilterable);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private MetafieldCapabilitySmartCollectionConditionInput smartCollectionCondition;

    
    private MetafieldCapabilityAdminFilterableInput adminFilterable;

    public MetafieldCapabilityUpdateInput build() {
      MetafieldCapabilityUpdateInput result = new MetafieldCapabilityUpdateInput();
      result.smartCollectionCondition = this.smartCollectionCondition;
      result.adminFilterable = this.adminFilterable;
      return result;
    }

    
    public Builder smartCollectionCondition(
        MetafieldCapabilitySmartCollectionConditionInput smartCollectionCondition) {
      this.smartCollectionCondition = smartCollectionCondition;
      return this;
    }

    
    public Builder adminFilterable(MetafieldCapabilityAdminFilterableInput adminFilterable) {
      this.adminFilterable = adminFilterable;
      return this;
    }
  }
}
