package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "__typename"
)
@JsonSubTypes({
    @JsonSubTypes.Type(value = SubscriptionShippingOptionResultFailure.class, name = "SubscriptionShippingOptionResultFailure"),
    @JsonSubTypes.Type(value = SubscriptionShippingOptionResultSuccess.class, name = "SubscriptionShippingOptionResultSuccess")
})
public interface SubscriptionShippingOptionResult {
}
