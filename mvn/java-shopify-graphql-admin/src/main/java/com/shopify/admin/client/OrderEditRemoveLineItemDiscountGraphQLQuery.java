package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Removes a line item discount that was applied as part of an order edit.
 */
public class OrderEditRemoveLineItemDiscountGraphQLQuery extends GraphQLQuery {
  public OrderEditRemoveLineItemDiscountGraphQLQuery(String id, String discountApplicationId,
      String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }if (discountApplicationId != null || fieldsSet.contains("discountApplicationId")) {
        getInput().put("discountApplicationId", discountApplicationId);
    }
  }

  public OrderEditRemoveLineItemDiscountGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "orderEditRemoveLineItemDiscount";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String id;

    private String discountApplicationId;

    private String queryName;

    public OrderEditRemoveLineItemDiscountGraphQLQuery build() {
      return new OrderEditRemoveLineItemDiscountGraphQLQuery(id, discountApplicationId, queryName, fieldsSet);
               
    }

    /**
     * The ID of the [calculated order](https://shopify.dev/api/admin-graphql/latest/objects/calculatedorder)
     * from which to remove the discount.
     */
    public Builder id(String id) {
      this.id = id;
      this.fieldsSet.add("id");
      return this;
    }

    /**
     * The ID of the [calculated discount application](https://shopify.dev/api/admin-graphql/latest/interfaces/calculateddiscountapplication)
     * to remove.
     */
    public Builder discountApplicationId(String discountApplicationId) {
      this.discountApplicationId = discountApplicationId;
      this.fieldsSet.add("discountApplicationId");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
