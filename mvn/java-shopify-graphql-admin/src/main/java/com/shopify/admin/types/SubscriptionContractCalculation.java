package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "__typename"
)
@JsonSubTypes({
    @JsonSubTypes.Type(value = SubscriptionContractCalculationFailure.class, name = "SubscriptionContractCalculationFailure"),
    @JsonSubTypes.Type(value = SubscriptionContractCalculationPending.class, name = "SubscriptionContractCalculationPending"),
    @JsonSubTypes.Type(value = SubscriptionContractCalculationSuccess.class, name = "SubscriptionContractCalculationSuccess")
})
public interface SubscriptionContractCalculation {
}
