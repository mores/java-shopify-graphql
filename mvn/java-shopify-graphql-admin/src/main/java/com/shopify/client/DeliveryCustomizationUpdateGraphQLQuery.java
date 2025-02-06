package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.types.DeliveryCustomizationInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Updates a delivery customization.
 */
public class DeliveryCustomizationUpdateGraphQLQuery extends GraphQLQuery {
  public DeliveryCustomizationUpdateGraphQLQuery(String id,
      DeliveryCustomizationInput deliveryCustomization, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }if (deliveryCustomization != null || fieldsSet.contains("deliveryCustomization")) {
        getInput().put("deliveryCustomization", deliveryCustomization);
    }
  }

  public DeliveryCustomizationUpdateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "deliveryCustomizationUpdate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String id;

    private DeliveryCustomizationInput deliveryCustomization;

    private String queryName;

    public DeliveryCustomizationUpdateGraphQLQuery build() {
      return new DeliveryCustomizationUpdateGraphQLQuery(id, deliveryCustomization, queryName, fieldsSet);
               
    }

    /**
     * The global ID of the delivery customization.
     */
    public Builder id(String id) {
      this.id = id;
      this.fieldsSet.add("id");
      return this;
    }

    /**
     * The input data used to update the delivery customization.
     */
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
