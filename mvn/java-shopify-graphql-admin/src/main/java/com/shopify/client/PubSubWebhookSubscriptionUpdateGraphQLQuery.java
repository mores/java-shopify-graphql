package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.types.PubSubWebhookSubscriptionInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;


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

    
    public Builder id(String id) {
      this.id = id;
      this.fieldsSet.add("id");
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
