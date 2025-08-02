package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Retrieves a [refund](https://shopify.dev/docs/api/admin-graphql/latest/objects/Refund) by its ID.
 * A refund represents a financial record of money returned to a customer from an order.
 * It provides a comprehensive view of all refunded amounts, transactions, and restocking
 * instructions associated with returning products or correcting order issues.
 *   
 * Use the `refund` query to retrieve information associated with the following workflows:
 *   
 * - Displaying refund details in order management interfaces
 * - Building customer service tools for reviewing refund history
 * - Creating reports on refunded amounts and reasons
 * - Auditing refund transactions and payment gateway records
 * - Tracking inventory impacts from refunded items
 *   
 * A refund is associated with an
 * [order](https://shopify.dev/docs/api/admin-graphql/latest/objects/Order)
 * and includes [refund line items](https://shopify.dev/docs/api/admin-graphql/latest/objects/RefundLineItem)
 * that specify which items were refunded. Each refund processes through
 * [order transactions](https://shopify.dev/docs/api/admin-graphql/latest/objects/OrderTransaction)
 * that handle the actual money transfer back to the customer.
 */
public class RefundGraphQLQuery extends GraphQLQuery {
  public RefundGraphQLQuery(String id, String queryName, Set<String> fieldsSet) {
    super("query", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }
  }

  public RefundGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "refund";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String id;

    private String queryName;

    public RefundGraphQLQuery build() {
      return new RefundGraphQLQuery(id, queryName, fieldsSet);
               
    }

    /**
     * The ID of the Refund to return.
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
