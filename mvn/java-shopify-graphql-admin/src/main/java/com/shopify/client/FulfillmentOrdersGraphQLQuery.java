package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.types.FulfillmentOrderSortKeys;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * The paginated list of all fulfillment orders.
 * The returned fulfillment orders are filtered according to the
 * [fulfillment order access scopes](https://shopify.dev/api/admin-graphql/latest/objects/fulfillmentorder#api-access-scopes)
 * granted to the app.
 *   
 * Use this query to retrieve fulfillment orders assigned to merchant-managed locations,
 * third-party fulfillment service locations, or all kinds of locations together.
 *   
 * For fetching only the fulfillment orders assigned to the app's locations, use the
 * [assignedFulfillmentOrders](https://shopify.dev/api/admin-graphql/2024-07/objects/queryroot#connection-assignedfulfillmentorders)
 * connection.
 */
public class FulfillmentOrdersGraphQLQuery extends GraphQLQuery {
  public FulfillmentOrdersGraphQLQuery(Boolean includeClosed, Integer first, String after,
      Integer last, String before, Boolean reverse, FulfillmentOrderSortKeys sortKey, String query,
      String queryName, Set<String> fieldsSet) {
    super("query", queryName);
    if (includeClosed != null || fieldsSet.contains("includeClosed")) {
        getInput().put("includeClosed", includeClosed);
    }if (first != null || fieldsSet.contains("first")) {
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
    }
  }

  public FulfillmentOrdersGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "fulfillmentOrders";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private Boolean includeClosed;

    private Integer first;

    private String after;

    private Integer last;

    private String before;

    private Boolean reverse;

    private FulfillmentOrderSortKeys sortKey;

    private String query;

    private String queryName;

    public FulfillmentOrdersGraphQLQuery build() {
      return new FulfillmentOrdersGraphQLQuery(includeClosed, first, after, last, before, reverse, sortKey, query, queryName, fieldsSet);
               
    }

    /**
     * Whether to include closed fulfillment orders.
     */
    public Builder includeClosed(Boolean includeClosed) {
      this.includeClosed = includeClosed;
      this.fieldsSet.add("includeClosed");
      return this;
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
    public Builder sortKey(FulfillmentOrderSortKeys sortKey) {
      this.sortKey = sortKey;
      this.fieldsSet.add("sortKey");
      return this;
    }

    /**
     * A filter made up of terms, connectives, modifiers, and comparators.
     * | name | type | description | acceptable_values | default_value | example_use |
     * | ---- | ---- | ---- | ---- | ---- | ---- |
     * | default | string | Filter by a case-insensitive search of multiple fields
     * in a document. | | | - `query=Bob Norman`<br/> - `query=title:green hoodie` |
     * | assigned_location_id | id |
     * | id | id | Filter by `id` range. | | | - `id:1234`<br/> - `id:>=1234`<br/> - `id:&lt;=1234` |
     * | status | string |
     * | updated_at | time |
     * You can apply one or more filters to a query. Learn more about [Shopify API
     * search syntax](https://shopify.dev/api/usage/search-syntax).
     */
    public Builder query(String query) {
      this.query = query;
      this.fieldsSet.add("query");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
