package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "__typename"
)
@JsonSubTypes({
    @JsonSubTypes.Type(value = CartCompletionActionRequired.class, name = "CartCompletionActionRequired"),
    @JsonSubTypes.Type(value = CartCompletionFailed.class, name = "CartCompletionFailed"),
    @JsonSubTypes.Type(value = CartCompletionProcessing.class, name = "CartCompletionProcessing"),
    @JsonSubTypes.Type(value = CartCompletionSuccess.class, name = "CartCompletionSuccess")
})
public interface CartCompletionAttemptResult {
}
