package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.DeliveryCustomizationInput;
import graphql.language.VariableDefinition;
import java.lang.Override;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Creates a delivery customization.
 */
public class DeliveryCustomizationCreateGraphQLQuery extends GraphQLQuery {
  public DeliveryCustomizationCreateGraphQLQuery(DeliveryCustomizationInput deliveryCustomization,
      String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (deliveryCustomization != null || fieldsSet.contains("deliveryCustomization")) {
        getInput().put("deliveryCustomization", deliveryCustomization);
    }
  }

  public DeliveryCustomizationCreateGraphQLQuery(DeliveryCustomizationInput deliveryCustomization,
      String queryName, Set<String> fieldsSet, Map<String, String> variableReferences,
      List<VariableDefinition> variableDefinitions) {
    super("mutation", queryName);
    if (deliveryCustomization != null || fieldsSet.contains("deliveryCustomization")) {
        getInput().put("deliveryCustomization", deliveryCustomization);
    }
    if(variableDefinitions != null) {
       getVariableDefinitions().addAll(variableDefinitions);
    }

    if(variableReferences != null) {
       getVariableReferences().putAll(variableReferences);
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

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private DeliveryCustomizationInput deliveryCustomization;

    private String queryName;

    public DeliveryCustomizationCreateGraphQLQuery build() {
      return new DeliveryCustomizationCreateGraphQLQuery(deliveryCustomization, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * The input data used to create the delivery customization.
     */
    public Builder deliveryCustomization(DeliveryCustomizationInput deliveryCustomization) {
      this.deliveryCustomization = deliveryCustomization;
      this.fieldsSet.add("deliveryCustomization");
      return this;
    }

    /**
     * The input data used to create the delivery customization.
     */
    public Builder deliveryCustomizationReference(String variableRef) {
      this.variableReferences.put("deliveryCustomization", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("DeliveryCustomizationInput"))).build());
      this.fieldsSet.add("deliveryCustomization");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
