package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "__typename"
)
@JsonSubTypes({
    @JsonSubTypes.Type(value = VaultCreditCard.class, name = "VaultCreditCard"),
    @JsonSubTypes.Type(value = VaultPaypalBillingAgreement.class, name = "VaultPaypalBillingAgreement")
})
public interface PaymentInstrument {
}