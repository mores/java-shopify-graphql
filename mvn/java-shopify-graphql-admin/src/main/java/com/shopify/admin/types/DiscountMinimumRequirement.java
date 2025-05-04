package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "__typename"
)
@JsonSubTypes({
    @JsonSubTypes.Type(value = DiscountMinimumQuantity.class, name = "DiscountMinimumQuantity"),
    @JsonSubTypes.Type(value = DiscountMinimumSubtotal.class, name = "DiscountMinimumSubtotal")
})
public interface DiscountMinimumRequirement {
}
