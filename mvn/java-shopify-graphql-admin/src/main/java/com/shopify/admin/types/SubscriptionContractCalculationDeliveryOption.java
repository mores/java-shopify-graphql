package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "__typename"
)
@JsonSubTypes({
    @JsonSubTypes.Type(value = SubscriptionContractCalculationLocalDeliveryOption.class, name = "SubscriptionContractCalculationLocalDeliveryOption"),
    @JsonSubTypes.Type(value = SubscriptionContractCalculationPickupOption.class, name = "SubscriptionContractCalculationPickupOption"),
    @JsonSubTypes.Type(value = SubscriptionContractCalculationShippingOption.class, name = "SubscriptionContractCalculationShippingOption")
})
public interface SubscriptionContractCalculationDeliveryOption {
}
