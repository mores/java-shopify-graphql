package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Returns a list of fulfillment orders that are on hold.
 */
public class ManualHoldsFulfillmentOrdersGraphQLQuery extends GraphQLQuery {
  public ManualHoldsFulfillmentOrdersGraphQLQuery(String query, Integer first, String after,
      Integer last, String before, Boolean reverse, String queryName, Set<String> fieldsSet) {
    super("query", queryName);
    if (query != null || fieldsSet.contains("query")) {
        getInput().put("query", query);
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
    }
  }

  public ManualHoldsFulfillmentOrdersGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "manualHoldsFulfillmentOrders";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String query;

    private Integer first;

    private String after;

    private Integer last;

    private String before;

    private Boolean reverse;

    private String queryName;

    public ManualHoldsFulfillmentOrdersGraphQLQuery build() {
      return new ManualHoldsFulfillmentOrdersGraphQLQuery(query, first, after, last, before, reverse, queryName, fieldsSet);
               
    }

    /**
     * The query conditions used to filter fulfillment orders. Only fulfillment
     * orders corresponding to orders matching the query will be counted.
     * Supported filter parameters:
     *  - `order_financial_status`
     *  - `order_risk_level`
     *  - `shipping_address_coordinates_validated`
     *     
     * See the detailed [search syntax](https://shopify.dev/api/usage/search-syntax)
     * for more information about using filters.
     */
    public Builder query(String query) {
      this.query = query;
      this.fieldsSet.add("query");
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

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
