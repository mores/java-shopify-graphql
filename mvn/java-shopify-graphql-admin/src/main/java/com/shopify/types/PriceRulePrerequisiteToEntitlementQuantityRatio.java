package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class PriceRulePrerequisiteToEntitlementQuantityRatio {
  
  private int entitlementQuantity;

  
  private int prerequisiteQuantity;

  public PriceRulePrerequisiteToEntitlementQuantityRatio() {
  }

  
  public int getEntitlementQuantity() {
    return entitlementQuantity;
  }

  public void setEntitlementQuantity(int entitlementQuantity) {
    this.entitlementQuantity = entitlementQuantity;
  }

  
  public int getPrerequisiteQuantity() {
    return prerequisiteQuantity;
  }

  public void setPrerequisiteQuantity(int prerequisiteQuantity) {
    this.prerequisiteQuantity = prerequisiteQuantity;
  }

  @Override
  public String toString() {
    return "PriceRulePrerequisiteToEntitlementQuantityRatio{entitlementQuantity='" + entitlementQuantity + "', prerequisiteQuantity='" + prerequisiteQuantity + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PriceRulePrerequisiteToEntitlementQuantityRatio that = (PriceRulePrerequisiteToEntitlementQuantityRatio) o;
    return entitlementQuantity == that.entitlementQuantity &&
        prerequisiteQuantity == that.prerequisiteQuantity;
  }

  @Override
  public int hashCode() {
    return Objects.hash(entitlementQuantity, prerequisiteQuantity);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private int entitlementQuantity;

    
    private int prerequisiteQuantity;

    public PriceRulePrerequisiteToEntitlementQuantityRatio build() {
      PriceRulePrerequisiteToEntitlementQuantityRatio result = new PriceRulePrerequisiteToEntitlementQuantityRatio();
      result.entitlementQuantity = this.entitlementQuantity;
      result.prerequisiteQuantity = this.prerequisiteQuantity;
      return result;
    }

    
    public Builder entitlementQuantity(int entitlementQuantity) {
      this.entitlementQuantity = entitlementQuantity;
      return this;
    }

    
    public Builder prerequisiteQuantity(int prerequisiteQuantity) {
      this.prerequisiteQuantity = prerequisiteQuantity;
      return this;
    }
  }
}
