package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "__typename"
)
@JsonSubTypes({
    @JsonSubTypes.Type(value = CardPaymentDetails.class, name = "CardPaymentDetails"),
    @JsonSubTypes.Type(value = LocalPaymentMethodsPaymentDetails.class, name = "LocalPaymentMethodsPaymentDetails"),
    @JsonSubTypes.Type(value = ShopPayInstallmentsPaymentDetails.class, name = "ShopPayInstallmentsPaymentDetails")
})
public interface PaymentDetails {
}
