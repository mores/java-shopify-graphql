package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "__typename"
)
@JsonSubTypes({
    @JsonSubTypes.Type(value = SubscriptionDeliveryMethodLocalDelivery.class, name = "SubscriptionDeliveryMethodLocalDelivery"),
    @JsonSubTypes.Type(value = SubscriptionDeliveryMethodPickup.class, name = "SubscriptionDeliveryMethodPickup"),
    @JsonSubTypes.Type(value = SubscriptionDeliveryMethodShipping.class, name = "SubscriptionDeliveryMethodShipping")
})
public interface SubscriptionDeliveryMethod {
}
