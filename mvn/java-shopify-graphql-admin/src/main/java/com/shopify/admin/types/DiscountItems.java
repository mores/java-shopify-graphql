package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "__typename"
)
@JsonSubTypes({
    @JsonSubTypes.Type(value = AllDiscountItems.class, name = "AllDiscountItems"),
    @JsonSubTypes.Type(value = DiscountCollections.class, name = "DiscountCollections"),
    @JsonSubTypes.Type(value = DiscountProducts.class, name = "DiscountProducts")
})
public interface DiscountItems {
}
