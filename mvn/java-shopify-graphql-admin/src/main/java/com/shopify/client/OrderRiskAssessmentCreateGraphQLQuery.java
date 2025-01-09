package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.types.OrderRiskAssessmentCreateInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Create a risk assessment for an order.
 */
public class OrderRiskAssessmentCreateGraphQLQuery extends GraphQLQuery {
  public OrderRiskAssessmentCreateGraphQLQuery(
      OrderRiskAssessmentCreateInput orderRiskAssessmentInput, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (orderRiskAssessmentInput != null || fieldsSet.contains("orderRiskAssessmentInput")) {
        getInput().put("orderRiskAssessmentInput", orderRiskAssessmentInput);
    }
  }

  public OrderRiskAssessmentCreateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "orderRiskAssessmentCreate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private OrderRiskAssessmentCreateInput orderRiskAssessmentInput;

    private String queryName;

    public OrderRiskAssessmentCreateGraphQLQuery build() {
      return new OrderRiskAssessmentCreateGraphQLQuery(orderRiskAssessmentInput, queryName, fieldsSet);
               
    }

    /**
     * The input fields required to create a risk assessment.
     */
    public Builder orderRiskAssessmentInput(
        OrderRiskAssessmentCreateInput orderRiskAssessmentInput) {
      this.orderRiskAssessmentInput = orderRiskAssessmentInput;
      this.fieldsSet.add("orderRiskAssessmentInput");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
