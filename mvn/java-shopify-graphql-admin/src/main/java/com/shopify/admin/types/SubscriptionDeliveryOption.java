package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "__typename"
)
@JsonSubTypes({
    @JsonSubTypes.Type(value = SubscriptionLocalDeliveryOption.class, name = "SubscriptionLocalDeliveryOption"),
    @JsonSubTypes.Type(value = SubscriptionPickupOption.class, name = "SubscriptionPickupOption"),
    @JsonSubTypes.Type(value = SubscriptionShippingOption.class, name = "SubscriptionShippingOption")
})
public interface SubscriptionDeliveryOption {
}
