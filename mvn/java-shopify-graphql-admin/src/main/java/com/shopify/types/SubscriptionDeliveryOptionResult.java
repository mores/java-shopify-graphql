package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "__typename"
)
@JsonSubTypes({
    @JsonSubTypes.Type(value = SubscriptionDeliveryOptionResultFailure.class, name = "SubscriptionDeliveryOptionResultFailure"),
    @JsonSubTypes.Type(value = SubscriptionDeliveryOptionResultSuccess.class, name = "SubscriptionDeliveryOptionResultSuccess")
})
public interface SubscriptionDeliveryOptionResult {
}
