package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "__typename"
)
@JsonSubTypes({
    @JsonSubTypes.Type(value = SubscriptionLine.class, name = "SubscriptionLine"),
    @JsonSubTypes.Type(value = SubscriptionParentLine.class, name = "SubscriptionParentLine")
})
public interface SubscriptionGroupedLine {
}
