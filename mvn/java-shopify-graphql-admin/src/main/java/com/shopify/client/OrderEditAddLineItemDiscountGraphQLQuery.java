package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.types.OrderEditAppliedDiscountInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;


public class OrderEditAddLineItemDiscountGraphQLQuery extends GraphQLQuery {
  public OrderEditAddLineItemDiscountGraphQLQuery(String id, String lineItemId,
      OrderEditAppliedDiscountInput discount, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }if (lineItemId != null || fieldsSet.contains("lineItemId")) {
        getInput().put("lineItemId", lineItemId);
    }if (discount != null || fieldsSet.contains("discount")) {
        getInput().put("discount", discount);
    }
  }

  public OrderEditAddLineItemDiscountGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "orderEditAddLineItemDiscount";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String id;

    private String lineItemId;

    private OrderEditAppliedDiscountInput discount;

    private String queryName;

    public OrderEditAddLineItemDiscountGraphQLQuery build() {
      return new OrderEditAddLineItemDiscountGraphQLQuery(id, lineItemId, discount, queryName, fieldsSet);
               
    }

    
    public Builder id(String id) {
      this.id = id;
      this.fieldsSet.add("id");
      return this;
    }

    
    public Builder lineItemId(String lineItemId) {
      this.lineItemId = lineItemId;
      this.fieldsSet.add("lineItemId");
      return this;
    }

    
    public Builder discount(OrderEditAppliedDiscountInput discount) {
      this.discount = discount;
      this.fieldsSet.add("discount");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
