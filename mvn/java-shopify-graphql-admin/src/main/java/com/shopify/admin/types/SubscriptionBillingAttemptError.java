package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "__typename"
)
@JsonSubTypes({
    @JsonSubTypes.Type(value = SubscriptionBillingAttemptGeneralError.class, name = "SubscriptionBillingAttemptGeneralError"),
    @JsonSubTypes.Type(value = SubscriptionBillingAttemptInventoryError.class, name = "SubscriptionBillingAttemptInventoryError"),
    @JsonSubTypes.Type(value = SubscriptionBillingAttemptPaymentError.class, name = "SubscriptionBillingAttemptPaymentError"),
    @JsonSubTypes.Type(value = SubscriptionBillingAttemptUnexpectedError.class, name = "SubscriptionBillingAttemptUnexpectedError")
})
public interface SubscriptionBillingAttemptError {
}
