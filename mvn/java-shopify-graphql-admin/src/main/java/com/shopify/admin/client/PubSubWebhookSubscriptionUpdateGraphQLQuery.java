package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.PubSubWebhookSubscriptionInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Updates a Google Cloud Pub/Sub webhook subscription.
 *   
 * Building an app? If you only use app-specific webhooks, you won't need this.
 * App-specific webhook subscriptions specified in your `shopify.app.toml` may be
 * easier. They are automatically kept up to date by Shopify &amp; require less
 * maintenance. Please read [About managing webhook
 * subscriptions](https://shopify.dev/docs/apps/build/webhooks/subscribe).
 */
public class PubSubWebhookSubscriptionUpdateGraphQLQuery extends GraphQLQuery {
  public PubSubWebhookSubscriptionUpdateGraphQLQuery(String id,
      PubSubWebhookSubscriptionInput webhookSubscription, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }if (webhookSubscription != null || fieldsSet.contains("webhookSubscription")) {
        getInput().put("webhookSubscription", webhookSubscription);
    }
  }

  public PubSubWebhookSubscriptionUpdateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "pubSubWebhookSubscriptionUpdate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String id;

    private PubSubWebhookSubscriptionInput webhookSubscription;

    private String queryName;

    public PubSubWebhookSubscriptionUpdateGraphQLQuery build() {
      return new PubSubWebhookSubscriptionUpdateGraphQLQuery(id, webhookSubscription, queryName, fieldsSet);
               
    }

    /**
     * The ID of the webhook subscription to update.
     */
    public Builder id(String id) {
      this.id = id;
      this.fieldsSet.add("id");
      return this;
    }

    /**
     * Specifies the input fields for a Google Cloud Pub/Sub webhook subscription.
     */
    public Builder webhookSubscription(PubSubWebhookSubscriptionInput webhookSubscription) {
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
