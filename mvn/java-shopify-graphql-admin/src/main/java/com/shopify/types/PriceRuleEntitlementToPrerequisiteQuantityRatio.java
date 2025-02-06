package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Quantity of prerequisite items required for the price rule to be applicable, compared to quantity of entitled items.
 */
public class PriceRuleEntitlementToPrerequisiteQuantityRatio {
  /**
   * The quantity of entitled items in the ratio.
   */
  private int entitlementQuantity;

  /**
   * The quantity of prerequisite items in the ratio.
   */
  private int prerequisiteQuantity;

  public PriceRuleEntitlementToPrerequisiteQuantityRatio() {
  }

  /**
   * The quantity of entitled items in the ratio.
   */
  public int getEntitlementQuantity() {
    return entitlementQuantity;
  }

  public void setEntitlementQuantity(int entitlementQuantity) {
    this.entitlementQuantity = entitlementQuantity;
  }

  /**
   * The quantity of prerequisite items in the ratio.
   */
  public int getPrerequisiteQuantity() {
    return prerequisiteQuantity;
  }

  public void setPrerequisiteQuantity(int prerequisiteQuantity) {
    this.prerequisiteQuantity = prerequisiteQuantity;
  }

  @Override
  public String toString() {
    return "PriceRuleEntitlementToPrerequisiteQuantityRatio{entitlementQuantity='" + entitlementQuantity + "', prerequisiteQuantity='" + prerequisiteQuantity + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PriceRuleEntitlementToPrerequisiteQuantityRatio that = (PriceRuleEntitlementToPrerequisiteQuantityRatio) o;
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
    /**
     * The quantity of entitled items in the ratio.
     */
    private int entitlementQuantity;

    /**
     * The quantity of prerequisite items in the ratio.
     */
    private int prerequisiteQuantity;

    public PriceRuleEntitlementToPrerequisiteQuantityRatio build() {
      PriceRuleEntitlementToPrerequisiteQuantityRatio result = new PriceRuleEntitlementToPrerequisiteQuantityRatio();
      result.entitlementQuantity = this.entitlementQuantity;
      result.prerequisiteQuantity = this.prerequisiteQuantity;
      return result;
    }

    /**
     * The quantity of entitled items in the ratio.
     */
    public Builder entitlementQuantity(int entitlementQuantity) {
      this.entitlementQuantity = entitlementQuantity;
      return this;
    }

    /**
     * The quantity of prerequisite items in the ratio.
     */
    public Builder prerequisiteQuantity(int prerequisiteQuantity) {
      this.prerequisiteQuantity = prerequisiteQuantity;
      return this;
    }
  }
}
