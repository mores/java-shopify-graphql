package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "__typename"
)
@JsonSubTypes({
    @JsonSubTypes.Type(value = WebhookEventBridgeEndpoint.class, name = "WebhookEventBridgeEndpoint"),
    @JsonSubTypes.Type(value = WebhookHttpEndpoint.class, name = "WebhookHttpEndpoint"),
    @JsonSubTypes.Type(value = WebhookPubSubEndpoint.class, name = "WebhookPubSubEndpoint")
})
public interface WebhookSubscriptionEndpoint {
}
