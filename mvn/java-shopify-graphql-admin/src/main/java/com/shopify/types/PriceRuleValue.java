package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "__typename"
)
@JsonSubTypes({
    @JsonSubTypes.Type(value = PriceRuleFixedAmountValue.class, name = "PriceRuleFixedAmountValue"),
    @JsonSubTypes.Type(value = PriceRulePercentValue.class, name = "PriceRulePercentValue")
})
public interface PriceRuleValue {
}
