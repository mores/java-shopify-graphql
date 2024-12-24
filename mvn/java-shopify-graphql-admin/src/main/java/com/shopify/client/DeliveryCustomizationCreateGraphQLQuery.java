package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.types.DeliveryCustomizationInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;


public class DeliveryCustomizationCreateGraphQLQuery extends GraphQLQuery {
  public DeliveryCustomizationCreateGraphQLQuery(DeliveryCustomizationInput deliveryCustomization,
      String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (deliveryCustomization != null || fieldsSet.contains("deliveryCustomization")) {
        getInput().put("deliveryCustomization", deliveryCustomization);
    }
  }

  public DeliveryCustomizationCreateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "deliveryCustomizationCreate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private DeliveryCustomizationInput deliveryCustomization;

    private String queryName;

    public DeliveryCustomizationCreateGraphQLQuery build() {
      return new DeliveryCustomizationCreateGraphQLQuery(deliveryCustomization, queryName, fieldsSet);
               
    }

    
    public Builder deliveryCustomization(DeliveryCustomizationInput deliveryCustomization) {
      this.deliveryCustomization = deliveryCustomization;
      this.fieldsSet.add("deliveryCustomization");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
