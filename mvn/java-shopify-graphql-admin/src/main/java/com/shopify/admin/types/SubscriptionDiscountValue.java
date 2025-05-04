package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "__typename"
)
@JsonSubTypes({
    @JsonSubTypes.Type(value = SubscriptionDiscountFixedAmountValue.class, name = "SubscriptionDiscountFixedAmountValue"),
    @JsonSubTypes.Type(value = SubscriptionDiscountPercentageValue.class, name = "SubscriptionDiscountPercentageValue")
})
public interface SubscriptionDiscountValue {
}
