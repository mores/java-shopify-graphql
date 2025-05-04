package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "__typename"
)
@JsonSubTypes({
    @JsonSubTypes.Type(value = OrderStagedChangeAddCustomItem.class, name = "OrderStagedChangeAddCustomItem"),
    @JsonSubTypes.Type(value = OrderStagedChangeAddLineItemDiscount.class, name = "OrderStagedChangeAddLineItemDiscount"),
    @JsonSubTypes.Type(value = OrderStagedChangeAddShippingLine.class, name = "OrderStagedChangeAddShippingLine"),
    @JsonSubTypes.Type(value = OrderStagedChangeAddVariant.class, name = "OrderStagedChangeAddVariant"),
    @JsonSubTypes.Type(value = OrderStagedChangeDecrementItem.class, name = "OrderStagedChangeDecrementItem"),
    @JsonSubTypes.Type(value = OrderStagedChangeIncrementItem.class, name = "OrderStagedChangeIncrementItem"),
    @JsonSubTypes.Type(value = OrderStagedChangeRemoveShippingLine.class, name = "OrderStagedChangeRemoveShippingLine")
})
public interface OrderStagedChange {
}
