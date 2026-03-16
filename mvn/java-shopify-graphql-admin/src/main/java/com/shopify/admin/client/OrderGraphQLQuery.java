package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * The `order` query retrieves an
 * [order](https://shopify.dev/docs/api/admin-graphql/latest/objects/order) by
 * its ID. This query provides access to comprehensive order information such as
 * customer details, line items, financial data, and fulfillment status.
 *   
 * Use the `order` query to retrieve information associated with the following processes:
 *   
 * - [Order management and fulfillment](https://shopify.dev/docs/apps/build/orders-fulfillment/order-management-apps)
 * - [Financial reporting](https://help.shopify.com/manual/finance)
 * - [Customer purchase history](https://help.shopify.com/manual/reports-and-analytics/shopify-reports/report-types/default-reports/customers-reports)
 * and [transaction analysis](https://shopify.dev/docs/apps/launch/billing/view-charges-earnings#transaction-data-through-the-graphql-admin-api)
 * - [Shipping](https://shopify.dev/docs/apps/build/checkout/delivery-shipping) and [inventory management](https://shopify.dev/docs/apps/build/orders-fulfillment/inventory-management-apps)
 *   
 * You can only retrieve the last 60 days worth of orders from a store by
 * default. If you want to access older orders, then you need to [request access to all
 * orders](https://shopify.dev/docs/api/usage/access-scopes#orders-permissions).
 *   
 * For large order datasets, consider using [bulk operations](https://shopify.dev/docs/api/usage/bulk-operations/queries).
 * Bulk operations handle pagination automatically and allow you to retrieve data
 * asynchronously without being constrained by API rate limits.
 * Learn more about [creating orders](https://shopify.dev/docs/api/admin-graphql/latest/mutations/ordercreate)
 * and [building order management
 * apps](https://shopify.dev/docs/apps/build/orders-fulfillment).
 */
public class OrderGraphQLQuery extends GraphQLQuery {
  public OrderGraphQLQuery(String id, String queryName, Set<String> fieldsSet) {
    super("query", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }
  }

  public OrderGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "order";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String id;

    private String queryName;

    public OrderGraphQLQuery build() {
      return new OrderGraphQLQuery(id, queryName, fieldsSet);
               
    }

    /**
     * The ID of the `Order` to return.
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
