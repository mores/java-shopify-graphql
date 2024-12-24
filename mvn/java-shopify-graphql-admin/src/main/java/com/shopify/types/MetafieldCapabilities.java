package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class MetafieldCapabilities {
  
  private MetafieldCapabilityAdminFilterable adminFilterable;

  
  private MetafieldCapabilitySmartCollectionCondition smartCollectionCondition;

  public MetafieldCapabilities() {
  }

  
  public MetafieldCapabilityAdminFilterable getAdminFilterable() {
    return adminFilterable;
  }

  public void setAdminFilterable(MetafieldCapabilityAdminFilterable adminFilterable) {
    this.adminFilterable = adminFilterable;
  }

  
  public MetafieldCapabilitySmartCollectionCondition getSmartCollectionCondition() {
    return smartCollectionCondition;
  }

  public void setSmartCollectionCondition(
      MetafieldCapabilitySmartCollectionCondition smartCollectionCondition) {
    this.smartCollectionCondition = smartCollectionCondition;
  }

  @Override
  public String toString() {
    return "MetafieldCapabilities{adminFilterable='" + adminFilterable + "', smartCollectionCondition='" + smartCollectionCondition + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MetafieldCapabilities that = (MetafieldCapabilities) o;
    return Objects.equals(adminFilterable, that.adminFilterable) &&
        Objects.equals(smartCollectionCondition, that.smartCollectionCondition);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adminFilterable, smartCollectionCondition);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private MetafieldCapabilityAdminFilterable adminFilterable;

    
    private MetafieldCapabilitySmartCollectionCondition smartCollectionCondition;

    public MetafieldCapabilities build() {
      MetafieldCapabilities result = new MetafieldCapabilities();
      result.adminFilterable = this.adminFilterable;
      result.smartCollectionCondition = this.smartCollectionCondition;
      return result;
    }

    
    public Builder adminFilterable(MetafieldCapabilityAdminFilterable adminFilterable) {
      this.adminFilterable = adminFilterable;
      return this;
    }

    
    public Builder smartCollectionCondition(
        MetafieldCapabilitySmartCollectionCondition smartCollectionCondition) {
      this.smartCollectionCondition = smartCollectionCondition;
      return this;
    }
  }
}
