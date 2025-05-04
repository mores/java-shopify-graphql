package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "__typename"
)
@JsonSubTypes({
    @JsonSubTypes.Type(value = AppRecurringPricing.class, name = "AppRecurringPricing"),
    @JsonSubTypes.Type(value = AppUsagePricing.class, name = "AppUsagePricing")
})
public interface AppPricingDetails {
}
