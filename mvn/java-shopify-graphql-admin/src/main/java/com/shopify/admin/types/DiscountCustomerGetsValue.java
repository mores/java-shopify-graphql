package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "__typename"
)
@JsonSubTypes({
    @JsonSubTypes.Type(value = DiscountAmount.class, name = "DiscountAmount"),
    @JsonSubTypes.Type(value = DiscountOnQuantity.class, name = "DiscountOnQuantity"),
    @JsonSubTypes.Type(value = DiscountPercentage.class, name = "DiscountPercentage")
})
public interface DiscountCustomerGetsValue {
}
