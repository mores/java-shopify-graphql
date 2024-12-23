package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "__typename"
)
@JsonSubTypes({
    @JsonSubTypes.Type(value = CustomerCreditCard.class, name = "CustomerCreditCard"),
    @JsonSubTypes.Type(value = CustomerPaypalBillingAgreement.class, name = "CustomerPaypalBillingAgreement"),
    @JsonSubTypes.Type(value = CustomerShopPayAgreement.class, name = "CustomerShopPayAgreement")
})
public interface CustomerPaymentInstrument {
}
