package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "__typename"
)
@JsonSubTypes({
    @JsonSubTypes.Type(value = SubscriptionAppliedCodeDiscount.class, name = "SubscriptionAppliedCodeDiscount"),
    @JsonSubTypes.Type(value = SubscriptionManualDiscount.class, name = "SubscriptionManualDiscount")
})
public interface SubscriptionDiscount {
}
