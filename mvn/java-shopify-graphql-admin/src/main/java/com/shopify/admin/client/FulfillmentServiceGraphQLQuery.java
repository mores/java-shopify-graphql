package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Returns a [`FulfillmentService`](https://shopify.dev/docs/api/admin-graphql/latest/objects/FulfillmentService) by its ID. The service can manage inventory, process fulfillment requests, and
 * provide tracking details through callback endpoints or directly calling
 * Shopify's APIs.
 *   
 * When you register a fulfillment service, Shopify automatically creates an associated [`Location`](https://shopify.dev/docs/api/admin-graphql/latest/objects/Location)
 * where fulfillment order's can be assigned to be processed.
 *   
 * Learn more about [building fulfillment service apps](https://shopify.dev/docs/apps/build/orders-fulfillment/fulfillment-service-apps/build-for-fulfillment-services).
 */
public class FulfillmentServiceGraphQLQuery extends GraphQLQuery {
  public FulfillmentServiceGraphQLQuery(String id, String queryName, Set<String> fieldsSet) {
    super("query", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }
  }

  public FulfillmentServiceGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "fulfillmentService";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String id;

    private String queryName;

    public FulfillmentServiceGraphQLQuery build() {
      return new FulfillmentServiceGraphQLQuery(id, queryName, fieldsSet);
               
    }

    /**
     * The ID of the FulfillmentService to return.
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
