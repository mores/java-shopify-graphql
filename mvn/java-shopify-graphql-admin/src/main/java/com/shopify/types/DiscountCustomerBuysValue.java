package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "__typename"
)
@JsonSubTypes({
    @JsonSubTypes.Type(value = DiscountPurchaseAmount.class, name = "DiscountPurchaseAmount"),
    @JsonSubTypes.Type(value = DiscountQuantity.class, name = "DiscountQuantity")
})
public interface DiscountCustomerBuysValue {
}
