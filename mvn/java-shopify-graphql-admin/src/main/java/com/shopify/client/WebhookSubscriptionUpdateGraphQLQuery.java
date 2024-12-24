package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.types.WebhookSubscriptionInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;


public class WebhookSubscriptionUpdateGraphQLQuery extends GraphQLQuery {
  public WebhookSubscriptionUpdateGraphQLQuery(String id,
      WebhookSubscriptionInput webhookSubscription, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }if (webhookSubscription != null || fieldsSet.contains("webhookSubscription")) {
        getInput().put("webhookSubscription", webhookSubscription);
    }
  }

  public WebhookSubscriptionUpdateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "webhookSubscriptionUpdate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String id;

    private WebhookSubscriptionInput webhookSubscription;

    private String queryName;

    public WebhookSubscriptionUpdateGraphQLQuery build() {
      return new WebhookSubscriptionUpdateGraphQLQuery(id, webhookSubscription, queryName, fieldsSet);
               
    }

    
    public Builder id(String id) {
      this.id = id;
      this.fieldsSet.add("id");
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
