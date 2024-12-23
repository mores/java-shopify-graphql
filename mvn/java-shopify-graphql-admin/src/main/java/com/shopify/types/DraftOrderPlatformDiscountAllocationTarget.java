package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "__typename"
)
@JsonSubTypes({
    @JsonSubTypes.Type(value = CalculatedDraftOrderLineItem.class, name = "CalculatedDraftOrderLineItem"),
    @JsonSubTypes.Type(value = DraftOrderLineItem.class, name = "DraftOrderLineItem"),
    @JsonSubTypes.Type(value = ShippingLine.class, name = "ShippingLine")
})
public interface DraftOrderPlatformDiscountAllocationTarget {
}
