package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.types.PaymentCustomizationInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;


public class PaymentCustomizationUpdateGraphQLQuery extends GraphQLQuery {
  public PaymentCustomizationUpdateGraphQLQuery(String id,
      PaymentCustomizationInput paymentCustomization, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }if (paymentCustomization != null || fieldsSet.contains("paymentCustomization")) {
        getInput().put("paymentCustomization", paymentCustomization);
    }
  }

  public PaymentCustomizationUpdateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "paymentCustomizationUpdate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String id;

    private PaymentCustomizationInput paymentCustomization;

    private String queryName;

    public PaymentCustomizationUpdateGraphQLQuery build() {
      return new PaymentCustomizationUpdateGraphQLQuery(id, paymentCustomization, queryName, fieldsSet);
               
    }

    
    public Builder id(String id) {
      this.id = id;
      this.fieldsSet.add("id");
      return this;
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
