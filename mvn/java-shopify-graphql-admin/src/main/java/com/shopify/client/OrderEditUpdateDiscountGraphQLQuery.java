package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.types.OrderEditAppliedDiscountInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;


public class OrderEditUpdateDiscountGraphQLQuery extends GraphQLQuery {
  public OrderEditUpdateDiscountGraphQLQuery(String id, OrderEditAppliedDiscountInput discount,
      String discountApplicationId, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }if (discount != null || fieldsSet.contains("discount")) {
        getInput().put("discount", discount);
    }if (discountApplicationId != null || fieldsSet.contains("discountApplicationId")) {
        getInput().put("discountApplicationId", discountApplicationId);
    }
  }

  public OrderEditUpdateDiscountGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "orderEditUpdateDiscount";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String id;

    private OrderEditAppliedDiscountInput discount;

    private String discountApplicationId;

    private String queryName;

    public OrderEditUpdateDiscountGraphQLQuery build() {
      return new OrderEditUpdateDiscountGraphQLQuery(id, discount, discountApplicationId, queryName, fieldsSet);
               
    }

    
    public Builder id(String id) {
      this.id = id;
      this.fieldsSet.add("id");
      return this;
    }

    
    public Builder discount(OrderEditAppliedDiscountInput discount) {
      this.discount = discount;
      this.fieldsSet.add("discount");
      return this;
    }

    
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
