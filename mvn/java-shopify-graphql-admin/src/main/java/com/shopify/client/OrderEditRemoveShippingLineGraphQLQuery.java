package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Removes a shipping line from an existing order. For more information on how to
 * use the GraphQL Admin API to edit an existing order, refer to [Edit existing orders](https://shopify.dev/apps/fulfillment/order-management-apps/order-editing).
 */
public class OrderEditRemoveShippingLineGraphQLQuery extends GraphQLQuery {
  public OrderEditRemoveShippingLineGraphQLQuery(String id, String shippingLineId, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }if (shippingLineId != null || fieldsSet.contains("shippingLineId")) {
        getInput().put("shippingLineId", shippingLineId);
    }
  }

  public OrderEditRemoveShippingLineGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "orderEditRemoveShippingLine";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String id;

    private String shippingLineId;

    private String queryName;

    public OrderEditRemoveShippingLineGraphQLQuery build() {
      return new OrderEditRemoveShippingLineGraphQLQuery(id, shippingLineId, queryName, fieldsSet);
               
    }

    /**
     * The ID of the [calculated order](https://shopify.dev/api/admin-graphql/latest/objects/calculatedorder)
     * to edit.
     */
    public Builder id(String id) {
      this.id = id;
      this.fieldsSet.add("id");
      return this;
    }

    /**
     * The ID of the calculated shipping line to remove.
     */
    public Builder shippingLineId(String shippingLineId) {
      this.shippingLineId = shippingLineId;
      this.fieldsSet.add("shippingLineId");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
