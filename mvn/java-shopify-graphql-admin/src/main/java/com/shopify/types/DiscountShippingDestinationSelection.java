package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "__typename"
)
@JsonSubTypes({
    @JsonSubTypes.Type(value = DiscountCountries.class, name = "DiscountCountries"),
    @JsonSubTypes.Type(value = DiscountCountryAll.class, name = "DiscountCountryAll")
})
public interface DiscountShippingDestinationSelection {
}
