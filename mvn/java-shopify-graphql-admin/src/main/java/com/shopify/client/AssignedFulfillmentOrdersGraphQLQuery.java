package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.types.FulfillmentOrderAssignmentStatus;
import com.shopify.types.FulfillmentOrderSortKeys;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * The paginated list of fulfillment orders assigned to the shop locations owned by the app.
 *   
 * Assigned fulfillment orders are fulfillment orders that are set to be fulfilled from locations
 * managed by
 * [fulfillment services](https://shopify.dev/api/admin-graphql/latest/objects/FulfillmentService)
 * that are registered by the app.
 * One app (api_client) can host multiple fulfillment services on a shop.
 * Each fulfillment service manages a dedicated location on a shop.
 * Assigned fulfillment orders can have associated
 * [fulfillment requests](https://shopify.dev/api/admin-graphql/latest/enums/FulfillmentOrderRequestStatus),
 * or might currently not be requested to be fulfilled.
 *   
 * The app must have the `read_assigned_fulfillment_orders`
 * [access scope](https://shopify.dev/docs/api/usage/access-scopes)
 * to be able to retrieve the fulfillment orders assigned to its locations.
 *   
 * All assigned fulfillment orders (except those with the `CLOSED` status) will be returned by default.
 * Perform filtering with the `assignmentStatus` argument
 * to receive only fulfillment orders that have been requested to be fulfilled.
 */
public class AssignedFulfillmentOrdersGraphQLQuery extends GraphQLQuery {
  public AssignedFulfillmentOrdersGraphQLQuery(FulfillmentOrderAssignmentStatus assignmentStatus,
      List<String> locationIds, Integer first, String after, Integer last, String before,
      Boolean reverse, FulfillmentOrderSortKeys sortKey, String queryName, Set<String> fieldsSet) {
    super("query", queryName);
    if (assignmentStatus != null || fieldsSet.contains("assignmentStatus")) {
        getInput().put("assignmentStatus", assignmentStatus);
    }if (locationIds != null || fieldsSet.contains("locationIds")) {
        getInput().put("locationIds", locationIds);
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
    }
  }

  public AssignedFulfillmentOrdersGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "assignedFulfillmentOrders";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private FulfillmentOrderAssignmentStatus assignmentStatus;

    private List<String> locationIds;

    private Integer first;

    private String after;

    private Integer last;

    private String before;

    private Boolean reverse;

    private FulfillmentOrderSortKeys sortKey;

    private String queryName;

    public AssignedFulfillmentOrdersGraphQLQuery build() {
      return new AssignedFulfillmentOrdersGraphQLQuery(assignmentStatus, locationIds, first, after, last, before, reverse, sortKey, queryName, fieldsSet);
               
    }

    /**
     * The assigment status of the fulfillment orders that should be returned.
     * If `assignmentStatus` argument is not provided, then
     * the query will return all assigned fulfillment orders,
     * except those that have the `CLOSED` status.
     */
    public Builder assignmentStatus(FulfillmentOrderAssignmentStatus assignmentStatus) {
      this.assignmentStatus = assignmentStatus;
      this.fieldsSet.add("assignmentStatus");
      return this;
    }

    /**
     * Returns fulfillment orders only for certain locations, specified by a list of location IDs.
     */
    public Builder locationIds(List<String> locationIds) {
      this.locationIds = locationIds;
      this.fieldsSet.add("locationIds");
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

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
