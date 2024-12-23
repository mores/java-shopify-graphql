package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "__typename"
)
@JsonSubTypes({
    @JsonSubTypes.Type(value = SellingPlanFixedBillingPolicy.class, name = "SellingPlanFixedBillingPolicy"),
    @JsonSubTypes.Type(value = SellingPlanRecurringBillingPolicy.class, name = "SellingPlanRecurringBillingPolicy")
})
public interface SellingPlanBillingPolicy {
}
