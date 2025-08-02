package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.String;

/**
 * Generic payment details that are related to a transaction.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "__typename"
)
@JsonSubTypes({
    @JsonSubTypes.Type(value = CardPaymentDetails.class, name = "CardPaymentDetails"),
    @JsonSubTypes.Type(value = LocalPaymentMethodsPaymentDetails.class, name = "LocalPaymentMethodsPaymentDetails"),
    @JsonSubTypes.Type(value = PaypalWalletPaymentDetails.class, name = "PaypalWalletPaymentDetails"),
    @JsonSubTypes.Type(value = ShopPayInstallmentsPaymentDetails.class, name = "ShopPayInstallmentsPaymentDetails")
})
public interface BasePaymentDetails {
  /**
   * The name of payment method used by the buyer.
   */
  String getPaymentMethodName();
}
