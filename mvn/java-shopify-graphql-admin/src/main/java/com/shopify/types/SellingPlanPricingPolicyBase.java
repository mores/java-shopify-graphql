package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * Represents selling plan pricing policy common fields.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "__typename"
)
@JsonSubTypes({
    @JsonSubTypes.Type(value = SellingPlanFixedPricingPolicy.class, name = "SellingPlanFixedPricingPolicy"),
    @JsonSubTypes.Type(value = SellingPlanRecurringPricingPolicy.class, name = "SellingPlanRecurringPricingPolicy")
})
public interface SellingPlanPricingPolicyBase {
  /**
   * The price adjustment type.
   */
  SellingPlanPricingPolicyAdjustmentType getAdjustmentType();

  /**
   * The price adjustment value.
   */
  SellingPlanPricingPolicyAdjustmentValue getAdjustmentValue();
}
