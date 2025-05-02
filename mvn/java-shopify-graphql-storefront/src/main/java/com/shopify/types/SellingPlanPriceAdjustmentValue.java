package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "__typename"
)
@JsonSubTypes({
    @JsonSubTypes.Type(value = SellingPlanFixedAmountPriceAdjustment.class, name = "SellingPlanFixedAmountPriceAdjustment"),
    @JsonSubTypes.Type(value = SellingPlanFixedPriceAdjustment.class, name = "SellingPlanFixedPriceAdjustment"),
    @JsonSubTypes.Type(value = SellingPlanPercentagePriceAdjustment.class, name = "SellingPlanPercentagePriceAdjustment")
})
public interface SellingPlanPriceAdjustmentValue {
}
