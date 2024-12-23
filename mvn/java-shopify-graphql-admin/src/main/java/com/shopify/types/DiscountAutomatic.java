package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "__typename"
)
@JsonSubTypes({
    @JsonSubTypes.Type(value = DiscountAutomaticApp.class, name = "DiscountAutomaticApp"),
    @JsonSubTypes.Type(value = DiscountAutomaticBasic.class, name = "DiscountAutomaticBasic"),
    @JsonSubTypes.Type(value = DiscountAutomaticBxgy.class, name = "DiscountAutomaticBxgy"),
    @JsonSubTypes.Type(value = DiscountAutomaticFreeShipping.class, name = "DiscountAutomaticFreeShipping")
})
public interface DiscountAutomatic {
}
