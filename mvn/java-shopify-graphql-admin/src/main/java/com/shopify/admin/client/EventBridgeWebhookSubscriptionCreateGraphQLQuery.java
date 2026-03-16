package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.EventBridgeWebhookSubscriptionInput;
import com.shopify.admin.types.WebhookSubscriptionTopic;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Creates a webhook subscription that notifies your
 * [`App`](https://shopify.dev/docs/api/admin-graphql/latest/objects/App) when
 * specific events occur in a shop. Webhooks push event data to your endpoint
 * immediately when changes happen, eliminating the need for polling.
 *   
 * This mutation configures webhook delivery to an Amazon EventBridge partner
 * event source. You can filter events using [Shopify API search
 * syntax](https://shopify.dev/docs/api/usage/search-syntax) to receive only
 * relevant webhooks, control which data fields are included in webhook payloads,
 * and specify metafield namespaces to include.
 *   
 * > Note:
 * > The Webhooks API version [configured in your app](https://shopify.dev/docs/apps/build/webhooks/subscribe/use-newer-api-version)
 * determines the API version for webhook events. You can't specify it per subscription.
 *   
 *   
 * Building an app? If you only use app-specific webhooks, you won't need this.
 * App-specific webhook subscriptions specified in your `shopify.app.toml` may be
 * easier. They are automatically kept up to date by Shopify &amp; require less
 * maintenance. Please read [About managing webhook
 * subscriptions](https://shopify.dev/docs/apps/build/webhooks/subscribe).
 */
public class EventBridgeWebhookSubscriptionCreateGraphQLQuery extends GraphQLQuery {
  public EventBridgeWebhookSubscriptionCreateGraphQLQuery(WebhookSubscriptionTopic topic,
      EventBridgeWebhookSubscriptionInput webhookSubscription, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (topic != null || fieldsSet.contains("topic")) {
        getInput().put("topic", topic);
    }if (webhookSubscription != null || fieldsSet.contains("webhookSubscription")) {
        getInput().put("webhookSubscription", webhookSubscription);
    }
  }

  public EventBridgeWebhookSubscriptionCreateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "eventBridgeWebhookSubscriptionCreate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private WebhookSubscriptionTopic topic;

    private EventBridgeWebhookSubscriptionInput webhookSubscription;

    private String queryName;

    public EventBridgeWebhookSubscriptionCreateGraphQLQuery build() {
      return new EventBridgeWebhookSubscriptionCreateGraphQLQuery(topic, webhookSubscription, queryName, fieldsSet);
               
    }

    /**
     * The type of event that triggers the webhook.
     */
    public Builder topic(WebhookSubscriptionTopic topic) {
      this.topic = topic;
      this.fieldsSet.add("topic");
      return this;
    }

    /**
     * Specifies the input fields for an EventBridge webhook subscription.
     */
    public Builder webhookSubscription(EventBridgeWebhookSubscriptionInput webhookSubscription) {
      this.webhookSubscription = webhookSubscription;
      this.fieldsSet.add("webhookSubscription");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
