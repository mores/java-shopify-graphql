package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.types.EventBridgeWebhookSubscriptionInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;


public class EventBridgeWebhookSubscriptionUpdateGraphQLQuery extends GraphQLQuery {
  public EventBridgeWebhookSubscriptionUpdateGraphQLQuery(String id,
      EventBridgeWebhookSubscriptionInput webhookSubscription, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }if (webhookSubscription != null || fieldsSet.contains("webhookSubscription")) {
        getInput().put("webhookSubscription", webhookSubscription);
    }
  }

  public EventBridgeWebhookSubscriptionUpdateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "eventBridgeWebhookSubscriptionUpdate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String id;

    private EventBridgeWebhookSubscriptionInput webhookSubscription;

    private String queryName;

    public EventBridgeWebhookSubscriptionUpdateGraphQLQuery build() {
      return new EventBridgeWebhookSubscriptionUpdateGraphQLQuery(id, webhookSubscription, queryName, fieldsSet);
               
    }

    
    public Builder id(String id) {
      this.id = id;
      this.fieldsSet.add("id");
      return this;
    }

    
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
