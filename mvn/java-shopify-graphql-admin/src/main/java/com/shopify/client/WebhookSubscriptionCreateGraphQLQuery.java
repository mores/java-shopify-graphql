package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.types.WebhookSubscriptionInput;
import com.shopify.types.WebhookSubscriptionTopic;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;


public class WebhookSubscriptionCreateGraphQLQuery extends GraphQLQuery {
  public WebhookSubscriptionCreateGraphQLQuery(WebhookSubscriptionTopic topic,
      WebhookSubscriptionInput webhookSubscription, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (topic != null || fieldsSet.contains("topic")) {
        getInput().put("topic", topic);
    }if (webhookSubscription != null || fieldsSet.contains("webhookSubscription")) {
        getInput().put("webhookSubscription", webhookSubscription);
    }
  }

  public WebhookSubscriptionCreateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "webhookSubscriptionCreate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private WebhookSubscriptionTopic topic;

    private WebhookSubscriptionInput webhookSubscription;

    private String queryName;

    public WebhookSubscriptionCreateGraphQLQuery build() {
      return new WebhookSubscriptionCreateGraphQLQuery(topic, webhookSubscription, queryName, fieldsSet);
               
    }

    
    public Builder topic(WebhookSubscriptionTopic topic) {
      this.topic = topic;
      this.fieldsSet.add("topic");
      return this;
    }

    
    public Builder webhookSubscription(WebhookSubscriptionInput webhookSubscription) {
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
