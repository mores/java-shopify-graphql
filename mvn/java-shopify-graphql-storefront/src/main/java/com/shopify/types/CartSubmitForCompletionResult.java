package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "__typename"
)
@JsonSubTypes({
    @JsonSubTypes.Type(value = SubmitAlreadyAccepted.class, name = "SubmitAlreadyAccepted"),
    @JsonSubTypes.Type(value = SubmitFailed.class, name = "SubmitFailed"),
    @JsonSubTypes.Type(value = SubmitSuccess.class, name = "SubmitSuccess"),
    @JsonSubTypes.Type(value = SubmitThrottled.class, name = "SubmitThrottled")
})
public interface CartSubmitForCompletionResult {
}
