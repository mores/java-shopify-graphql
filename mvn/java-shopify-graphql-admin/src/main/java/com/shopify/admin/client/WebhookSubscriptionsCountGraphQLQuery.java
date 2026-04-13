package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * The count of webhook subscriptions.
 *   
 * Building an app? If you only use app-specific webhooks, you won't need this.
 * App-specific webhook subscriptions specified in your `shopify.app.toml` may be
 * easier. They are automatically kept up to date by Shopify &amp; require less
 * maintenance. Please read [About managing webhook
 * subscriptions](https://shopify.dev/docs/apps/build/webhooks/subscribe).
 * Limited to a maximum of 10000 by default.
 */
public class WebhookSubscriptionsCountGraphQLQuery extends GraphQLQuery {
  public WebhookSubscriptionsCountGraphQLQuery(String query, Integer limit, String queryName,
      Set<String> fieldsSet) {
    super("query", queryName);
    if (query != null || fieldsSet.contains("query")) {
        getInput().put("query", query);
    }if (limit != null || fieldsSet.contains("limit")) {
        getInput().put("limit", limit);
    }
  }

  public WebhookSubscriptionsCountGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "webhookSubscriptionsCount";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String query;

    private Integer limit;

    private String queryName;

    public WebhookSubscriptionsCountGraphQLQuery build() {
      return new WebhookSubscriptionsCountGraphQLQuery(query, limit, queryName, fieldsSet);
               
    }

    /**
     * A filter made up of terms, connectives, modifiers, and comparators.
     * | name | type | description | acceptable_values | default_value | example_use |
     * | ---- | ---- | ---- | ---- | ---- | ---- |
     * | created_at | time |
     * | endpoint | string |
     * | id | id | Filter by `id` range. | | | - `id:1234`<br/> - `id:>=1234`<br/> - `id:&lt;=1234` |
     * | topic | string |
     * | updated_at | time |
     * You can apply one or more filters to a query. Learn more about [Shopify API
     * search syntax](https://shopify.dev/api/usage/search-syntax).
     */
    public Builder query(String query) {
      this.query = query;
      this.fieldsSet.add("query");
      return this;
    }

    /**
     * The upper bound on count value before returning a result. Use `null` to have no limit.
     */
    public Builder limit(Integer limit) {
      this.limit = limit;
      this.fieldsSet.add("limit");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
