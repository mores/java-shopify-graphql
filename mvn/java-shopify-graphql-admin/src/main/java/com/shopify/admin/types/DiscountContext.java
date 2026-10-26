package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "__typename"
)
@JsonSubTypes({
    @JsonSubTypes.Type(value = DiscountBuyerSelectionAll.class, name = "DiscountBuyerSelectionAll"),
    @JsonSubTypes.Type(value = DiscountContextUnknown.class, name = "DiscountContextUnknown"),
    @JsonSubTypes.Type(value = DiscountCustomerSegments.class, name = "DiscountCustomerSegments"),
    @JsonSubTypes.Type(value = DiscountCustomers.class, name = "DiscountCustomers"),
    @JsonSubTypes.Type(value = DiscountMarkets.class, name = "DiscountMarkets")
})
public interface DiscountContext {
}
