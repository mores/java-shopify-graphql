package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Returns a webhook subscription by ID.
 *   
 * Building an app? If you only use app-specific webhooks, you won't need this.
 * App-specific webhook subscriptions specified in your `shopify.app.toml` may be
 * easier. They are automatically kept up to date by Shopify & require less
 * maintenance. Please read [About managing webhook
 * subscriptions](https://shopify.dev/docs/apps/build/webhooks/subscribe).
 */
public class WebhookSubscriptionGraphQLQuery extends GraphQLQuery {
  public WebhookSubscriptionGraphQLQuery(String id, String queryName, Set<String> fieldsSet) {
    super("query", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }
  }

  public WebhookSubscriptionGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "webhookSubscription";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String id;

    private String queryName;

    public WebhookSubscriptionGraphQLQuery build() {
      return new WebhookSubscriptionGraphQLQuery(id, queryName, fieldsSet);
               
    }

    /**
     * The ID of the `WebhookSubscription` to return.
     */
    public Builder id(String id) {
      this.id = id;
      this.fieldsSet.add("id");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
