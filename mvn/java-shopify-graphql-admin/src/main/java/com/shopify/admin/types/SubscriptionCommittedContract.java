package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "__typename"
)
@JsonSubTypes({
    @JsonSubTypes.Type(value = SubscriptionBillingCycleEditedContract.class, name = "SubscriptionBillingCycleEditedContract"),
    @JsonSubTypes.Type(value = SubscriptionContract.class, name = "SubscriptionContract")
})
public interface SubscriptionCommittedContract {
}
