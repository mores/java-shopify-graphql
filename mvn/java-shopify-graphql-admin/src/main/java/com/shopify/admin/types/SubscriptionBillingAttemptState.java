package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "__typename"
)
@JsonSubTypes({
    @JsonSubTypes.Type(value = SubscriptionBillingAttemptActionRequiredState.class, name = "SubscriptionBillingAttemptActionRequiredState"),
    @JsonSubTypes.Type(value = SubscriptionBillingAttemptFailedState.class, name = "SubscriptionBillingAttemptFailedState"),
    @JsonSubTypes.Type(value = SubscriptionBillingAttemptPendingState.class, name = "SubscriptionBillingAttemptPendingState"),
    @JsonSubTypes.Type(value = SubscriptionBillingAttemptSuccessState.class, name = "SubscriptionBillingAttemptSuccessState")
})
public interface SubscriptionBillingAttemptState {
}
