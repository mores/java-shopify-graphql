package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.types.PubSubWebhookSubscriptionInput;
import com.shopify.types.WebhookSubscriptionTopic;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;


public class PubSubWebhookSubscriptionCreateGraphQLQuery extends GraphQLQuery {
  public PubSubWebhookSubscriptionCreateGraphQLQuery(WebhookSubscriptionTopic topic,
      PubSubWebhookSubscriptionInput webhookSubscription, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (topic != null || fieldsSet.contains("topic")) {
        getInput().put("topic", topic);
    }if (webhookSubscription != null || fieldsSet.contains("webhookSubscription")) {
        getInput().put("webhookSubscription", webhookSubscription);
    }
  }

  public PubSubWebhookSubscriptionCreateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "pubSubWebhookSubscriptionCreate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private WebhookSubscriptionTopic topic;

    private PubSubWebhookSubscriptionInput webhookSubscription;

    private String queryName;

    public PubSubWebhookSubscriptionCreateGraphQLQuery build() {
      return new PubSubWebhookSubscriptionCreateGraphQLQuery(topic, webhookSubscription, queryName, fieldsSet);
               
    }

    
    public Builder topic(WebhookSubscriptionTopic topic) {
      this.topic = topic;
      this.fieldsSet.add("topic");
      return this;
    }

    
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
