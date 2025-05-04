package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "__typename"
)
@JsonSubTypes({
    @JsonSubTypes.Type(value = DeliveryParticipant.class, name = "DeliveryParticipant"),
    @JsonSubTypes.Type(value = DeliveryRateDefinition.class, name = "DeliveryRateDefinition")
})
public interface DeliveryRateProvider {
}
