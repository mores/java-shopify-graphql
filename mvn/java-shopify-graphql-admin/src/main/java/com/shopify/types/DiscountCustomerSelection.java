package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "__typename"
)
@JsonSubTypes({
    @JsonSubTypes.Type(value = DiscountCustomerAll.class, name = "DiscountCustomerAll"),
    @JsonSubTypes.Type(value = DiscountCustomerSegments.class, name = "DiscountCustomerSegments"),
    @JsonSubTypes.Type(value = DiscountCustomers.class, name = "DiscountCustomers")
})
public interface DiscountCustomerSelection {
}
