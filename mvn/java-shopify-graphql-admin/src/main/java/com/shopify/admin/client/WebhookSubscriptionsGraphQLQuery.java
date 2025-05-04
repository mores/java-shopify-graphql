package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.WebhookSubscriptionFormat;
import com.shopify.admin.types.WebhookSubscriptionSortKeys;
import com.shopify.admin.types.WebhookSubscriptionTopic;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Returns a list of webhook subscriptions.
 *   
 * Building an app? If you only use app-specific webhooks, you won't need this.
 * App-specific webhook subscriptions specified in your `shopify.app.toml` may be
 * easier. They are automatically kept up to date by Shopify &amp; require less
 * maintenance. Please read [About managing webhook
 * subscriptions](https://shopify.dev/docs/apps/build/webhooks/subscribe).
 */
public class WebhookSubscriptionsGraphQLQuery extends GraphQLQuery {
  public WebhookSubscriptionsGraphQLQuery(Integer first, String after, Integer last, String before,
      Boolean reverse, WebhookSubscriptionSortKeys sortKey, String query, String callbackUrl,
      WebhookSubscriptionFormat format, List<WebhookSubscriptionTopic> topics, String queryName,
      Set<String> fieldsSet) {
    super("query", queryName);
    if (first != null || fieldsSet.contains("first")) {
        getInput().put("first", first);
    }if (after != null || fieldsSet.contains("after")) {
        getInput().put("after", after);
    }if (last != null || fieldsSet.contains("last")) {
        getInput().put("last", last);
    }if (before != null || fieldsSet.contains("before")) {
        getInput().put("before", before);
    }if (reverse != null || fieldsSet.contains("reverse")) {
        getInput().put("reverse", reverse);
    }if (sortKey != null || fieldsSet.contains("sortKey")) {
        getInput().put("sortKey", sortKey);
    }if (query != null || fieldsSet.contains("query")) {
        getInput().put("query", query);
    }if (callbackUrl != null || fieldsSet.contains("callbackUrl")) {
        getInput().put("callbackUrl", callbackUrl);
    }if (format != null || fieldsSet.contains("format")) {
        getInput().put("format", format);
    }if (topics != null || fieldsSet.contains("topics")) {
        getInput().put("topics", topics);
    }
  }

  public WebhookSubscriptionsGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "webhookSubscriptions";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private Integer first;

    private String after;

    private Integer last;

    private String before;

    private Boolean reverse;

    private WebhookSubscriptionSortKeys sortKey;

    private String query;

    private String callbackUrl;

    private WebhookSubscriptionFormat format;

    private List<WebhookSubscriptionTopic> topics;

    private String queryName;

    public WebhookSubscriptionsGraphQLQuery build() {
      return new WebhookSubscriptionsGraphQLQuery(first, after, last, before, reverse, sortKey, query, callbackUrl, format, topics, queryName, fieldsSet);
               
    }

    /**
     * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
     */
    public Builder first(Integer first) {
      this.first = first;
      this.fieldsSet.add("first");
      return this;
    }

    /**
     * The elements that come after the specified [cursor](https://shopify.dev/api/usage/pagination-graphql).
     */
    public Builder after(String after) {
      this.after = after;
      this.fieldsSet.add("after");
      return this;
    }

    /**
     * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
     */
    public Builder last(Integer last) {
      this.last = last;
      this.fieldsSet.add("last");
      return this;
    }

    /**
     * The elements that come before the specified [cursor](https://shopify.dev/api/usage/pagination-graphql).
     */
    public Builder before(String before) {
      this.before = before;
      this.fieldsSet.add("before");
      return this;
    }

    /**
     * Reverse the order of the underlying list.
     */
    public Builder reverse(Boolean reverse) {
      this.reverse = reverse;
      this.fieldsSet.add("reverse");
      return this;
    }

    /**
     * Sort the underlying list using a key. If your query is slow or returns an
     * error, then [try specifying a sort key that matches the field used in the search](https://shopify.dev/api/usage/pagination-graphql#search-performance-considerations).
     */
    public Builder sortKey(WebhookSubscriptionSortKeys sortKey) {
      this.sortKey = sortKey;
      this.fieldsSet.add("sortKey");
      return this;
    }

    /**
     * A filter made up of terms, connectives, modifiers, and comparators.
     * | name | type | description | acceptable_values | default_value | example_use |
     * | ---- | ---- | ---- | ---- | ---- | ---- |
     * | created_at | time |
     * | id | id | Filter by `id` range. | | | - `id:1234`<br/> - `id:>=1234`<br/> - `id:&lt;=1234` |
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
     * Callback URL to filter by.
     */
    public Builder callbackUrl(String callbackUrl) {
      this.callbackUrl = callbackUrl;
      this.fieldsSet.add("callbackUrl");
      return this;
    }

    /**
     * Response format to filter by.
     */
    public Builder format(WebhookSubscriptionFormat format) {
      this.format = format;
      this.fieldsSet.add("format");
      return this;
    }

    /**
     * List of webhook subscription topics to filter by.
     */
    public Builder topics(List<WebhookSubscriptionTopic> topics) {
      this.topics = topics;
      this.fieldsSet.add("topics");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
