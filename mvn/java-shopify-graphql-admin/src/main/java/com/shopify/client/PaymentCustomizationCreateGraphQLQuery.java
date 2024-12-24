package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.types.PaymentCustomizationInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;


public class PaymentCustomizationCreateGraphQLQuery extends GraphQLQuery {
  public PaymentCustomizationCreateGraphQLQuery(PaymentCustomizationInput paymentCustomization,
      String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (paymentCustomization != null || fieldsSet.contains("paymentCustomization")) {
        getInput().put("paymentCustomization", paymentCustomization);
    }
  }

  public PaymentCustomizationCreateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "paymentCustomizationCreate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private PaymentCustomizationInput paymentCustomization;

    private String queryName;

    public PaymentCustomizationCreateGraphQLQuery build() {
      return new PaymentCustomizationCreateGraphQLQuery(paymentCustomization, queryName, fieldsSet);
               
    }

    
    public Builder paymentCustomization(PaymentCustomizationInput paymentCustomization) {
      this.paymentCustomization = paymentCustomization;
      this.fieldsSet.add("paymentCustomization");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
