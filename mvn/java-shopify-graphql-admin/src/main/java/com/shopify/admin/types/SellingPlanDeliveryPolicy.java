package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "__typename"
)
@JsonSubTypes({
    @JsonSubTypes.Type(value = SellingPlanFixedDeliveryPolicy.class, name = "SellingPlanFixedDeliveryPolicy"),
    @JsonSubTypes.Type(value = SellingPlanRecurringDeliveryPolicy.class, name = "SellingPlanRecurringDeliveryPolicy")
})
public interface SellingPlanDeliveryPolicy {
}
