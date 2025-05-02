package com.shopify.storefront.types;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "__typename"
)
@JsonSubTypes({
    @JsonSubTypes.Type(value = MoneyV2.class, name = "MoneyV2"),
    @JsonSubTypes.Type(value = PricingPercentageValue.class, name = "PricingPercentageValue")
})
public interface PricingValue {
}
