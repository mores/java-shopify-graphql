package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "__typename"
)
@JsonSubTypes({
    @JsonSubTypes.Type(value = AppSubscriptionDiscountAmount.class, name = "AppSubscriptionDiscountAmount"),
    @JsonSubTypes.Type(value = AppSubscriptionDiscountPercentage.class, name = "AppSubscriptionDiscountPercentage")
})
public interface AppSubscriptionDiscountValue {
}
