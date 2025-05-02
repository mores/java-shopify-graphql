package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "__typename"
)
@JsonSubTypes({
    @JsonSubTypes.Type(value = CartStatusNotReady.class, name = "CartStatusNotReady"),
    @JsonSubTypes.Type(value = CartStatusReady.class, name = "CartStatusReady"),
    @JsonSubTypes.Type(value = CartThrottled.class, name = "CartThrottled")
})
public interface CartPrepareForCompletionResult {
}
