package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;


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
  
  SellingPlanPricingPolicyAdjustmentType getAdjustmentType();

  
  SellingPlanPricingPolicyAdjustmentValue getAdjustmentValue();
}
